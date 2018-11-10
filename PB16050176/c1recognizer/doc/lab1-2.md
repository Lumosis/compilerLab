# 实验报告
## 问题
* 在设计compilationUnit文法时，发现根据文档中的相应的表述设计出的文法：
  
        CompUnit    → （CompUnit）？ ( Decl | FuncDef ) 
  
  anltr无法构造,原因是：

        error(119): C1Parser.g4::: The following sets of rules are mutually left-recursive [compilationUnit]  

    文法修改成如下，消除递归即可：

        compilationUnit: 
            (decl | funcdef)+
            ;

## 分析与设计
C1Parser.g4的设计基本沿用文档中的文法规定，少数地方稍作一些语法上的修改即可，做语法修改的几个文法如下：

    constdecl: 
        Const btype constdef (Comma constdef)* SemiColon
        ;

    constdef: 
        Identifier Assign exp
        | Identifier LeftBracket (exp)? RightBracket Assign LeftBrace exp (Comma exp)* RightBrace
        ;

    vardecl: 
        btype vardef (Comma vardef)* SemiColon
        ;

    vardef: 
        Identifier
        | Identifier LeftBracket exp RightBracket
        | Identifier Assign exp
        | Identifier LeftBracket (exp)? RightBracket Assign LeftBrace exp (Comma exp)* RightBrace
        ;

    stmt: 
        lval Assign exp SemiColon
        | Identifier LeftParen RightParen SemiColon
        | block
        | If LeftParen cond RightParen stmt (Else stmt)?
        | While LeftParen cond RightParen stmt
        | SemiColon
        ;

值得注意的是，C1Parser.g4初始文件中给出的exp文法不完整，需要加上lval