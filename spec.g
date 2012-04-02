grammar spec;

options{
	output = AST;
}

////////////////////////////////////////////////
// Tokens Definitions
////////////////////////////////////////////////

// Operators that can be used with the language:
OPERATOR:
	// positional operator:
		'leftto'
	|	'rightto'
	|	'above'
	|	'below'
	|	'contains'
	|	'over'
	|	'smaller'
	|	'leftaligned'
	|	'rightaligned'
	|	'topaligned'
	|	'bottomaligned'
	
	// string operators
	|	'textsubstring'
	|	'textsmaller'
	|	'textconcatenate'
	
	// logic operators
	|	'and'
	|	'or'
	|	'xor'
	
	// arithmetic operators
	|	'+'
	|	'-'
	|	'*'
	|	'/' 
	
	// other
	|	'='
	|	'.'
	;

// Definition for integer
INT	:	('1'..'9')+
	;

// Definition for variable ID, this can be used as the ID of the defined object or the other instantiated objects
ID	:	('a'..'z'|'\_') ('a'..'z'|'0'..'9'|'\_')+
	;
	
// Definition for whitespace
WS	:	' '
	;
// Definition for tab
TAB	:	'\t'
	;
// Definition for new line
NEWLINE	:	'\n'
	;
	
////////////////////////////////////////////////
// Rules Definitions
////////////////////////////////////////////////
specobjects
	:	specobject*
	;

specobject
	:	'specobject'
	;


variables
	:	'variables'
	;
properties
	:	'properties'
	;
constraints
	:	'constraints';

