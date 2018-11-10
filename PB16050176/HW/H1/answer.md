# 作业2  
源代码在H1/c目录中

## 不同编译选项下输出的代码文件
> gcc -E test.c -m32 -o test32.i  
生成*test32.i*  
  
> gcc -E test.c -m64 -o test64.i  
生成*test64.i*  
  
> gcc -S test32.i -m32 -o test32.asm  
生成*test32.asm*  
  
> gcc -S test64.i -m64 -o test64.asm  
生成*test64.asm*  
  
> gcc -c test.c -m32 -o test32.o  
生成*test32.o*  
  
> gcc -c test.c -m64 -o test64.o  
生成*test64.o*  

> gcc -o test32 -m32 test.c  
生成*test32*  
  
> gcc -o test32 -m32 test.c  
生成*test32*  
    

  
## 类型的变换  
  
* test.c 经过预处理(-m32 -E)生成test32.i, 经过预处理和编译(-S -m32)生成32位机器下的汇编码test32.asm，经过预处理、编译和汇编(-c -m32)生成32位机器下的obj文件test32.o，经过预处理、编译、汇编和链接生成32位机器下的可执行文件  
  
* test.c 经过预处理(-m64 -E)生成test64.i, 经过预处理和编译(-S -m64)生成64位机器下的汇编码test64.asm，经过预处理、编译和汇编(-c -m64)生成64位机器下的obj文件test64.o，经过预处理、编译、汇编和链接生成64位机器下的可执行文件  
  
  
* c语言的预处理主要包含三个方面的内容：１．宏定义　２．文件包含　３．条件编译  
  
* 汇编码注释加在相应的汇编文件中

## 汇编码注释
64位机器的汇编码主要部分如下：
main:
.LFB0:
	.cfi_startproc              #调用框架指令 标志函数开始
	pushq	%rbp                #rbp入栈
	.cfi_def_cfa_offset 16      #此处距离CFA地址为16字节
	.cfi_offset 6, -16          #把六号寄存器原先的值保存在距离CFA -16的位置
	movq	%rsp, %rbp          #把rsp的值拷贝至rbp
	.cfi_def_cfa_register 6     #使用六号寄存器作为CFA的基址寄存器
	movl	$.LC0, %edi         #把.LC0的值拷贝至edi
	call	puts                #调用服务 将字符串输出 printf("Hello World\n");
	nop
	popq	%rbp                #栈顶元素出栈
	.cfi_def_cfa 7, 8           #重新定义CFA 它的值是7号寄存器所指位置加4字节
	ret
	.cfi_endproc                #函数结束


32位机器的汇编码主要部分如下：
main:
.LFB0:
	.cfi_startproc                      #函数开始
	leal	4(%esp), %ecx               #ecx=esp+4
	.cfi_def_cfa 1, 0                   #重新定义CFA 它的值是1号寄存器所指位置
	andl	$-16, %esp                  #esp=esp&&-16
	pushl	-4(%ecx)                    
	pushl	%ebp                        #入栈
	.cfi_escape 0x10,0x5,0x2,0x75,0     
	movl	%esp, %ebp                  #将esp的值拷贝至ebp
	pushl	%ecx                        #ecx入栈
	.cfi_escape 0xf,0x3,0x75,0x7c,0x6
	subl	$4, %esp                    #esp=esp-4
	subl	$12, %esp                   #esp=esp-12
	pushl	$.LC0                       #.LC0入栈
	call	puts                        #调用服务 输出“Hello World！”  printf("Hello World\n");
	addl	$16, %esp                   #esp=esp+16
	nop
	movl	-4(%ebp), %ecx 
	.cfi_def_cfa 1, 0                   #重新定义CFA 它的值是1号寄存器所指位置
	leave
	.cfi_restore 5                      #恢复5号寄存器的值
	leal	-4(%ecx), %esp              #esp=ecx-4
	.cfi_def_cfa 4, 4                   #重新定义CFA 它的值是4号寄存器所指位置加4字节
	ret
	.cfi_endproc                        #函数结束



# 作业3 
## 主要考虑  
这道题主要思想来源于课件19页的状态转换图，基本上是这张图的代码实现，只需要注意在某些状态下需要指针的回退即可。  
  
问题：<==><和a<=b的识别过程  
1.首先处于状态0，读入字符为<，进入状态1,读入字符为=，进入状态2，在状态2时，读入字符为=，首先输出识别结果“<=”,然后指针回退，进入状态0，重新开始。 
读入字符为=，进入状态5，在状态5时，读入字符为>,先输出识别结果“=”,然后指针回退，进入状态0。  
读入字符为>,进入状态6，读入字符为<,(为other),先回退，进入状态8，在状态8时，读入字符为<,先回退,输出识别结果“>”,进入状态0。  
读入字符为<,进入状态1,文件读完，输出识别结果“<”,结束。  
  
2.首现处于状态0，读入字符a，跳过，读入字符<，进入状态1,读入字符=，进入状态2，处于状态2时，读入字符b，先回退，输出识别结果“<=”，进入状态0，读入字符b，跳过，文件读完。  

  
## 问题及解决  
文件明明读完了,feof()函数却依然返回0，只有再往下读一个字符，feof()才返回非0.  
解决：在if(feof(stream) != 0)前后分别加上 fgetc(stream)和fseek(stream, -1, SEEK_CUR);