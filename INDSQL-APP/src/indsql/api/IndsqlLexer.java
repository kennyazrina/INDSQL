// Generated from Indsql.g4 by ANTLR 4.1
package indsql.api;
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
		T__1=1, T__0=2, SELECT=3, UPDATE=4, DELETE=5, INSERT=6, FROM=7, ORDER=8, 
		GROUP=9, BY=10, ASC=11, DESC=12, SET=13, INTO=14, ROWS=15, ALL=16, AS=17, 
		WHERE=18, AND=19, OR=20, DOT=21, COMMA=22, ASTERISK=23, EQ_SYM=24, NEQ_SYM=25, 
		GT_SYM=26, LT_SYM=27, INTEGER_NUM=28, TEXT_STRING=29, ID=30, WHITE_SPACE=31, 
		SL_COMMENT=32, ML_COMMENT=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'ambil'", "'perbarui'", "'hapus'", "'masukkan'", "'dari'", 
		"'terurut'", "'terkelompokkan'", "'berdasarkan'", "'naik'", "'turun'", 
		"'ubah'", "'ke dalam'", "'baris-baris'", "'semua'", "'sebagai'", "'di mana'", 
		"'dan'", "'atau'", "'.'", "','", "'*'", "'='", "'!='", "'>'", "'<'", "INTEGER_NUM", 
		"TEXT_STRING", "ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "SELECT", "UPDATE", "DELETE", "INSERT", "FROM", "ORDER", 
		"GROUP", "BY", "ASC", "DESC", "SET", "INTO", "ROWS", "ALL", "AS", "WHERE", 
		"AND", "OR", "DOT", "COMMA", "ASTERISK", "EQ_SYM", "NEQ_SYM", "GT_SYM", 
		"LT_SYM", "INTEGER_NUM", "TEXT_STRING", "ID", "WHITE_SPACE", "SL_COMMENT", 
		"ML_COMMENT"
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
		case 30: WHITE_SPACE_action((RuleContext)_localctx, actionIndex); break;

		case 31: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 32: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u0130\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00e4\n\35\r\35\16\35\u00e5\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u00f0\n\36\f\36\16\36\u00f3\13"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u00fe\n\36\f\36"+
		"\16\36\u0101\13\36\3\36\5\36\u0104\n\36\3\37\3\37\7\37\u0108\n\37\f\37"+
		"\16\37\u010b\13\37\3 \3 \3 \3 \3!\3!\3!\5!\u0114\n!\3!\7!\u0117\n!\f!"+
		"\16!\u011a\13!\3!\5!\u011d\n!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0127\n"+
		"\"\f\"\16\"\u012a\13\"\3\"\3\"\3\"\3\"\3\"\3\u0128#\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\2A\"\3C#\4\3\2\b\3\2)"+
		")\3\2$$\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5"+
		"G\3\2\2\2\7I\3\2\2\2\tO\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17g\3\2\2\2\21"+
		"l\3\2\2\2\23t\3\2\2\2\25\u0083\3\2\2\2\27\u008f\3\2\2\2\31\u0094\3\2\2"+
		"\2\33\u009a\3\2\2\2\35\u009f\3\2\2\2\37\u00a8\3\2\2\2!\u00b4\3\2\2\2#"+
		"\u00ba\3\2\2\2%\u00c2\3\2\2\2\'\u00ca\3\2\2\2)\u00ce\3\2\2\2+\u00d3\3"+
		"\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63\u00db\3\2\2\2"+
		"\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e3\3\2\2\2;\u0103\3\2\2\2=\u0105"+
		"\3\2\2\2?\u010c\3\2\2\2A\u0113\3\2\2\2C\u0122\3\2\2\2EF\7+\2\2F\4\3\2"+
		"\2\2GH\7*\2\2H\6\3\2\2\2IJ\7c\2\2JK\7o\2\2KL\7d\2\2LM\7k\2\2MN\7n\2\2"+
		"N\b\3\2\2\2OP\7r\2\2PQ\7g\2\2QR\7t\2\2RS\7d\2\2ST\7c\2\2TU\7t\2\2UV\7"+
		"w\2\2VW\7k\2\2W\n\3\2\2\2XY\7j\2\2YZ\7c\2\2Z[\7r\2\2[\\\7w\2\2\\]\7u\2"+
		"\2]\f\3\2\2\2^_\7o\2\2_`\7c\2\2`a\7u\2\2ab\7w\2\2bc\7m\2\2cd\7m\2\2de"+
		"\7c\2\2ef\7p\2\2f\16\3\2\2\2gh\7f\2\2hi\7c\2\2ij\7t\2\2jk\7k\2\2k\20\3"+
		"\2\2\2lm\7v\2\2mn\7g\2\2no\7t\2\2op\7w\2\2pq\7t\2\2qr\7w\2\2rs\7v\2\2"+
		"s\22\3\2\2\2tu\7v\2\2uv\7g\2\2vw\7t\2\2wx\7m\2\2xy\7g\2\2yz\7n\2\2z{\7"+
		"q\2\2{|\7o\2\2|}\7r\2\2}~\7q\2\2~\177\7m\2\2\177\u0080\7m\2\2\u0080\u0081"+
		"\7c\2\2\u0081\u0082\7p\2\2\u0082\24\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7t\2\2\u0086\u0087\7f\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b\u008c\7m\2\2"+
		"\u008c\u008d\7c\2\2\u008d\u008e\7p\2\2\u008e\26\3\2\2\2\u008f\u0090\7"+
		"p\2\2\u0090\u0091\7c\2\2\u0091\u0092\7k\2\2\u0092\u0093\7m\2\2\u0093\30"+
		"\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7w\2\2\u0096\u0097\7t\2\2\u0097"+
		"\u0098\7w\2\2\u0098\u0099\7p\2\2\u0099\32\3\2\2\2\u009a\u009b\7w\2\2\u009b"+
		"\u009c\7d\2\2\u009c\u009d\7c\2\2\u009d\u009e\7j\2\2\u009e\34\3\2\2\2\u009f"+
		"\u00a0\7m\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7f\2"+
		"\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7o\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7/\2\2\u00ae"+
		"\u00af\7d\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2"+
		"\u00b2\u00b3\7u\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2"+
		"\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7c\2\2\u00b9\"\3"+
		"\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7d\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7k\2\2"+
		"\u00c1$\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7\""+
		"\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd(\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7w\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7\60\2\2\u00d4,"+
		"\3\2\2\2\u00d5\u00d6\7.\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\60"+
		"\3\2\2\2\u00d9\u00da\7?\2\2\u00da\62\3\2\2\2\u00db\u00dc\7#\2\2\u00dc"+
		"\u00dd\7?\2\2\u00dd\64\3\2\2\2\u00de\u00df\7@\2\2\u00df\66\3\2\2\2\u00e0"+
		"\u00e1\7>\2\2\u00e18\3\2\2\2\u00e2\u00e4\4\62;\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6:\3\2\2\2"+
		"\u00e7\u00f1\7)\2\2\u00e8\u00e9\7^\2\2\u00e9\u00f0\7^\2\2\u00ea\u00eb"+
		"\7)\2\2\u00eb\u00f0\7)\2\2\u00ec\u00ed\7^\2\2\u00ed\u00f0\7)\2\2\u00ee"+
		"\u00f0\n\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ec\3\2"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u0104\7)"+
		"\2\2\u00f5\u00ff\7$\2\2\u00f6\u00f7\7^\2\2\u00f7\u00fe\7^\2\2\u00f8\u00f9"+
		"\7$\2\2\u00f9\u00fe\7$\2\2\u00fa\u00fb\7^\2\2\u00fb\u00fe\7$\2\2\u00fc"+
		"\u00fe\n\3\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fa\3\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7$"+
		"\2\2\u0103\u00e7\3\2\2\2\u0103\u00f5\3\2\2\2\u0104<\3\2\2\2\u0105\u0109"+
		"\t\4\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a>\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010c\u010d\t\6\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b \2\2\u010f@\3\2"+
		"\2\2\u0110\u0111\7/\2\2\u0111\u0114\7/\2\2\u0112\u0114\7%\2\2\u0113\u0110"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0118\3\2\2\2\u0115\u0117\n\7\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\7\17\2\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\f"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b!\3\2\u0121B\3\2\2\2\u0122\u0123"+
		"\7\61\2\2\u0123\u0124\7,\2\2\u0124\u0128\3\2\2\2\u0125\u0127\13\2\2\2"+
		"\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7,\2\2\u012c"+
		"\u012d\7\61\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\"\4\2\u012fD\3\2\2\2"+
		"\16\2\u00e5\u00ef\u00f1\u00fd\u00ff\u0103\u0109\u0113\u0118\u011c\u0128";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}