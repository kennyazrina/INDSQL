grammar Indsql;

// # Symbols

SELECT          : 'ambil';
FROM            : 'dari';
ALL             : 'semua';
AS              : 'sebagai';
WHERE           : 'di mana';
AND             : 'dan';
OR				: 'atau';

DOT             : '.';
COMMA           : ',';
ASTERISK        : '*';
EQ_SYM		        : '=';
NEQ_SYM				: '!=';
GT_SYM              : '>';
LT_SYM              : '<';

INTEGER_NUM     : ('0'..'9')+;
TEXT_STRING:
	(
		(  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  )
		|
		(  '\"' ( ('\\' '\\') | ('\"' '\"') | ('\\' '\"') | ~('\"') )* '\"'  ) 
	)
;

ID              : ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )* ;

// ## Whitespace and comments; ignore
WHITE_SPACE	: ( ' '|'\r'|'\t'|'\n' ) -> channel(HIDDEN) ;
SL_COMMENT	: ( ('--'|'#') ~('\n'|'\r')* '\r'? '\n' ) -> channel(HIDDEN) ;
ML_COMMENT	: '/*' ( . )*? '*/' -> channel(HIDDEN) ;

// # Rules

// ## Identifiers
schema_name: ID;
table_name: ID;
column_name: ID;
alias: ( AS )? ID;
column_spec: ( ( schema_name DOT )? table_name DOT )? column_name ;
table_spec:	( schema_name DOT )? table_name;

// ## Expressions
expression: expr1 (OR expr1)*;
expr1: expr2 (AND expr2)*;
expr2: predicate relational_op predicate | literal_value;
predicate: column_spec | literal_value;
relational_op: EQ_SYM | NEQ_SYM | GT_SYM | LT_SYM;
literal_value: TEXT_STRING | INTEGER_NUM;

// ## Select statement
select_statement:
	SELECT
		select_list
	FROM
		table_spec
	(WHERE expression)?
;

select_list: (displayed_column (COMMA displayed_column)*) | ASTERISK | ALL;

displayed_column: column_spec;

root: select_statement;