package indsql;

// Generated from Indsql.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IndsqlParser}.
 */
public interface IndsqlListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link IndsqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull IndsqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull IndsqlParser.RootContext ctx);

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
	 * Enter a parse tree produced by {@link IndsqlParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(@NotNull IndsqlParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(@NotNull IndsqlParser.Expr1Context ctx);

	/**
	 * Enter a parse tree produced by {@link IndsqlParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(@NotNull IndsqlParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(@NotNull IndsqlParser.Expr2Context ctx);

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
	 * Enter a parse tree produced by {@link IndsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(@NotNull IndsqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(@NotNull IndsqlParser.Select_statementContext ctx);
}