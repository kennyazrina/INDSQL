// Generated from Indsql.g4 by ANTLR 4.1
package indsql.api;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IndsqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, SELECT=3, UPDATE=4, DELETE=5, INSERT=6, FROM=7, ORDER=8, 
		GROUP=9, BY=10, ASC=11, DESC=12, SET=13, INTO=14, ROWS=15, ALL=16, AS=17, 
		WHERE=18, AND=19, OR=20, DOT=21, COMMA=22, ASTERISK=23, EQ_SYM=24, NEQ_SYM=25, 
		GT_SYM=26, LT_SYM=27, INTEGER_NUM=28, TEXT_STRING=29, ID=30, WHITE_SPACE=31, 
		SL_COMMENT=32, ML_COMMENT=33;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'ambil'", "'perbarui'", "'hapus'", "'masukkan'", 
		"'dari'", "'terurut'", "'terkelompokkan'", "'berdasarkan'", "'naik'", 
		"'turun'", "'ubah'", "'ke dalam'", "'baris-baris'", "'semua'", "'sebagai'", 
		"'di mana'", "'dan'", "'atau'", "'.'", "','", "'*'", "'='", "'!='", "'>'", 
		"'<'", "INTEGER_NUM", "TEXT_STRING", "ID", "WHITE_SPACE", "SL_COMMENT", 
		"ML_COMMENT"
	};
	public static final int
		RULE_schema_name = 0, RULE_table_name = 1, RULE_column_name = 2, RULE_alias = 3, 
		RULE_column_spec = 4, RULE_table_spec = 5, RULE_expression = 6, RULE_expr1 = 7, 
		RULE_expr2 = 8, RULE_predicate = 9, RULE_relational_op = 10, RULE_literal_value = 11, 
		RULE_root = 12, RULE_select_statement = 13, RULE_select_list = 14, RULE_displayed_column = 15, 
		RULE_select_field_list = 16, RULE_select_group_by = 17, RULE_select_order_by = 18, 
		RULE_select_order = 19, RULE_update_statement = 20, RULE_update_list = 21, 
		RULE_update_atom = 22, RULE_delete_statement = 23, RULE_insert_statement = 24, 
		RULE_insert_field_list = 25, RULE_insert_list = 26, RULE_insert_row = 27;
	public static final String[] ruleNames = {
		"schema_name", "table_name", "column_name", "alias", "column_spec", "table_spec", 
		"expression", "expr1", "expr2", "predicate", "relational_op", "literal_value", 
		"root", "select_statement", "select_list", "displayed_column", "select_field_list", 
		"select_group_by", "select_order_by", "select_order", "update_statement", 
		"update_list", "update_atom", "delete_statement", "insert_statement", 
		"insert_field_list", "insert_list", "insert_row"
	};

	@Override
	public String getGrammarFileName() { return "Indsql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public IndsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IndsqlParser.AS, 0); }
		public TerminalNode ID() { return getToken(IndsqlParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(62); match(AS);
				}
			}

			setState(65); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(IndsqlParser.DOT); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(IndsqlParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitColumn_spec(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(70);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(67); schema_name();
					setState(68); match(DOT);
					}
					break;
				}
				setState(72); table_name();
				setState(73); match(DOT);
				}
				break;
			}
			setState(77); column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(IndsqlParser.DOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterTable_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitTable_spec(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(79); schema_name();
				setState(80); match(DOT);
				}
				break;
			}
			setState(84); table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(IndsqlParser.OR); }
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(IndsqlParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); expr1();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(87); match(OR);
				setState(88); expr1();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public List<TerminalNode> AND() { return getTokens(IndsqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(IndsqlParser.AND, i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); expr2();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(95); match(AND);
				setState(96); expr2();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr2);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); predicate();
				setState(103); relational_op();
				setState(104); predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); literal_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicate);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); column_spec();
				}
				break;
			case INTEGER_NUM:
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); literal_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode GT_SYM() { return getToken(IndsqlParser.GT_SYM, 0); }
		public TerminalNode NEQ_SYM() { return getToken(IndsqlParser.NEQ_SYM, 0); }
		public TerminalNode LT_SYM() { return getToken(IndsqlParser.LT_SYM, 0); }
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_SYM) | (1L << NEQ_SYM) | (1L << GT_SYM) | (1L << LT_SYM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IndsqlParser.INTEGER_NUM, 0); }
		public TerminalNode TEXT_STRING() { return getToken(IndsqlParser.TEXT_STRING, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==TEXT_STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RootContext extends ParserRuleContext {
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_root);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); select_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); delete_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); insert_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(IndsqlParser.WHERE, 0); }
		public TerminalNode BY(int i) {
			return getToken(IndsqlParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(IndsqlParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(IndsqlParser.BY); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(IndsqlParser.SELECT, 0); }
		public Select_order_byContext select_order_by() {
			return getRuleContext(Select_order_byContext.class,0);
		}
		public Select_group_byContext select_group_by() {
			return getRuleContext(Select_group_byContext.class,0);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
		public TerminalNode GROUP() { return getToken(IndsqlParser.GROUP, 0); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(SELECT);
			setState(124); select_list();
			setState(125); match(FROM);
			setState(126); table_spec();
			setState(129);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(127); match(WHERE);
				setState(128); expression();
				}
			}

			setState(134);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(131); match(GROUP);
				setState(132); match(BY);
				setState(133); select_group_by();
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(136); match(ORDER);
				setState(137); match(BY);
				setState(138); select_order_by();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(IndsqlParser.ASTERISK, 0); }
		public TerminalNode ALL() { return getToken(IndsqlParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_select_list);
		int _la;
		try {
			setState(151);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(141); displayed_column();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142); match(COMMA);
					setState(143); displayed_column();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); match(ASTERISK);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDisplayed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDisplayed_column(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_displayed_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); column_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_field_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Select_field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_field_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_field_list(this);
		}
	}

	public final Select_field_listContext select_field_list() throws RecognitionException {
		Select_field_listContext _localctx = new Select_field_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_select_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); displayed_column();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(156); match(COMMA);
				setState(157); displayed_column();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_group_byContext extends ParserRuleContext {
		public Select_field_listContext select_field_list() {
			return getRuleContext(Select_field_listContext.class,0);
		}
		public Select_group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_group_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_group_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_group_by(this);
		}
	}

	public final Select_group_byContext select_group_by() throws RecognitionException {
		Select_group_byContext _localctx = new Select_group_byContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select_group_by);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); select_field_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_order_byContext extends ParserRuleContext {
		public Select_field_listContext select_field_list() {
			return getRuleContext(Select_field_listContext.class,0);
		}
		public Select_orderContext select_order() {
			return getRuleContext(Select_orderContext.class,0);
		}
		public Select_order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_order_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_order_by(this);
		}
	}

	public final Select_order_byContext select_order_by() throws RecognitionException {
		Select_order_byContext _localctx = new Select_order_byContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_select_order_by);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); select_field_list();
			setState(166); select_order();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_orderContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(IndsqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(IndsqlParser.ASC, 0); }
		public Select_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterSelect_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitSelect_order(this);
		}
	}

	public final Select_orderContext select_order() throws RecognitionException {
		Select_orderContext _localctx = new Select_orderContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(IndsqlParser.WHERE, 0); }
		public TerminalNode SET() { return getToken(IndsqlParser.SET, 0); }
		public Update_listContext update_list() {
			return getRuleContext(Update_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(IndsqlParser.UPDATE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(UPDATE);
			setState(171); table_spec();
			setState(172); match(SET);
			setState(173); update_list();
			setState(176);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(174); match(WHERE);
				setState(175); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public List<Update_atomContext> update_atom() {
			return getRuleContexts(Update_atomContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Update_atomContext update_atom(int i) {
			return getRuleContext(Update_atomContext.class,i);
		}
		public Update_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterUpdate_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitUpdate_list(this);
		}
	}

	public final Update_listContext update_list() throws RecognitionException {
		Update_listContext _localctx = new Update_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_update_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); update_atom();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179); match(COMMA);
				setState(180); update_atom();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_atomContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode EQ_SYM() { return getToken(IndsqlParser.EQ_SYM, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Update_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterUpdate_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitUpdate_atom(this);
		}
	}

	public final Update_atomContext update_atom() throws RecognitionException {
		Update_atomContext _localctx = new Update_atomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_update_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); column_spec();
			setState(187); match(EQ_SYM);
			setState(188); literal_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(IndsqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(IndsqlParser.DELETE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitDelete_statement(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(DELETE);
			setState(191); match(FROM);
			setState(192); table_spec();
			setState(195);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(193); match(WHERE);
				setState(194); expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Insert_field_listContext insert_field_list() {
			return getRuleContext(Insert_field_listContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(IndsqlParser.ROWS, 0); }
		public TerminalNode INTO() { return getToken(IndsqlParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(IndsqlParser.INSERT, 0); }
		public Insert_listContext insert_list() {
			return getRuleContext(Insert_listContext.class,0);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_insert_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(INSERT);
			setState(198); match(INTO);
			setState(199); table_spec();
			setState(200); insert_field_list();
			setState(201); match(ROWS);
			setState(202); insert_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_field_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Insert_field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_field_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_field_list(this);
		}
	}

	public final Insert_field_listContext insert_field_list() throws RecognitionException {
		Insert_field_listContext _localctx = new Insert_field_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(2);
			setState(205); column_name();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206); match(COMMA);
				setState(207); column_name();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_listContext extends ParserRuleContext {
		public List<Insert_rowContext> insert_row() {
			return getRuleContexts(Insert_rowContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Insert_rowContext insert_row(int i) {
			return getRuleContext(Insert_rowContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Insert_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_list(this);
		}
	}

	public final Insert_listContext insert_list() throws RecognitionException {
		Insert_listContext _localctx = new Insert_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); insert_row();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216); match(COMMA);
				setState(217); insert_row();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_rowContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IndsqlParser.COMMA); }
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IndsqlParser.COMMA, i);
		}
		public Insert_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).enterInsert_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndsqlListener ) ((IndsqlListener)listener).exitInsert_row(this);
		}
	}

	public final Insert_rowContext insert_row() throws RecognitionException {
		Insert_rowContext _localctx = new Insert_rowContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(2);
			setState(224); literal_value();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225); match(COMMA);
				setState(226); literal_value();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3#\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4\3\5\5"+
		"\5B\n\5\3\5\3\5\3\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\7U\n\7\3\7\3\7\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\t\3\t"+
		"\3\t\7\td\n\t\f\t\16\tg\13\t\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\5"+
		"\13r\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16|\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0084\n\17\3\17\3\17\3\17\5\17\u0089\n\17\3\17\3"+
		"\17\3\17\5\17\u008e\n\17\3\20\3\20\3\20\7\20\u0093\n\20\f\20\16\20\u0096"+
		"\13\20\3\20\3\20\5\20\u009a\n\20\3\21\3\21\3\22\3\22\3\22\7\22\u00a1\n"+
		"\22\f\22\16\22\u00a4\13\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00b3\n\26\3\27\3\27\3\27\7\27\u00b8\n\27\f"+
		"\27\16\27\u00bb\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00c6\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u00d3\n\33\f\33\16\33\u00d6\13\33\3\33\3\33\3\34\3\34\3\34\7\34\u00dd"+
		"\n\34\f\34\16\34\u00e0\13\34\3\35\3\35\3\35\3\35\7\35\u00e6\n\35\f\35"+
		"\16\35\u00e9\13\35\3\35\3\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\32\35\3\2\36\37\3\2\r\16\u00e8\2"+
		":\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bA\3\2\2\2\nM\3\2\2\2\fT\3\2\2\2\16X\3"+
		"\2\2\2\20`\3\2\2\2\22m\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2\32"+
		"{\3\2\2\2\34}\3\2\2\2\36\u0099\3\2\2\2 \u009b\3\2\2\2\"\u009d\3\2\2\2"+
		"$\u00a5\3\2\2\2&\u00a7\3\2\2\2(\u00aa\3\2\2\2*\u00ac\3\2\2\2,\u00b4\3"+
		"\2\2\2.\u00bc\3\2\2\2\60\u00c0\3\2\2\2\62\u00c7\3\2\2\2\64\u00ce\3\2\2"+
		"\2\66\u00d9\3\2\2\28\u00e1\3\2\2\2:;\7 \2\2;\3\3\2\2\2<=\7 \2\2=\5\3\2"+
		"\2\2>?\7 \2\2?\7\3\2\2\2@B\7\23\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7"+
		" \2\2D\t\3\2\2\2EF\5\2\2\2FG\7\27\2\2GI\3\2\2\2HE\3\2\2\2HI\3\2\2\2IJ"+
		"\3\2\2\2JK\5\4\3\2KL\7\27\2\2LN\3\2\2\2MH\3\2\2\2MN\3\2\2\2NO\3\2\2\2"+
		"OP\5\6\4\2P\13\3\2\2\2QR\5\2\2\2RS\7\27\2\2SU\3\2\2\2TQ\3\2\2\2TU\3\2"+
		"\2\2UV\3\2\2\2VW\5\4\3\2W\r\3\2\2\2X]\5\20\t\2YZ\7\26\2\2Z\\\5\20\t\2"+
		"[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_]\3\2\2\2`e\5\22"+
		"\n\2ab\7\25\2\2bd\5\22\n\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21"+
		"\3\2\2\2ge\3\2\2\2hi\5\24\13\2ij\5\26\f\2jk\5\24\13\2kn\3\2\2\2ln\5\30"+
		"\r\2mh\3\2\2\2ml\3\2\2\2n\23\3\2\2\2or\5\n\6\2pr\5\30\r\2qo\3\2\2\2qp"+
		"\3\2\2\2r\25\3\2\2\2st\t\2\2\2t\27\3\2\2\2uv\t\3\2\2v\31\3\2\2\2w|\5\34"+
		"\17\2x|\5*\26\2y|\5\60\31\2z|\5\62\32\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2"+
		"{z\3\2\2\2|\33\3\2\2\2}~\7\5\2\2~\177\5\36\20\2\177\u0080\7\t\2\2\u0080"+
		"\u0083\5\f\7\2\u0081\u0082\7\24\2\2\u0082\u0084\5\16\b\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0086\7\13\2\2\u0086"+
		"\u0087\7\f\2\2\u0087\u0089\5$\23\2\u0088\u0085\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008d\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7\f\2\2\u008c"+
		"\u008e\5&\24\2\u008d\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\35\3\2\2"+
		"\2\u008f\u0094\5 \21\2\u0090\u0091\7\30\2\2\u0091\u0093\5 \21\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u009a\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\7\31\2\2\u0098"+
		"\u009a\7\22\2\2\u0099\u008f\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3"+
		"\2\2\2\u009a\37\3\2\2\2\u009b\u009c\5\n\6\2\u009c!\3\2\2\2\u009d\u00a2"+
		"\5 \21\2\u009e\u009f\7\30\2\2\u009f\u00a1\5 \21\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3#\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\"\22\2\u00a6%\3\2\2\2\u00a7\u00a8"+
		"\5\"\22\2\u00a8\u00a9\5(\25\2\u00a9\'\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab"+
		")\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\17\2\2"+
		"\u00af\u00b2\5,\27\2\u00b0\u00b1\7\24\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3+\3\2\2\2\u00b4\u00b9\5.\30\2\u00b5"+
		"\u00b6\7\30\2\2\u00b6\u00b8\5.\30\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba-\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\32\2\2\u00be\u00bf\5\30\r\2"+
		"\u00bf/\3\2\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\7\t\2\2\u00c2\u00c5\5"+
		"\f\7\2\u00c3\u00c4\7\24\2\2\u00c4\u00c6\5\16\b\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\61\3\2\2\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\7\20\2"+
		"\2\u00c9\u00ca\5\f\7\2\u00ca\u00cb\5\64\33\2\u00cb\u00cc\7\21\2\2\u00cc"+
		"\u00cd\5\66\34\2\u00cd\63\3\2\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d4\5\6"+
		"\4\2\u00d0\u00d1\7\30\2\2\u00d1\u00d3\5\6\4\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\3\2\2\u00d8\65\3\2\2\2\u00d9\u00de"+
		"\58\35\2\u00da\u00db\7\30\2\2\u00db\u00dd\58\35\2\u00dc\u00da\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\67"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\4\2\2\u00e2\u00e7\5\30\r\2"+
		"\u00e3\u00e4\7\30\2\2\u00e4\u00e6\5\30\r\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7\3\2\2\u00eb9\3\2\2\2\27AHMT]emq{\u0083\u0088"+
		"\u008d\u0094\u0099\u00a2\u00b2\u00b9\u00c5\u00d4\u00de\u00e7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}