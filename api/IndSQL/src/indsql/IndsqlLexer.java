package indsql;

// Generated from Indsql.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IndsqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, ALL=3, AS=4, WHERE=5, AND=6, OR=7, DOT=8, COMMA=9, ASTERISK=10, 
		EQ_SYM=11, NEQ_SYM=12, GT_SYM=13, LT_SYM=14, INTEGER_NUM=15, TEXT_STRING=16, 
		ID=17, WHITE_SPACE=18, SL_COMMENT=19, ML_COMMENT=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ambil'", "'dari'", "'semua'", "'sebagai'", "'di mana'", "'dan'", "'atau'", 
		"'.'", "','", "'*'", "'='", "'!='", "'>'", "'<'", "INTEGER_NUM", "TEXT_STRING", 
		"ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};
	public static final String[] ruleNames = {
		"SELECT", "FROM", "ALL", "AS", "WHERE", "AND", "OR", "DOT", "COMMA", "ASTERISK", 
		"EQ_SYM", "NEQ_SYM", "GT_SYM", "LT_SYM", "INTEGER_NUM", "TEXT_STRING", 
		"ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};


	public IndsqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Indsql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17: WHITE_SPACE_action((RuleContext)_localctx, actionIndex); break;

		case 18: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 19: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void WHITE_SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20"+
		"f\n\20\r\20\16\20g\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21r\n\21"+
		"\f\21\16\21u\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0080"+
		"\n\21\f\21\16\21\u0083\13\21\3\21\5\21\u0086\n\21\3\22\3\22\7\22\u008a"+
		"\n\22\f\22\16\22\u008d\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0096"+
		"\n\24\3\24\7\24\u0099\n\24\f\24\16\24\u009c\13\24\3\24\5\24\u009f\n\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00a9\n\25\f\25\16\25\u00ac"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\3\u00aa\26\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\2\'\25\3)\26\4\3\2\b\3\2))\3\2$$\6\2&&C\\aac"+
		"|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00c0\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\61\3\2\2\2\7\66\3\2\2\2\t<\3\2"+
		"\2\2\13D\3\2\2\2\rL\3\2\2\2\17P\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25Y\3"+
		"\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!\u0085"+
		"\3\2\2\2#\u0087\3\2\2\2%\u008e\3\2\2\2\'\u0095\3\2\2\2)\u00a4\3\2\2\2"+
		"+,\7c\2\2,-\7o\2\2-.\7d\2\2./\7k\2\2/\60\7n\2\2\60\4\3\2\2\2\61\62\7f"+
		"\2\2\62\63\7c\2\2\63\64\7t\2\2\64\65\7k\2\2\65\6\3\2\2\2\66\67\7u\2\2"+
		"\678\7g\2\289\7o\2\29:\7w\2\2:;\7c\2\2;\b\3\2\2\2<=\7u\2\2=>\7g\2\2>?"+
		"\7d\2\2?@\7c\2\2@A\7i\2\2AB\7c\2\2BC\7k\2\2C\n\3\2\2\2DE\7f\2\2EF\7k\2"+
		"\2FG\7\"\2\2GH\7o\2\2HI\7c\2\2IJ\7p\2\2JK\7c\2\2K\f\3\2\2\2LM\7f\2\2M"+
		"N\7c\2\2NO\7p\2\2O\16\3\2\2\2PQ\7c\2\2QR\7v\2\2RS\7c\2\2ST\7w\2\2T\20"+
		"\3\2\2\2UV\7\60\2\2V\22\3\2\2\2WX\7.\2\2X\24\3\2\2\2YZ\7,\2\2Z\26\3\2"+
		"\2\2[\\\7?\2\2\\\30\3\2\2\2]^\7#\2\2^_\7?\2\2_\32\3\2\2\2`a\7@\2\2a\34"+
		"\3\2\2\2bc\7>\2\2c\36\3\2\2\2df\4\62;\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h \3\2\2\2is\7)\2\2jk\7^\2\2kr\7^\2\2lm\7)\2\2mr\7)\2\2no\7"+
		"^\2\2or\7)\2\2pr\n\2\2\2qj\3\2\2\2ql\3\2\2\2qn\3\2\2\2qp\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v\u0086\7)\2\2w\u0081\7$\2"+
		"\2xy\7^\2\2y\u0080\7^\2\2z{\7$\2\2{\u0080\7$\2\2|}\7^\2\2}\u0080\7$\2"+
		"\2~\u0080\n\3\2\2\177x\3\2\2\2\177z\3\2\2\2\177|\3\2\2\2\177~\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\7$\2\2\u0085i\3\2\2\2\u0085w"+
		"\3\2\2\2\u0086\"\3\2\2\2\u0087\u008b\t\4\2\2\u0088\u008a\t\5\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c$\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\t\6\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\b\23\2\2\u0091&\3\2\2\2\u0092\u0093\7/\2\2\u0093"+
		"\u0096\7/\2\2\u0094\u0096\7%\2\2\u0095\u0092\3\2\2\2\u0095\u0094\3\2\2"+
		"\2\u0096\u009a\3\2\2\2\u0097\u0099\n\7\2\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009f\7\17\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\b\24\3\2\u00a3(\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7,\2\2"+
		"\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\b\25\4\2\u00b1*\3\2\2\2\16\2gqs\177\u0081\u0085\u008b"+
		"\u0095\u009a\u009e\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}