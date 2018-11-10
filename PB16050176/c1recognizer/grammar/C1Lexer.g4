lexer grammar C1Lexer;

tokens {
    Comma,
    SemiColon,
    Assign,
    LeftBracket,
    RightBracket,
    LeftBrace,
    RightBrace,
    LeftParen,
    RightParen,
    If,
    Else,
    While,
    Const,
    Equal,
    NonEqual,
    Less,
    Greater,
    LessEqual,
    GreaterEqual,
    Plus,
    Minus,
    Multiply,
    Divide,
    Modulo,

    Int,
    Float,
    Void,

    Identifier,
    IntConst,
    FloatConst
}

Comma: ',';
SemiColon: ';';
Assign: '=';
LeftBracket: '[';
RightBracket: ']';
LeftBrace: '{';
RightBrace: '}';
If: 'if';
Else: 'else';
While: 'while';
Equal: '==';
NonEqual: '!=';
Less: '<';
Greater: '>';
LessEqual: '<=';
GreaterEqual: '>=';



LeftParen: '(';
RightParen: ')';

Plus: '+' ;
Minus: '-' ;
Multiply: '*' ;
Divide: '/' ;
Modulo: '%' ;
Int: 'int';
Float: 'float';
Void: 'void';
Const: 'const';

Identifier: Identifier_Nondigit ((All_char)+)?;
fragment All_char: Nondigit | Digit;
fragment Identifier_Nondigit: Nondigit;
fragment Nondigit: [a-zA-Z_];

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

Comment1: Up All Down -> skip;
fragment Up:'/*';
fragment Down:'*/';
fragment All: .*?;
Comment2: Comment Line* Line2 -> skip;
fragment Line_break: '\\';
fragment Line: Non_LB Line_break Newline;
fragment Line2: Non_LB Newline;
fragment Non_LB: ~[\r\n]*?;
fragment Comment: '//';
Comment3: '/' Line_break Newline '/' Line* Line2 -> skip;

Newline: '\r'? '\n' -> skip;
WhiteSpace: [ \t]+ -> skip;
