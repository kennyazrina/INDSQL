// Generated from Becanda.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BecandaParser}.
 */
public interface BecandaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BecandaParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(@NotNull BecandaParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(@NotNull BecandaParser.Select_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(@NotNull BecandaParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(@NotNull BecandaParser.Schema_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull BecandaParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull BecandaParser.RootContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(@NotNull BecandaParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(@NotNull BecandaParser.AliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column(@NotNull BecandaParser.Displayed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column(@NotNull BecandaParser.Displayed_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void enterColumn_spec(@NotNull BecandaParser.Column_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void exitColumn_spec(@NotNull BecandaParser.Column_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull BecandaParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull BecandaParser.Table_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(@NotNull BecandaParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(@NotNull BecandaParser.Select_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void enterTable_spec(@NotNull BecandaParser.Table_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void exitTable_spec(@NotNull BecandaParser.Table_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link BecandaParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull BecandaParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BecandaParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull BecandaParser.Column_nameContext ctx);
}