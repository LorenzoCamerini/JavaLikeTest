grammar JavaLikeToAst;


options { 
    output = AST;
}

tokens { 
    PROGRAM; DECL; CALL; 
}

compilationUnit : statement* EOF -> ^(PROGRAM statement*);
statement       : decl;
decl            : VAR ID EQ expr -> ^(DECL ID expr);
expr            : add_expr;
add_expr        : mul_expr ((PLUS|MINUS)^ mul_expr)*;
mul_expr        : call_expr ((STAR|DIV)^ call_expr)*;
call_expr       : ID LPAR arglist? RPAR -> ^(CALL ID arglist?)
                | primary_expr;
arglist         : expr (COMMA! expr)*;
primary_expr    : ID | INT | LPAR! expr RPAR!; 

VAR     : 'var';
ID      : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
INT     : ('0'..'9')+;
COMMA   : ',';
SEMI    : ';';
LCUR    : '{';
RCUR    : '}';
LPAR    : '(';
RPAR    : ')';
EQ      : '=';
PLUS    : '+';
MINUS   : '-';
STAR    : '*';
DIV     : '/';
WS      : (' '|'\t'|'\f'|'\r'|'\n'){skip();};