grammar Indsql;

// # Symbols

SELECT          : 'ambil';
UPDATE          : 'perbarui';
DELETE          : 'hapus';
INSERT          : 'masukkan';
FROM            : 'dari';
ORDER           : 'terurut';
GROUP           : 'terkelompokkan';
BY              : 'berdasarkan';
ASC             : 'naik';
DESC            : 'turun';
SET             : 'ubah';
INTO            : 'ke dalam';
ROWS            : 'baris-baris';
ALL             : 'semua';
AS              : 'sebagai';
WHERE           : 'di mana';
AND             : 'dan';
OR              : 'atau';

DOT             : '.';
COMMA           : ',';
ASTERISK        : '*';
EQ_SYM          : '=';
NEQ_SYM         : '!=';
GT_SYM          : '>';
LT_SYM          : '<';

INTEGER_NUM     : ('0'..'9')+;
TEXT_STRING     :
    (
        (  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  )
        |
        (  '\"' ( ('\\' '\\') | ('\"' '\"') | ('\\' '\"') | ~('\"') )* '\"'  ) 
    )
;

ID              : ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )* ;

// ## Whitespace and comments; ignore
WHITE_SPACE     : ( ' '|'\r'|'\t'|'\n' ) -> channel(HIDDEN) ;
SL_COMMENT      : ( ('--'|'#') ~('\n'|'\r')* '\r'? '\n' ) -> channel(HIDDEN) ;
ML_COMMENT      : '/*' ( . )*? '*/' -> channel(HIDDEN) ;

// # Rules

// ## Identifiers
schema_name: ID;
table_name: ID;
column_name: ID;
alias: ( AS )? ID;
column_spec: ( ( schema_name DOT )? table_name DOT )? column_name ;
table_spec: ( schema_name DOT )? table_name;

// ## Expressions
expression: expr1 (OR expr1)*;
expr1: expr2 (AND expr2)*;
expr2: predicate relational_op predicate | literal_value;
predicate: column_spec | literal_value;
relational_op: EQ_SYM | NEQ_SYM | GT_SYM | LT_SYM;
literal_value: TEXT_STRING | INTEGER_NUM;

// ## Statements
root:
    select_statement |
    update_statement |
    delete_statement |
    insert_statement
;

// ### Select statement
select_statement:
    SELECT
        select_list
    FROM
        table_spec
    (
        WHERE
            expression
    )?
    (
        GROUP
        BY
            select_group_by
    )?
    (
        ORDER
        BY
            select_order_by
    )?
;
select_list: (displayed_column (COMMA displayed_column)*) | ASTERISK | ALL;
displayed_column: column_spec;
select_field_list: displayed_column (COMMA displayed_column)*;
select_group_by: select_field_list;
select_order_by: select_field_list select_order;
select_order: ASC | DESC;

// ### Update statement
update_statement:
    UPDATE
        table_spec
    SET
        update_list
    (WHERE expression)?
;
update_list: update_atom (COMMA update_atom)*;
update_atom: column_spec EQ_SYM literal_value;

// ### Delete statement
delete_statement:
    DELETE
    FROM
        table_spec
    (WHERE expression)?
;

// ### Insert statement
insert_statement:
    INSERT
    INTO
        table_spec
        insert_field_list
    ROWS
        insert_list
;
insert_field_list: '(' column_name (COMMA column_name)* ')';
insert_list: insert_row (COMMA insert_row)*;
insert_row: '(' literal_value (COMMA literal_value)* ')';