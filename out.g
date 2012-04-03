grammar out;

options{
	output = AST;
}

properties 
	:	('rectangle'^ '('! INT ','! INT ','! INT ','! INT ')'! ';'!)
	|	('line'^ '('! INT ','! INT ','! INT ','! INT ')'! ';'!)
	|	('ellipse'^ '('! INT ','! INT ','! INT ','! INT ')'! ';'!)
	|	('polygon'^ '('! INT ','! INT (','! INT ','! INT)* ')'! ';'!)
	|	('triangle'^ '('! INT ','! INT ','! INT ','! INT ','! INT ','! INT ')'! ';'!)
	|	('arc'^ '('! INT ','! INT ','! INT ','! INT ','! INT ','! INT ')'! ';'!)
	|	('text'^ '('! INT ','! INT ','!  DEF ')'! ';'!)
	|	('textrect'^ '('! INT ','! INT ','! INT ','! INT ','!  DEF ')'! ';'!)
	|	('point'^ '('! INT ','! INT ')'! ';'!)
	|	('pixmap'^ '('! INT ','! INT ')'! ';'!)
	|	('pixmaprect'^ '('! INT ','! INT ','! INT ','! INT ')'! ';'!)
	|	NEWLINE!
	;
	
listofproperties	
	:	(properties)*;

INT	:	'0'..'9'+;
DEF 	:	QUOTE STRING QUOTE;
STRING 	:	( '0'..'9' | 'a'..'z' | 'A'..'Z' | ' ' | ':' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '.' | '±' | '+' | '-' | '_' |'×' | '\\' | '/' | '=' | '÷')*  ;
QUOTE 
	:	'"';

NEWLINE:(('\r' ?) '\n');