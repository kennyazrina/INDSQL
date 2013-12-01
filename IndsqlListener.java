// Generated from Indsql.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IndsqlParser}.
 */
public interface IndsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_statement(@NotNull IndsqlParser.Create_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_statement(@NotNull IndsqlParser.Create_database_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull IndsqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull IndsqlParser.Expression_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#multiple_table_update_statement}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_table_update_statement(@NotNull IndsqlParser.Multiple_table_update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#multiple_table_update_statement}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_table_update_statement(@NotNull IndsqlParser.Multiple_table_update_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#update_statements}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statements(@NotNull IndsqlParser.Update_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#update_statements}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statements(@NotNull IndsqlParser.Update_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull IndsqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull IndsqlParser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_statement(@NotNull IndsqlParser.Drop_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_statement(@NotNull IndsqlParser.Drop_view_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#search_modifier}.
	 * @param ctx the parse tree
	 */
	void enterSearch_modifier(@NotNull IndsqlParser.Search_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#search_modifier}.
	 * @param ctx the parse tree
	 */
	void exitSearch_modifier(@NotNull IndsqlParser.Search_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_column_names}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_names(@NotNull IndsqlParser.Index_column_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_column_names}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_names(@NotNull IndsqlParser.Index_column_namesContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#handler_statement1}.
	 * @param ctx the parse tree
	 */
	void enterHandler_statement1(@NotNull IndsqlParser.Handler_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#handler_statement1}.
	 * @param ctx the parse tree
	 */
	void exitHandler_statement1(@NotNull IndsqlParser.Handler_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull IndsqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull IndsqlParser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#handler_statement2}.
	 * @param ctx the parse tree
	 */
	void enterHandler_statement2(@NotNull IndsqlParser.Handler_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#handler_statement2}.
	 * @param ctx the parse tree
	 */
	void exitHandler_statement2(@NotNull IndsqlParser.Handler_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#handler_statement3}.
	 * @param ctx the parse tree
	 */
	void enterHandler_statement3(@NotNull IndsqlParser.Handler_statement3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#handler_statement3}.
	 * @param ctx the parse tree
	 */
	void exitHandler_statement3(@NotNull IndsqlParser.Handler_statement3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(@NotNull IndsqlParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(@NotNull IndsqlParser.Relational_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#replace_statement}.
	 * @param ctx the parse tree
	 */
	void enterReplace_statement(@NotNull IndsqlParser.Replace_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#replace_statement}.
	 * @param ctx the parse tree
	 */
	void exitReplace_statement(@NotNull IndsqlParser.Replace_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(@NotNull IndsqlParser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(@NotNull IndsqlParser.FunctionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_server_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_option(@NotNull IndsqlParser.Create_server_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_server_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_option(@NotNull IndsqlParser.Create_server_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#match_against_statement}.
	 * @param ctx the parse tree
	 */
	void enterMatch_against_statement(@NotNull IndsqlParser.Match_against_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#match_against_statement}.
	 * @param ctx the parse tree
	 */
	void exitMatch_against_statement(@NotNull IndsqlParser.Match_against_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_statement(@NotNull IndsqlParser.Create_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_statement(@NotNull IndsqlParser.Create_server_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(@NotNull IndsqlParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(@NotNull IndsqlParser.Alter_table_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#insert_subfix}.
	 * @param ctx the parse tree
	 */
	void enterInsert_subfix(@NotNull IndsqlParser.Insert_subfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#insert_subfix}.
	 * @param ctx the parse tree
	 */
	void exitInsert_subfix(@NotNull IndsqlParser.Insert_subfixContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_hint_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_hint_list(@NotNull IndsqlParser.Index_hint_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_hint_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_hint_list(@NotNull IndsqlParser.Index_hint_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void enterColumn_spec(@NotNull IndsqlParser.Column_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void exitColumn_spec(@NotNull IndsqlParser.Column_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void enterReference_option(@NotNull IndsqlParser.Reference_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void exitReference_option(@NotNull IndsqlParser.Reference_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_factor1}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor1(@NotNull IndsqlParser.Table_factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_factor1}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor1(@NotNull IndsqlParser.Table_factor1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_factor3}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor3(@NotNull IndsqlParser.Table_factor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_factor3}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor3(@NotNull IndsqlParser.Table_factor3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_factor2}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor2(@NotNull IndsqlParser.Table_factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_factor2}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor2(@NotNull IndsqlParser.Table_factor2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expr(@NotNull IndsqlParser.Interval_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expr(@NotNull IndsqlParser.Interval_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_factor4}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor4(@NotNull IndsqlParser.Table_factor4Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_factor4}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor4(@NotNull IndsqlParser.Table_factor4Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(@NotNull IndsqlParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(@NotNull IndsqlParser.Simple_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#replace_statement_header}.
	 * @param ctx the parse tree
	 */
	void enterReplace_statement_header(@NotNull IndsqlParser.Replace_statement_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#replace_statement_header}.
	 * @param ctx the parse tree
	 */
	void exitReplace_statement_header(@NotNull IndsqlParser.Replace_statement_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_table_statement3}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement3(@NotNull IndsqlParser.Create_table_statement3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_table_statement3}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement3(@NotNull IndsqlParser.Create_table_statement3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_table_statement2}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement2(@NotNull IndsqlParser.Create_table_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_table_statement2}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement2(@NotNull IndsqlParser.Create_table_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_table_statement1}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement1(@NotNull IndsqlParser.Create_table_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_table_statement1}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement1(@NotNull IndsqlParser.Create_table_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void enterPartition_names(@NotNull IndsqlParser.Partition_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void exitPartition_names(@NotNull IndsqlParser.Partition_namesContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#subpartition_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_definition(@NotNull IndsqlParser.Subpartition_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#subpartition_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_definition(@NotNull IndsqlParser.Subpartition_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#drop_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_statement(@NotNull IndsqlParser.Drop_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#drop_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_statement(@NotNull IndsqlParser.Drop_database_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(@NotNull IndsqlParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(@NotNull IndsqlParser.Drop_table_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(@NotNull IndsqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(@NotNull IndsqlParser.Column_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(@NotNull IndsqlParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(@NotNull IndsqlParser.User_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_event_statement(@NotNull IndsqlParser.Alter_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_event_statement(@NotNull IndsqlParser.Alter_event_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(@NotNull IndsqlParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(@NotNull IndsqlParser.Limit_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#transcoding_name}.
	 * @param ctx the parse tree
	 */
	void enterTranscoding_name(@NotNull IndsqlParser.Transcoding_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#transcoding_name}.
	 * @param ctx the parse tree
	 */
	void exitTranscoding_name(@NotNull IndsqlParser.Transcoding_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull IndsqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull IndsqlParser.Function_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#drop_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_statement(@NotNull IndsqlParser.Drop_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#drop_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_statement(@NotNull IndsqlParser.Drop_event_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(@NotNull IndsqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(@NotNull IndsqlParser.Select_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#engine_name}.
	 * @param ctx the parse tree
	 */
	void enterEngine_name(@NotNull IndsqlParser.Engine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#engine_name}.
	 * @param ctx the parse tree
	 */
	void exitEngine_name(@NotNull IndsqlParser.Engine_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_statement(@NotNull IndsqlParser.Alter_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_statement(@NotNull IndsqlParser.Alter_view_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull IndsqlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull IndsqlParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_database_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_specification(@NotNull IndsqlParser.Alter_database_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_database_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_specification(@NotNull IndsqlParser.Alter_database_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#bool_primary}.
	 * @param ctx the parse tree
	 */
	void enterBool_primary(@NotNull IndsqlParser.Bool_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#bool_primary}.
	 * @param ctx the parse tree
	 */
	void exitBool_primary(@NotNull IndsqlParser.Bool_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_hint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_hint(@NotNull IndsqlParser.Index_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_hint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_hint(@NotNull IndsqlParser.Index_hintContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table_statement(@NotNull IndsqlParser.Truncate_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table_statement(@NotNull IndsqlParser.Truncate_table_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void enterCharset_name(@NotNull IndsqlParser.Charset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void exitCharset_name(@NotNull IndsqlParser.Charset_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_item(@NotNull IndsqlParser.Orderby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_item(@NotNull IndsqlParser.Orderby_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#handler_statements}.
	 * @param ctx the parse tree
	 */
	void enterHandler_statements(@NotNull IndsqlParser.Handler_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#handler_statements}.
	 * @param ctx the parse tree
	 */
	void exitHandler_statements(@NotNull IndsqlParser.Handler_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void enterInterval_unit(@NotNull IndsqlParser.Interval_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void exitInterval_unit(@NotNull IndsqlParser.Interval_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_value_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_value_list(@NotNull IndsqlParser.Column_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_value_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_value_list(@NotNull IndsqlParser.Column_value_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(@NotNull IndsqlParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(@NotNull IndsqlParser.TimestampContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#server_name}.
	 * @param ctx the parse tree
	 */
	void enterServer_name(@NotNull IndsqlParser.Server_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#server_name}.
	 * @param ctx the parse tree
	 */
	void exitServer_name(@NotNull IndsqlParser.Server_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#time_functions}.
	 * @param ctx the parse tree
	 */
	void enterTime_functions(@NotNull IndsqlParser.Time_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#time_functions}.
	 * @param ctx the parse tree
	 */
	void exitTime_functions(@NotNull IndsqlParser.Time_functionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(@NotNull IndsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(@NotNull IndsqlParser.Having_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#drop_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_statement(@NotNull IndsqlParser.Drop_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#drop_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_statement(@NotNull IndsqlParser.Drop_index_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#insert_statement1}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement1(@NotNull IndsqlParser.Insert_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#insert_statement1}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement1(@NotNull IndsqlParser.Insert_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#insert_statement2}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement2(@NotNull IndsqlParser.Insert_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#insert_statement2}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement2(@NotNull IndsqlParser.Insert_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(@NotNull IndsqlParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(@NotNull IndsqlParser.Column_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#insert_statement3}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement3(@NotNull IndsqlParser.Insert_statement3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#insert_statement3}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement3(@NotNull IndsqlParser.Insert_statement3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_view_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_body(@NotNull IndsqlParser.Create_view_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_view_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_body(@NotNull IndsqlParser.Create_view_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull IndsqlParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull IndsqlParser.LengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#lock_option}.
	 * @param ctx the parse tree
	 */
	void enterLock_option(@NotNull IndsqlParser.Lock_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#lock_option}.
	 * @param ctx the parse tree
	 */
	void exitLock_option(@NotNull IndsqlParser.Lock_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#event_name}.
	 * @param ctx the parse tree
	 */
	void enterEvent_name(@NotNull IndsqlParser.Event_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#event_name}.
	 * @param ctx the parse tree
	 */
	void exitEvent_name(@NotNull IndsqlParser.Event_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_specification(@NotNull IndsqlParser.Create_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_specification(@NotNull IndsqlParser.Create_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#bit_literal}.
	 * @param ctx the parse tree
	 */
	void enterBit_literal(@NotNull IndsqlParser.Bit_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#bit_literal}.
	 * @param ctx the parse tree
	 */
	void exitBit_literal(@NotNull IndsqlParser.Bit_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#foreign_key_symbol_name}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_symbol_name(@NotNull IndsqlParser.Foreign_key_symbol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#foreign_key_symbol_name}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_symbol_name(@NotNull IndsqlParser.Foreign_key_symbol_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#set_column_cluase}.
	 * @param ctx the parse tree
	 */
	void enterSet_column_cluase(@NotNull IndsqlParser.Set_column_cluaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#set_column_cluase}.
	 * @param ctx the parse tree
	 */
	void exitSet_column_cluase(@NotNull IndsqlParser.Set_column_cluaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#partition_definition}.
	 * @param ctx the parse tree
	 */
	void enterPartition_definition(@NotNull IndsqlParser.Partition_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#partition_definition}.
	 * @param ctx the parse tree
	 */
	void exitPartition_definition(@NotNull IndsqlParser.Partition_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor7}.
	 * @param ctx the parse tree
	 */
	void enterFactor7(@NotNull IndsqlParser.Factor7Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor7}.
	 * @param ctx the parse tree
	 */
	void exitFactor7(@NotNull IndsqlParser.Factor7Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor6}.
	 * @param ctx the parse tree
	 */
	void enterFactor6(@NotNull IndsqlParser.Factor6Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor6}.
	 * @param ctx the parse tree
	 */
	void exitFactor6(@NotNull IndsqlParser.Factor6Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor5}.
	 * @param ctx the parse tree
	 */
	void enterFactor5(@NotNull IndsqlParser.Factor5Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor5}.
	 * @param ctx the parse tree
	 */
	void exitFactor5(@NotNull IndsqlParser.Factor5Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(@NotNull IndsqlParser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(@NotNull IndsqlParser.Groupby_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor4}.
	 * @param ctx the parse tree
	 */
	void enterFactor4(@NotNull IndsqlParser.Factor4Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor4}.
	 * @param ctx the parse tree
	 */
	void exitFactor4(@NotNull IndsqlParser.Factor4Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_clause(@NotNull IndsqlParser.Partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_clause(@NotNull IndsqlParser.Partition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor3}.
	 * @param ctx the parse tree
	 */
	void enterFactor3(@NotNull IndsqlParser.Factor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor3}.
	 * @param ctx the parse tree
	 */
	void exitFactor3(@NotNull IndsqlParser.Factor3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor2}.
	 * @param ctx the parse tree
	 */
	void enterFactor2(@NotNull IndsqlParser.Factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor2}.
	 * @param ctx the parse tree
	 */
	void exitFactor2(@NotNull IndsqlParser.Factor2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#factor1}.
	 * @param ctx the parse tree
	 */
	void enterFactor1(@NotNull IndsqlParser.Factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#factor1}.
	 * @param ctx the parse tree
	 */
	void exitFactor1(@NotNull IndsqlParser.Factor1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#case_when_statement2}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_statement2(@NotNull IndsqlParser.Case_when_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#case_when_statement2}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_statement2(@NotNull IndsqlParser.Case_when_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#partition_options}.
	 * @param ctx the parse tree
	 */
	void enterPartition_options(@NotNull IndsqlParser.Partition_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#partition_options}.
	 * @param ctx the parse tree
	 */
	void exitPartition_options(@NotNull IndsqlParser.Partition_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#case_when_statement1}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_statement1(@NotNull IndsqlParser.Case_when_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#case_when_statement1}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_statement1(@NotNull IndsqlParser.Case_when_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_statement(@NotNull IndsqlParser.Create_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_statement(@NotNull IndsqlParser.Create_view_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull IndsqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull IndsqlParser.View_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_references}.
	 * @param ctx the parse tree
	 */
	void enterTable_references(@NotNull IndsqlParser.Table_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_references}.
	 * @param ctx the parse tree
	 */
	void exitTable_references(@NotNull IndsqlParser.Table_referencesContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(@NotNull IndsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(@NotNull IndsqlParser.Select_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull IndsqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull IndsqlParser.Literal_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(@NotNull IndsqlParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(@NotNull IndsqlParser.Number_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_definition(@NotNull IndsqlParser.Create_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_definition(@NotNull IndsqlParser.Create_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void enterHex_literal(@NotNull IndsqlParser.Hex_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void exitHex_literal(@NotNull IndsqlParser.Hex_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_type}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type(@NotNull IndsqlParser.Index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_type}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type(@NotNull IndsqlParser.Index_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull IndsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull IndsqlParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#cast_data_type}.
	 * @param ctx the parse tree
	 */
	void enterCast_data_type(@NotNull IndsqlParser.Cast_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#cast_data_type}.
	 * @param ctx the parse tree
	 */
	void exitCast_data_type(@NotNull IndsqlParser.Cast_data_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(@NotNull IndsqlParser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(@NotNull IndsqlParser.Select_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_server_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_option(@NotNull IndsqlParser.Alter_server_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_server_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_option(@NotNull IndsqlParser.Alter_server_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#replace_statement2}.
	 * @param ctx the parse tree
	 */
	void enterReplace_statement2(@NotNull IndsqlParser.Replace_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#replace_statement2}.
	 * @param ctx the parse tree
	 */
	void exitReplace_statement2(@NotNull IndsqlParser.Replace_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_list(@NotNull IndsqlParser.Index_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_list(@NotNull IndsqlParser.Index_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#replace_statement3}.
	 * @param ctx the parse tree
	 */
	void enterReplace_statement3(@NotNull IndsqlParser.Replace_statement3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#replace_statement3}.
	 * @param ctx the parse tree
	 */
	void exitReplace_statement3(@NotNull IndsqlParser.Replace_statement3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#replace_statement1}.
	 * @param ctx the parse tree
	 */
	void enterReplace_statement1(@NotNull IndsqlParser.Replace_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#replace_statement1}.
	 * @param ctx the parse tree
	 */
	void exitReplace_statement1(@NotNull IndsqlParser.Replace_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull IndsqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull IndsqlParser.Column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#number_functions}.
	 * @param ctx the parse tree
	 */
	void enterNumber_functions(@NotNull IndsqlParser.Number_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#number_functions}.
	 * @param ctx the parse tree
	 */
	void exitNumber_functions(@NotNull IndsqlParser.Number_functionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#insert_header}.
	 * @param ctx the parse tree
	 */
	void enterInsert_header(@NotNull IndsqlParser.Insert_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#insert_header}.
	 * @param ctx the parse tree
	 */
	void exitInsert_header(@NotNull IndsqlParser.Insert_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_database_statements}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_statements(@NotNull IndsqlParser.Alter_database_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_database_statements}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_statements(@NotNull IndsqlParser.Alter_database_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#load_xml_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoad_xml_statement(@NotNull IndsqlParser.Load_xml_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#load_xml_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoad_xml_statement(@NotNull IndsqlParser.Load_xml_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#group_functions}.
	 * @param ctx the parse tree
	 */
	void enterGroup_functions(@NotNull IndsqlParser.Group_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#group_functions}.
	 * @param ctx the parse tree
	 */
	void exitGroup_functions(@NotNull IndsqlParser.Group_functionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#parser_name}.
	 * @param ctx the parse tree
	 */
	void enterParser_name(@NotNull IndsqlParser.Parser_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#parser_name}.
	 * @param ctx the parse tree
	 */
	void exitParser_name(@NotNull IndsqlParser.Parser_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition(@NotNull IndsqlParser.Reference_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition(@NotNull IndsqlParser.Reference_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_name(@NotNull IndsqlParser.Index_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_name(@NotNull IndsqlParser.Index_column_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#value_list_clause}.
	 * @param ctx the parse tree
	 */
	void enterValue_list_clause(@NotNull IndsqlParser.Value_list_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#value_list_clause}.
	 * @param ctx the parse tree
	 */
	void exitValue_list_clause(@NotNull IndsqlParser.Value_list_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull IndsqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull IndsqlParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_table_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_specification(@NotNull IndsqlParser.Alter_table_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_table_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_specification(@NotNull IndsqlParser.Alter_table_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#delete_multiple_table_statement1}.
	 * @param ctx the parse tree
	 */
	void enterDelete_multiple_table_statement1(@NotNull IndsqlParser.Delete_multiple_table_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#delete_multiple_table_statement1}.
	 * @param ctx the parse tree
	 */
	void exitDelete_multiple_table_statement1(@NotNull IndsqlParser.Delete_multiple_table_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(@NotNull IndsqlParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(@NotNull IndsqlParser.Groupby_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#delete_multiple_table_statement2}.
	 * @param ctx the parse tree
	 */
	void enterDelete_multiple_table_statement2(@NotNull IndsqlParser.Delete_multiple_table_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#delete_multiple_table_statement2}.
	 * @param ctx the parse tree
	 */
	void exitDelete_multiple_table_statement2(@NotNull IndsqlParser.Delete_multiple_table_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#char_functions}.
	 * @param ctx the parse tree
	 */
	void enterChar_functions(@NotNull IndsqlParser.Char_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#char_functions}.
	 * @param ctx the parse tree
	 */
	void exitChar_functions(@NotNull IndsqlParser.Char_functionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#other_functions}.
	 * @param ctx the parse tree
	 */
	void enterOther_functions(@NotNull IndsqlParser.Other_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#other_functions}.
	 * @param ctx the parse tree
	 */
	void exitOther_functions(@NotNull IndsqlParser.Other_functionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_definitions}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definitions(@NotNull IndsqlParser.Column_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_definitions}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definitions(@NotNull IndsqlParser.Column_definitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#data_definition_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_definition_statements(@NotNull IndsqlParser.Data_definition_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#data_definition_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_definition_statements(@NotNull IndsqlParser.Data_definition_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(@NotNull IndsqlParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(@NotNull IndsqlParser.Index_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(@NotNull IndsqlParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(@NotNull IndsqlParser.Do_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#delete_statements}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statements(@NotNull IndsqlParser.Delete_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#delete_statements}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statements(@NotNull IndsqlParser.Delete_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#insert_statements}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statements(@NotNull IndsqlParser.Insert_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#insert_statements}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statements(@NotNull IndsqlParser.Insert_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#collation_names}.
	 * @param ctx the parse tree
	 */
	void enterCollation_names(@NotNull IndsqlParser.Collation_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#collation_names}.
	 * @param ctx the parse tree
	 */
	void exitCollation_names(@NotNull IndsqlParser.Collation_namesContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterRename_table_statement(@NotNull IndsqlParser.Rename_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitRename_table_statement(@NotNull IndsqlParser.Rename_table_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#single_table_update_statement}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_update_statement(@NotNull IndsqlParser.Single_table_update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#single_table_update_statement}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_update_statement(@NotNull IndsqlParser.Single_table_update_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#column_data_type_header}.
	 * @param ctx the parse tree
	 */
	void enterColumn_data_type_header(@NotNull IndsqlParser.Column_data_type_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#column_data_type_header}.
	 * @param ctx the parse tree
	 */
	void exitColumn_data_type_header(@NotNull IndsqlParser.Column_data_type_headerContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_atom}.
	 * @param ctx the parse tree
	 */
	void enterTable_atom(@NotNull IndsqlParser.Table_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_atom}.
	 * @param ctx the parse tree
	 */
	void exitTable_atom(@NotNull IndsqlParser.Table_atomContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(@NotNull IndsqlParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(@NotNull IndsqlParser.Procedure_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#exp_factor3}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor3(@NotNull IndsqlParser.Exp_factor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#exp_factor3}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor3(@NotNull IndsqlParser.Exp_factor3Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#exp_factor4}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor4(@NotNull IndsqlParser.Exp_factor4Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#exp_factor4}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor4(@NotNull IndsqlParser.Exp_factor4Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#exp_factor1}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor1(@NotNull IndsqlParser.Exp_factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#exp_factor1}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor1(@NotNull IndsqlParser.Exp_factor1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#exp_factor2}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor2(@NotNull IndsqlParser.Exp_factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#exp_factor2}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor2(@NotNull IndsqlParser.Exp_factor2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name(@NotNull IndsqlParser.Partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name(@NotNull IndsqlParser.Partition_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull IndsqlParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull IndsqlParser.String_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(@NotNull IndsqlParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(@NotNull IndsqlParser.Boolean_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column(@NotNull IndsqlParser.Displayed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column(@NotNull IndsqlParser.Displayed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(@NotNull IndsqlParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(@NotNull IndsqlParser.Table_optionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(@NotNull IndsqlParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(@NotNull IndsqlParser.Table_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#case_when_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_statement(@NotNull IndsqlParser.Case_when_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#case_when_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_statement(@NotNull IndsqlParser.Case_when_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(@NotNull IndsqlParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(@NotNull IndsqlParser.Create_table_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull IndsqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull IndsqlParser.Index_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#delete_single_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_single_table_statement(@NotNull IndsqlParser.Delete_single_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#delete_single_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_single_table_statement(@NotNull IndsqlParser.Delete_single_table_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#wrapper_name}.
	 * @param ctx the parse tree
	 */
	void enterWrapper_name(@NotNull IndsqlParser.Wrapper_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#wrapper_name}.
	 * @param ctx the parse tree
	 */
	void exitWrapper_name(@NotNull IndsqlParser.Wrapper_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_database_statement2}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_statement2(@NotNull IndsqlParser.Alter_database_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_database_statement2}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_statement2(@NotNull IndsqlParser.Alter_database_statement2Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#close_handler_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_handler_statement(@NotNull IndsqlParser.Close_handler_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#close_handler_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_handler_statement(@NotNull IndsqlParser.Close_handler_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#set_columns_cluase}.
	 * @param ctx the parse tree
	 */
	void enterSet_columns_cluase(@NotNull IndsqlParser.Set_columns_cluaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#set_columns_cluase}.
	 * @param ctx the parse tree
	 */
	void exitSet_columns_cluase(@NotNull IndsqlParser.Set_columns_cluaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_database_statement1}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_statement1(@NotNull IndsqlParser.Alter_database_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_database_statement1}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_statement1(@NotNull IndsqlParser.Alter_database_statement1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull IndsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull IndsqlParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#schedule_definition}.
	 * @param ctx the parse tree
	 */
	void enterSchedule_definition(@NotNull IndsqlParser.Schedule_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#schedule_definition}.
	 * @param ctx the parse tree
	 */
	void exitSchedule_definition(@NotNull IndsqlParser.Schedule_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_statement(@NotNull IndsqlParser.Create_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_statement(@NotNull IndsqlParser.Create_event_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(@NotNull IndsqlParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(@NotNull IndsqlParser.Orderby_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(@NotNull IndsqlParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(@NotNull IndsqlParser.OffsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#create_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_statement(@NotNull IndsqlParser.Create_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#create_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_statement(@NotNull IndsqlParser.Create_index_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#open_handler_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_handler_statement(@NotNull IndsqlParser.Open_handler_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#open_handler_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_handler_statement(@NotNull IndsqlParser.Open_handler_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(@NotNull IndsqlParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(@NotNull IndsqlParser.Index_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_expr(@NotNull IndsqlParser.Bit_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_expr(@NotNull IndsqlParser.Bit_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull IndsqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull IndsqlParser.AliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#partition_logical_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_logical_name(@NotNull IndsqlParser.Partition_logical_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#partition_logical_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_logical_name(@NotNull IndsqlParser.Partition_logical_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull IndsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull IndsqlParser.Where_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#algorithm_option}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm_option(@NotNull IndsqlParser.Algorithm_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#algorithm_option}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm_option(@NotNull IndsqlParser.Algorithm_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCall_statement(@NotNull IndsqlParser.Call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCall_statement(@NotNull IndsqlParser.Call_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#load_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoad_data_statement(@NotNull IndsqlParser.Load_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#load_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoad_data_statement(@NotNull IndsqlParser.Load_data_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void enterTable_spec(@NotNull IndsqlParser.Table_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void exitTable_spec(@NotNull IndsqlParser.Table_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#alter_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_statement(@NotNull IndsqlParser.Alter_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#alter_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_statement(@NotNull IndsqlParser.Alter_server_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(@NotNull IndsqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(@NotNull IndsqlParser.SubqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#root_statement}.
	 * @param ctx the parse tree
	 */
	void enterRoot_statement(@NotNull IndsqlParser.Root_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#root_statement}.
	 * @param ctx the parse tree
	 */
	void exitRoot_statement(@NotNull IndsqlParser.Root_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#drop_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_statement(@NotNull IndsqlParser.Drop_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#drop_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_statement(@NotNull IndsqlParser.Drop_server_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#data_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_statements(@NotNull IndsqlParser.Data_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#data_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_statements(@NotNull IndsqlParser.Data_manipulation_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#constraint_symbol_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_symbol_name(@NotNull IndsqlParser.Constraint_symbol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#constraint_symbol_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_symbol_name(@NotNull IndsqlParser.Constraint_symbol_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_option(@NotNull IndsqlParser.Table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_option(@NotNull IndsqlParser.Table_optionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull IndsqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull IndsqlParser.Collation_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#row_count}.
	 * @param ctx the parse tree
	 */
	void enterRow_count(@NotNull IndsqlParser.Row_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#row_count}.
	 * @param ctx the parse tree
	 */
	void exitRow_count(@NotNull IndsqlParser.Row_countContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(@NotNull IndsqlParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(@NotNull IndsqlParser.Join_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#null_or_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_or_notnull(@NotNull IndsqlParser.Null_or_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#null_or_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_or_notnull(@NotNull IndsqlParser.Null_or_notnullContext ctx);
}