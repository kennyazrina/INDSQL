// Generated from Becanda.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BecandaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, ALL=3, AS=4, WHERE=5, DOT=6, COMMA=7, ASTERISK=8, ID=9, 
		WHITE_SPACE=10, SL_COMMENT=11, ML_COMMENT=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'ambil'", "'dari'", "'semua'", "'sebagai'", "'di mana'", 
		"'.'", "','", "'*'", "ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};
	public static final int
		RULE_schema_name = 0, RULE_table_name = 1, RULE_column_name = 2, RULE_alias = 3, 
		RULE_column_spec = 4, RULE_table_spec = 5, RULE_select_statement = 6, 
		RULE_select_list = 7, RULE_displayed_column = 8, RULE_root = 9;
	public static final String[] ruleNames = {
		"schema_name", "table_name", "column_name", "alias", "column_spec", "table_spec", 
		"select_statement", "select_list", "displayed_column", "root"
	};

	@Override
	public String getGrammarFileName() { return "Becanda.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public BecandaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BecandaParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); match(ID);
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
		public TerminalNode ID() { return getToken(BecandaParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(ID);
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
		public TerminalNode ID() { return getToken(BecandaParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(ID);
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
		public TerminalNode AS() { return getToken(BecandaParser.AS, 0); }
		public TerminalNode ID() { return getToken(BecandaParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(26); match(AS);
				}
			}

			setState(29); match(ID);
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
		public List<TerminalNode> DOT() { return getTokens(BecandaParser.DOT); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(BecandaParser.DOT, i);
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
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitColumn_spec(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(31); schema_name();
					setState(32); match(DOT);
					}
					break;
				}
				setState(36); table_name();
				setState(37); match(DOT);
				}
				break;
			}
			setState(41); column_name();
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
		public TerminalNode DOT() { return getToken(BecandaParser.DOT, 0); }
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
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterTable_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitTable_spec(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43); schema_name();
				setState(44); match(DOT);
				}
				break;
			}
			setState(48); table_name();
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
		public TerminalNode WHERE() { return getToken(BecandaParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(BecandaParser.SELECT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(BecandaParser.FROM, 0); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(SELECT);
			setState(51); select_list();
			setState(52); match(FROM);
			setState(53); table_spec();
			setState(55);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(54); match(WHERE);
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
		public TerminalNode ASTERISK() { return getToken(BecandaParser.ASTERISK, 0); }
		public TerminalNode ALL() { return getToken(BecandaParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BecandaParser.COMMA); }
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BecandaParser.COMMA, i);
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
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_list);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(57); displayed_column();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58); match(COMMA);
					setState(59); displayed_column();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(ASTERISK);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); match(ALL);
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
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterDisplayed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitDisplayed_column(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_displayed_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); column_spec();
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
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BecandaListener ) ((BecandaListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); select_statement();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\16L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\5\5\36\n\5\3\5\3\5\3\6\3\6\3\6\5\6%\n\6\3\6"+
		"\3\6\3\6\5\6*\n\6\3\6\3\6\3\7\3\7\3\7\5\7\61\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\b:\n\b\3\t\3\t\3\t\7\t?\n\t\f\t\16\tB\13\t\3\t\3\t\5\tF\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\2\f\2\4\6\b\n\f\16\20\22\24\2\2I\2\26\3\2\2\2\4"+
		"\30\3\2\2\2\6\32\3\2\2\2\b\35\3\2\2\2\n)\3\2\2\2\f\60\3\2\2\2\16\64\3"+
		"\2\2\2\20E\3\2\2\2\22G\3\2\2\2\24I\3\2\2\2\26\27\7\13\2\2\27\3\3\2\2\2"+
		"\30\31\7\13\2\2\31\5\3\2\2\2\32\33\7\13\2\2\33\7\3\2\2\2\34\36\7\6\2\2"+
		"\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\13\2\2 \t\3\2\2\2!\""+
		"\5\2\2\2\"#\7\b\2\2#%\3\2\2\2$!\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\5\4\3\2"+
		"\'(\7\b\2\2(*\3\2\2\2)$\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\6\4\2,\13\3\2"+
		"\2\2-.\5\2\2\2./\7\b\2\2/\61\3\2\2\2\60-\3\2\2\2\60\61\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\5\4\3\2\63\r\3\2\2\2\64\65\7\3\2\2\65\66\5\20\t\2\66\67\7"+
		"\4\2\2\679\5\f\7\28:\7\7\2\298\3\2\2\29:\3\2\2\2:\17\3\2\2\2;@\5\22\n"+
		"\2<=\7\t\2\2=?\5\22\n\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2"+
		"\2\2B@\3\2\2\2CF\7\n\2\2DF\7\5\2\2E;\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\21\3"+
		"\2\2\2GH\5\n\6\2H\23\3\2\2\2IJ\5\16\b\2J\25\3\2\2\2\t\35$)\609@E";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}