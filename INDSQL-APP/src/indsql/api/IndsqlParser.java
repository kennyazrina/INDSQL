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
		RULE_select_field_list = 16, RULE_select_order = 17, RULE_update_statement = 18, 
		RULE_update_list = 19, RULE_update_atom = 20, RULE_delete_statement = 21, 
		RULE_insert_statement = 22, RULE_insert_field_list = 23, RULE_insert_list = 24, 
		RULE_insert_row = 25;
	public static final String[] ruleNames = {
		"schema_name", "table_name", "column_name", "alias", "column_spec", "table_spec", 
		"expression", "expr1", "expr2", "predicate", "relational_op", "literal_value", 
		"root", "select_statement", "select_list", "displayed_column", "select_field_list", 
		"select_order", "update_statement", "update_list", "update_atom", "delete_statement", 
		"insert_statement", "insert_field_list", "insert_list", "insert_row"
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
			setState(52); match(ID);
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
			setState(54); match(ID);
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
			setState(59);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(58); match(AS);
				}
			}

			setState(61); match(ID);
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
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(66);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(63); schema_name();
					setState(64); match(DOT);
					}
					break;
				}
				setState(68); table_name();
				setState(69); match(DOT);
				}
				break;
			}
			setState(73); column_name();
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75); schema_name();
				setState(76); match(DOT);
				}
				break;
			}
			setState(80); table_name();
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
			setState(82); expr1();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(83); match(OR);
				setState(84); expr1();
				}
				}
				setState(89);
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
			setState(90); expr2();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(91); match(AND);
				setState(92); expr2();
				}
				}
				setState(97);
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
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); predicate();
				setState(99); relational_op();
				setState(100); predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); literal_value();
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
			setState(107);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); column_spec();
				}
				break;
			case INTEGER_NUM:
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); literal_value();
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
			setState(109);
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
			setState(111);
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
			setState(117);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); select_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); delete_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(116); insert_statement();
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
		public TerminalNode BY(int i) {
			return getToken(IndsqlParser.BY, i);
		}
		public List<Select_field_listContext> select_field_list() {
			return getRuleContexts(Select_field_listContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Select_orderContext select_order() {
			return getRuleContext(Select_orderContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(IndsqlParser.SELECT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(IndsqlParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(IndsqlParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(IndsqlParser.BY); }
		public Select_field_listContext select_field_list(int i) {
			return getRuleContext(Select_field_listContext.class,i);
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
			setState(119); match(SELECT);
			setState(120); select_list();
			setState(121); match(FROM);
			setState(122); table_spec();
			setState(125);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(123); match(WHERE);
				setState(124); expression();
				}
			}

			setState(130);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(127); match(GROUP);
				setState(128); match(BY);
				setState(129); select_field_list();
				}
			}

			setState(137);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(132); match(ORDER);
				setState(133); match(BY);
				setState(134); select_field_list();
				setState(135); select_order();
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
			setState(149);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(139); displayed_column();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140); match(COMMA);
					setState(141); displayed_column();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(ASTERISK);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); match(ALL);
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
			setState(151); column_spec();
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
			setState(153); displayed_column();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154); match(COMMA);
				setState(155); displayed_column();
				}
				}
				setState(160);
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
		enterRule(_localctx, 34, RULE_select_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 36, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(UPDATE);
			setState(164); table_spec();
			setState(165); match(SET);
			setState(166); update_list();
			setState(169);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(167); match(WHERE);
				setState(168); expression();
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
		enterRule(_localctx, 38, RULE_update_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); update_atom();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172); match(COMMA);
				setState(173); update_atom();
				}
				}
				setState(178);
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
		enterRule(_localctx, 40, RULE_update_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); column_spec();
			setState(180); match(EQ_SYM);
			setState(181); literal_value();
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
		enterRule(_localctx, 42, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(DELETE);
			setState(184); match(FROM);
			setState(185); table_spec();
			setState(188);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(186); match(WHERE);
				setState(187); expression();
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
		enterRule(_localctx, 44, RULE_insert_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(INSERT);
			setState(191); match(INTO);
			setState(192); table_spec();
			setState(193); insert_field_list();
			setState(194); match(ROWS);
			setState(195); insert_list();
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
		enterRule(_localctx, 46, RULE_insert_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(2);
			setState(198); column_name();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(199); match(COMMA);
				setState(200); column_name();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); match(1);
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
		enterRule(_localctx, 48, RULE_insert_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); insert_row();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209); match(COMMA);
				setState(210); insert_row();
				}
				}
				setState(215);
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
		enterRule(_localctx, 50, RULE_insert_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(2);
			setState(217); literal_value();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218); match(COMMA);
				setState(219); literal_value();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225); match(1);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3#\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\5\5>\n\5\3\5\3\5\3\6"+
		"\3\6\3\6\5\6E\n\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\7\3\7\3\7\5\7Q\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\t\3\t\3\t\7\t`\n\t\f\t\16"+
		"\tc\13\t\3\n\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\5\13n\n\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\5\16x\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0080\n\17\3\17\3\17\3\17\5\17\u0085\n\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u008c\n\17\3\20\3\20\3\20\7\20\u0091\n\20\f\20\16\20\u0094\13\20\3"+
		"\20\3\20\5\20\u0098\n\20\3\21\3\21\3\22\3\22\3\22\7\22\u009f\n\22\f\22"+
		"\16\22\u00a2\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ac"+
		"\n\24\3\25\3\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00bf\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00cc\n\31\f\31\16\31\u00cf\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\7\32\u00d6\n\32\f\32\16\32\u00d9\13\32\3"+
		"\33\3\33\3\33\3\33\7\33\u00df\n\33\f\33\16\33\u00e2\13\33\3\33\3\33\3"+
		"\33\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5"+
		"\3\2\32\35\3\2\36\37\3\2\r\16\u00e3\2\66\3\2\2\2\48\3\2\2\2\6:\3\2\2\2"+
		"\b=\3\2\2\2\nI\3\2\2\2\fP\3\2\2\2\16T\3\2\2\2\20\\\3\2\2\2\22i\3\2\2\2"+
		"\24m\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36\u0097"+
		"\3\2\2\2 \u0099\3\2\2\2\"\u009b\3\2\2\2$\u00a3\3\2\2\2&\u00a5\3\2\2\2"+
		"(\u00ad\3\2\2\2*\u00b5\3\2\2\2,\u00b9\3\2\2\2.\u00c0\3\2\2\2\60\u00c7"+
		"\3\2\2\2\62\u00d2\3\2\2\2\64\u00da\3\2\2\2\66\67\7 \2\2\67\3\3\2\2\28"+
		"9\7 \2\29\5\3\2\2\2:;\7 \2\2;\7\3\2\2\2<>\7\23\2\2=<\3\2\2\2=>\3\2\2\2"+
		">?\3\2\2\2?@\7 \2\2@\t\3\2\2\2AB\5\2\2\2BC\7\27\2\2CE\3\2\2\2DA\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\5\4\3\2GH\7\27\2\2HJ\3\2\2\2ID\3\2\2\2IJ\3\2"+
		"\2\2JK\3\2\2\2KL\5\6\4\2L\13\3\2\2\2MN\5\2\2\2NO\7\27\2\2OQ\3\2\2\2PM"+
		"\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\4\3\2S\r\3\2\2\2TY\5\20\t\2UV\7\26\2"+
		"\2VX\5\20\t\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\17\3\2\2\2[Y\3"+
		"\2\2\2\\a\5\22\n\2]^\7\25\2\2^`\5\22\n\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\21\3\2\2\2ca\3\2\2\2de\5\24\13\2ef\5\26\f\2fg\5\24\13\2gj"+
		"\3\2\2\2hj\5\30\r\2id\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kn\5\n\6\2ln\5\30\r"+
		"\2mk\3\2\2\2ml\3\2\2\2n\25\3\2\2\2op\t\2\2\2p\27\3\2\2\2qr\t\3\2\2r\31"+
		"\3\2\2\2sx\5\34\17\2tx\5&\24\2ux\5,\27\2vx\5.\30\2ws\3\2\2\2wt\3\2\2\2"+
		"wu\3\2\2\2wv\3\2\2\2x\33\3\2\2\2yz\7\5\2\2z{\5\36\20\2{|\7\t\2\2|\177"+
		"\5\f\7\2}~\7\24\2\2~\u0080\5\16\b\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0084\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\7\f\2\2\u0083\u0085\5"+
		"\"\22\2\u0084\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\3\2\2\2\u0086"+
		"\u0087\7\n\2\2\u0087\u0088\7\f\2\2\u0088\u0089\5\"\22\2\u0089\u008a\5"+
		"$\23\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\35\3\2\2\2\u008d\u0092\5 \21\2\u008e\u008f\7\30\2\2\u008f\u0091\5 \21"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0098\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0098\7\31\2\2"+
		"\u0096\u0098\7\22\2\2\u0097\u008d\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\37\3\2\2\2\u0099\u009a\5\n\6\2\u009a!\3\2\2\2\u009b\u00a0"+
		"\5 \21\2\u009c\u009d\7\30\2\2\u009d\u009f\5 \21\2\u009e\u009c\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1#\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4%\3\2\2\2\u00a5\u00a6"+
		"\7\6\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7\17\2\2\u00a8\u00ab\5(\25\2"+
		"\u00a9\u00aa\7\24\2\2\u00aa\u00ac\5\16\b\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\'\3\2\2\2\u00ad\u00b2\5*\26\2\u00ae\u00af\7\30\2\2\u00af"+
		"\u00b1\5*\26\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3)\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6"+
		"\5\n\6\2\u00b6\u00b7\7\32\2\2\u00b7\u00b8\5\30\r\2\u00b8+\3\2\2\2\u00b9"+
		"\u00ba\7\7\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00be\5\f\7\2\u00bc\u00bd\7\24"+
		"\2\2\u00bd\u00bf\5\16\b\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"-\3\2\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\5\f\7\2"+
		"\u00c3\u00c4\5\60\31\2\u00c4\u00c5\7\21\2\2\u00c5\u00c6\5\62\32\2\u00c6"+
		"/\3\2\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00cd\5\6\4\2\u00c9\u00ca\7\30\2\2"+
		"\u00ca\u00cc\5\6\4\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\7\3\2\2\u00d1\61\3\2\2\2\u00d2\u00d7\5\64\33\2\u00d3\u00d4\7\30"+
		"\2\2\u00d4\u00d6\5\64\33\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\63\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\u00da\u00db\7\4\2\2\u00db\u00e0\5\30\r\2\u00dc\u00dd\7\30\2\2\u00dd"+
		"\u00df\5\30\r\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\3\2\2\u00e4\65\3\2\2\2\27=DIPYaimw\177\u0084\u008b\u0092\u0097"+
		"\u00a0\u00ab\u00b2\u00be\u00cd\u00d7\u00e0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}