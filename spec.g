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
	|	'=='
	|	'.'
	;

// Basic geometric shapes that can be used
shape	:	'rectangle'
	|	'triangle'
	|	'ellipse'
	|	'polygon'
	|	'text'
	|	'textrect'
	|	'polyline'
	;
// User defined properties for the spec object
PROPERTY:	'X'
	|	'Y'
	|	'WIDTH'
	|	'HEIGHT'
	;
	
	
// Definition for integer
INT	:	('1'..'9')+
	;

// Definition for variable ID, this can be used as the ID of the defined object or the other instantiated objects
ID	:	('a'..'z'|'\_') ('a'..'z'|'0'..'9'|'\_')*
	;
	
// Definition for whitespace
WS	:	' '
	;
// Definition for TAB!
TAB	:	'\t'
	;
// Definition for new line
NEWLINE	:	'\n'
	;
	
////////////////////////////////////////////////
// Rules Definitions
////////////////////////////////////////////////

// Used to access member variable
membervariableaccess
	:	(ID '.'^ ID)
	;
// Used to declaring variables
variablesdecl
	:	(NEWLINE! TAB! TAB! shape^ WS! ID (','! WS! ID)*';'!);
// Used when setting the property, ex: width = l1.x2 - l1.x1
expression
	:	membervariableaccess (OPERATOR^ membervariableaccess)*
	;
propertiesdecl
	:	(TAB! TAB! PROPERTY^ WS! '='! WS! expression ';'! NEWLINE!);
// Used for declaring constraints recursively
constraintsdecl
	:	'('! constraintsdecl WS! OPERATOR^ WS! constraintsdecl ')'!
	|	membervariableaccess
	|	ID
	|	INT
	|	'\"' (ID|INT) '\"'
	;
	
	
// This will be the main rule used to read the specification input
specobjects
	:	specobject (NEWLINE!* specobject)* (NEWLINE!*)
	;

specobject
	:	(ID^ WS! '='! WS! '{'!
		NEWLINE!
			variables
			NEWLINE!
			properties
			NEWLINE!
			constraints
			NEWLINE!
		'}'!)
	;

variables
	:	(TAB! 'variables'^ WS! '{'!
			variablesdecl*
			NEWLINE!
		TAB! '}'!)
	;
properties
	:	(TAB! 'properties'^ WS! '{'!
			NEWLINE!
			propertiesdecl*

		TAB! '}'!)
	;
constraints
	:	(TAB! 'constraints'^ WS! '{'!
			NEWLINE!
			TAB! TAB! constraintsdecl ';'!
			NEWLINE!
		TAB! '}'!)
	;

