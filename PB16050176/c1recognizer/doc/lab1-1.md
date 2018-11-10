# 实验报告  
## 问题  
* 在描述注释时，多行注释描述出现困难。后将所有注释分成三类情况，分别描述，得以解决。  
* 一开始字符串中的注释符号也会识别。后采取定义String的token来把引号内的内容识别为String,避免识别引号内的注释符号。    
* 文档中给出的第二类双行注释总是识别不了，后来发现是第二行一开始有缩进，删掉缩进即可识别。 
  
## 分析与设计  
### Identifier & Const  
Identifier本质上就是第一个字符非数字的字符串，根据ISO标准设计如下：  
  
        Identifier: Identifier_Nondigit ((All_char)+)?;
        fragment All_char: Nondigit | Digit;
        fragment Identifier_Nondigit: Nondigit;
        fragment Nondigit: [a-zA-Z_];    

  
数字常量分为整型和浮点型，整形又分为十进制、八进制和十六进制。  

整型常量设计时注意将三种进制分开设计，再用"|"号连接，设计如下：  
  
        IntConst: 
            Dec_const
            |   Oct_const
            |   Hex_const;
        fragment Dec_const: Nonzero_digit ((Digit)+)?;
        fragment Oct_const: '0' ((Oct_digit)+)?;
        fragment Hex_const: Hex_pre Hex_digit+;
        fragment Hex_pre: '0x' | '0X';
        fragment Hex_digit: [0-9a-fA-F];
        fragment Oct_digit: [0-7];
        fragment Nonzero_digit: [1-9];  
  
浮点型常量较复杂，根据ISO定义注意不同形式的变种，设计如下： 
  
        FloatConst:
            Fra_const Expo_part?
            |   Digit_seq Expo_part;
        fragment Fra_const: 
            (Digit_seq)? '.' (Digit_seq)
            |   (Digit_seq) '.';
        fragment Expo_part:
            'e' Sign? Digit_seq
            | 'E' Sign? Digit_seq;
        fragment Sign: '+' | '-';
        fragment Digit_seq: Digit+;
        fragment Digit: [0-9];  
  
  

### Comment  
注释设计较复杂，大致分为了三种情况，Comment1、Comment2和Comment3。  

* Comment1：形如/\*....\*/的注释，较简单，设计如下： 
 
        Comment1: Up All Down -> skip;
        fragment Up:'/*';
        fragment Down:'*/';
        fragment All: .*?;   
        
* Comment2：形如：  
 
            //string1\
            string2\
            string3\
            string4  
    设计如下：  

            Comment2: Comment Line* Line2 -> skip;
            fragment Line_break: '\\';
            fragment Line: Non_LB Line_break Newline;
            fragment Line2: Non_LB Newline;
            fragment Non_LB: ~[\r\n]*?;
            fragment Comment: '//';  
    其中Line代表string1、string2、string3，注意换行符要用 '\\\\' 来识别Line2代表string4，不需要识别换行符。

* Comment3：形如:  
  
            /\
            /string1\
            string2\
            string3  
    设计如下：  

            Comment3: '/' Line_break Newline '/' Line* Line2 -> skip;  
    Line、Line2和Line_break以及Newline定义同Comment2。  
  
### Others  
其他还有空格和换行的识别，设计如下：  

            Newline: '\r'? '\n' -> skip;
            WhiteSpace: [ \t]+ -> skip;

