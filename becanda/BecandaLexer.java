// Generated from Becanda.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BecandaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, ALL=3, AS=4, WHERE=5, DOT=6, COMMA=7, ASTERISK=8, ID=9, 
		WHITE_SPACE=10, SL_COMMENT=11, ML_COMMENT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ambil'", "'dari'", "'semua'", "'sebagai'", "'di mana'", "'.'", "','", 
		"'*'", "ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};
	public static final String[] ruleNames = {
		"SELECT", "FROM", "ALL", "AS", "WHERE", "DOT", "COMMA", "ASTERISK", "ID", 
		"WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};


	public BecandaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Becanda.g4"; }

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
		case 9: WHITE_SPACE_action((RuleContext)_localctx, actionIndex); break;

		case 10: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 11: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nE\n\n\f\n\16\nH\13\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fQ\n\f\3\f\7\fT\n\f\f\f\16\fW\13\f\3"+
		"\f\5\fZ\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rd\n\r\f\r\16\rg\13\r\3"+
		"\r\3\r\3\r\3\r\3\r\3e\16\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\2\27\r\3\31\16\4\3\2\6\6\2&&C\\aac|\7\2&&\62;C\\aac"+
		"|\5\2\13\f\17\17\"\"\4\2\f\f\17\17q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5!\3\2\2"+
		"\2\7&\3\2\2\2\t,\3\2\2\2\13\64\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2"+
		"\2\2\23B\3\2\2\2\25I\3\2\2\2\27P\3\2\2\2\31_\3\2\2\2\33\34\7c\2\2\34\35"+
		"\7o\2\2\35\36\7d\2\2\36\37\7k\2\2\37 \7n\2\2 \4\3\2\2\2!\"\7f\2\2\"#\7"+
		"c\2\2#$\7t\2\2$%\7k\2\2%\6\3\2\2\2&\'\7u\2\2\'(\7g\2\2()\7o\2\2)*\7w\2"+
		"\2*+\7c\2\2+\b\3\2\2\2,-\7u\2\2-.\7g\2\2./\7d\2\2/\60\7c\2\2\60\61\7i"+
		"\2\2\61\62\7c\2\2\62\63\7k\2\2\63\n\3\2\2\2\64\65\7f\2\2\65\66\7k\2\2"+
		"\66\67\7\"\2\2\678\7o\2\289\7c\2\29:\7p\2\2:;\7c\2\2;\f\3\2\2\2<=\7\60"+
		"\2\2=\16\3\2\2\2>?\7.\2\2?\20\3\2\2\2@A\7,\2\2A\22\3\2\2\2BF\t\2\2\2C"+
		"E\t\3\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\24\3\2\2\2HF\3\2\2"+
		"\2IJ\t\4\2\2JK\3\2\2\2KL\b\13\2\2L\26\3\2\2\2MN\7/\2\2NQ\7/\2\2OQ\7%\2"+
		"\2PM\3\2\2\2PO\3\2\2\2QU\3\2\2\2RT\n\5\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2"+
		"\2\2[\\\7\f\2\2\\]\3\2\2\2]^\b\f\3\2^\30\3\2\2\2_`\7\61\2\2`a\7,\2\2a"+
		"e\3\2\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2"+
		"ge\3\2\2\2hi\7,\2\2ij\7\61\2\2jk\3\2\2\2kl\b\r\4\2l\32\3\2\2\2\b\2FPU"+
		"Ye";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}