grammar Becanda;

// # Symbols

SELECT	:	'ambil';
FROM	:	'dari';
ALL		:	'semua';
AS		:	'sebagai';
WHERE	:	'di mana';

DOT		:	'.';
COMMA	:	',';
ASTERISK	:	'*';

ID		:	( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )* ;

// ## Whitespace and comments; ignore
WHITE_SPACE	: ( ' '|'\r'|'\t'|'\n' ) -> channel(HIDDEN) ;
SL_COMMENT	: ( ('--'|'#') ~('\n'|'\r')* '\r'? '\n' ) -> channel(HIDDEN) ;
ML_COMMENT	: '/*' ( . )*? '*/' -> channel(HIDDEN) ;

// # Rules

schema_name: ID;
table_name: ID;
column_name: ID;
alias: ( AS )? ID;

column_spec: ( ( schema_name DOT )? table_name DOT )? column_name ;
table_spec:	( schema_name DOT )? table_name;

select_statement:
	SELECT
		select_list
	FROM
		table_spec
	( WHERE )?
;

select_list: ( displayed_column ( COMMA displayed_column )* ) | ASTERISK | ALL;

displayed_column: column_spec;

root: select_statement;