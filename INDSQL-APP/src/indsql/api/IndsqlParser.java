package indsql.api;

// Generated from Indsql.g4 by ANTLR 4.1
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
		SELECT=1, FROM=2, ALL=3, AS=4, WHERE=5, AND=6, OR=7, DOT=8, COMMA=9, ASTERISK=10, 
		EQ_SYM=11, NEQ_SYM=12, GT_SYM=13, LT_SYM=14, INTEGER_NUM=15, TEXT_STRING=16, 
		ID=17, WHITE_SPACE=18, SL_COMMENT=19, ML_COMMENT=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'ambil'", "'dari'", "'semua'", "'sebagai'", "'di mana'", 
		"'dan'", "'atau'", "'.'", "','", "'*'", "'='", "'!='", "'>'", "'<'", "INTEGER_NUM", 
		"TEXT_STRING", "ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};
	public static final int
		RULE_schema_name = 0, RULE_table_name = 1, RULE_column_name = 2, RULE_alias = 3, 
		RULE_column_spec = 4, RULE_table_spec = 5, RULE_expression = 6, RULE_expr1 = 7, 
		RULE_expr2 = 8, RULE_predicate = 9, RULE_relational_op = 10, RULE_literal_value = 11, 
		RULE_select_statement = 12, RULE_select_list = 13, RULE_displayed_column = 14, 
		RULE_root = 15;
	public static final String[] ruleNames = {
		"schema_name", "table_name", "column_name", "alias", "column_spec", "table_spec", 
		"expression", "expr1", "expr2", "predicate", "relational_op", "literal_value", 
		"select_statement", "select_list", "displayed_column", "root"
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
			setState(32); match(ID);
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
			setState(34); match(ID);
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
			setState(36); match(ID);
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
			setState(39);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(38); match(AS);
				}
			}

			setState(41); match(ID);
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
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(46);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(43); schema_name();
					setState(44); match(DOT);
					}
					break;
				}
				setState(48); table_name();
				setState(49); match(DOT);
				}
				break;
			}
			setState(53); column_name();
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
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55); schema_name();
				setState(56); match(DOT);
				}
				break;
			}
			setState(60); table_name();
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
			setState(62); expr1();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(63); match(OR);
				setState(64); expr1();
				}
				}
				setState(69);
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
			setState(70); expr2();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(71); match(AND);
				setState(72); expr2();
				}
				}
				setState(77);
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
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); predicate();
				setState(79); relational_op();
				setState(80); predicate();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); literal_value();
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
			setState(87);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); column_spec();
				}
				break;
			case INTEGER_NUM:
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); literal_value();
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
			setState(89);
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
			setState(91);
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

	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(IndsqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(IndsqlParser.SELECT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IndsqlParser.FROM, 0); }
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
		enterRule(_localctx, 24, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(SELECT);
			setState(94); select_list();
			setState(95); match(FROM);
			setState(96); table_spec();
			setState(99);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(97); match(WHERE);
				setState(98); expression();
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
		enterRule(_localctx, 26, RULE_select_list);
		int _la;
		try {
			setState(111);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(101); displayed_column();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(102); match(COMMA);
					setState(103); displayed_column();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(ASTERISK);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); match(ALL);
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
		enterRule(_localctx, 28, RULE_displayed_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); column_spec();
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
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
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
		enterRule(_localctx, 30, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); select_statement();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\26x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\5\5*\n\5\3\5\3\5\3\6\3\6\3\6\5\6\61\n\6\3\6\3\6\3\6\5\6\66"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\5\7=\n\7\3\7\3\7\3\b\3\b\3\b\7\bD\n\b\f\b\16"+
		"\bG\13\b\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\n\3\n\3\n\3\n\3\n\5\nV"+
		"\n\n\3\13\3\13\5\13Z\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16f\n\16\3\17\3\17\3\17\7\17k\n\17\f\17\16\17n\13\17\3\17\3\17\5\17"+
		"r\n\17\3\20\3\20\3\21\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\4\3\2\r\20\3\2\21\22s\2\"\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b)\3"+
		"\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20H\3\2\2\2\22U\3\2\2\2\24"+
		"Y\3\2\2\2\26[\3\2\2\2\30]\3\2\2\2\32_\3\2\2\2\34q\3\2\2\2\36s\3\2\2\2"+
		" u\3\2\2\2\"#\7\23\2\2#\3\3\2\2\2$%\7\23\2\2%\5\3\2\2\2&\'\7\23\2\2\'"+
		"\7\3\2\2\2(*\7\6\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\23\2\2,\t\3\2\2"+
		"\2-.\5\2\2\2./\7\n\2\2/\61\3\2\2\2\60-\3\2\2\2\60\61\3\2\2\2\61\62\3\2"+
		"\2\2\62\63\5\4\3\2\63\64\7\n\2\2\64\66\3\2\2\2\65\60\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\3\2\2\2\678\5\6\4\28\13\3\2\2\29:\5\2\2\2:;\7\n\2\2;=\3\2\2"+
		"\2<9\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\4\3\2?\r\3\2\2\2@E\5\20\t\2AB\7\t"+
		"\2\2BD\5\20\t\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GE"+
		"\3\2\2\2HM\5\22\n\2IJ\7\b\2\2JL\5\22\n\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2N\21\3\2\2\2OM\3\2\2\2PQ\5\24\13\2QR\5\26\f\2RS\5\24\13\2SV"+
		"\3\2\2\2TV\5\30\r\2UP\3\2\2\2UT\3\2\2\2V\23\3\2\2\2WZ\5\n\6\2XZ\5\30\r"+
		"\2YW\3\2\2\2YX\3\2\2\2Z\25\3\2\2\2[\\\t\2\2\2\\\27\3\2\2\2]^\t\3\2\2^"+
		"\31\3\2\2\2_`\7\3\2\2`a\5\34\17\2ab\7\4\2\2be\5\f\7\2cd\7\7\2\2df\5\16"+
		"\b\2ec\3\2\2\2ef\3\2\2\2f\33\3\2\2\2gl\5\36\20\2hi\7\13\2\2ik\5\36\20"+
		"\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mr\3\2\2\2nl\3\2\2\2or\7\f\2"+
		"\2pr\7\5\2\2qg\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\35\3\2\2\2st\5\n\6\2t\37\3"+
		"\2\2\2uv\5\32\16\2v!\3\2\2\2\r)\60\65<EMUYelq";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}