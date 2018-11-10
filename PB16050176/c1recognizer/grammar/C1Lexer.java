// Generated from C1Lexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comma=1, SemiColon=2, Assign=3, LeftBracket=4, RightBracket=5, LeftBrace=6, 
		RightBrace=7, LeftParen=8, RightParen=9, If=10, Else=11, While=12, Const=13, 
		Equal=14, NonEqual=15, Less=16, Greater=17, LessEqual=18, GreaterEqual=19, 
		Plus=20, Minus=21, Multiply=22, Divide=23, Modulo=24, Int=25, Float=26, 
		Void=27, Identifier=28, IntConst=29, FloatConst=30, Comment1=31, Comment2=32, 
		Comment3=33, Newline=34, WhiteSpace=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Comma", "SemiColon", "Assign", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "If", "Else", "While", "Equal", "NonEqual", "Less", "Greater", 
		"LessEqual", "GreaterEqual", "LeftParen", "RightParen", "Plus", "Minus", 
		"Multiply", "Divide", "Modulo", "Int", "Float", "Void", "Const", "Identifier", 
		"All_char", "Identifier_Nondigit", "Nondigit", "IntConst", "Dec_const", 
		"Oct_const", "Hex_const", "Hex_pre", "Hex_digit", "Oct_digit", "Nonzero_digit", 
		"FloatConst", "Fra_const", "Expo_part", "Sign", "Digit_seq", "Digit", 
		"Comment1", "Up", "Down", "All", "Comment2", "Line_break", "Line", "Line2", 
		"Non_LB", "Comment", "Comment3", "Newline", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'='", "'['", "']'", "'{'", "'}'", "'('", "')'", "'if'", 
		"'else'", "'while'", "'const'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Comma", "SemiColon", "Assign", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "LeftParen", "RightParen", "If", "Else", "While", "Const", 
		"Equal", "NonEqual", "Less", "Greater", "LessEqual", "GreaterEqual", "Plus", 
		"Minus", "Multiply", "Divide", "Modulo", "Int", "Float", "Void", "Identifier", 
		"IntConst", "FloatConst", "Comment1", "Comment2", "Comment3", "Newline", 
		"WhiteSpace"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public C1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C1Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\6\35\u00c9\n\35\r\35\16\35\u00ca\5\35\u00cd\n\35\3\36"+
		"\3\36\5\36\u00d1\n\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u00da\n!\3\"\3\"\6\""+
		"\u00de\n\"\r\"\16\"\u00df\5\"\u00e2\n\"\3#\3#\6#\u00e6\n#\r#\16#\u00e7"+
		"\5#\u00ea\n#\3$\3$\6$\u00ee\n$\r$\16$\u00ef\3%\3%\3%\3%\5%\u00f6\n%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\5)\u0100\n)\3)\3)\3)\5)\u0105\n)\3*\5*\u0108"+
		"\n*\3*\3*\3*\3*\3*\5*\u010f\n*\3+\3+\5+\u0113\n+\3+\3+\3+\5+\u0118\n+"+
		"\3+\5+\u011b\n+\3,\3,\3-\6-\u0120\n-\r-\16-\u0121\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\7\62\u0133\n\62\f\62\16\62\u0136"+
		"\13\62\3\63\3\63\7\63\u013a\n\63\f\63\16\63\u013d\13\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\7\67\u014d\n\67"+
		"\f\67\16\67\u0150\13\67\38\38\38\39\39\39\39\39\79\u015a\n9\f9\169\u015d"+
		"\139\39\39\39\39\3:\5:\u0164\n:\3:\3:\3:\3:\3;\6;\u016b\n;\r;\16;\u016c"+
		"\3;\3;\4\u0134\u014e\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\f\23\r\25\16"+
		"\27\20\31\21\33\22\35\23\37\24!\25#\n%\13\'\26)\27+\30-\31/\32\61\33\63"+
		"\34\65\35\67\179\36;\2=\2?\2A\37C\2E\2G\2I\2K\2M\2O\2Q S\2U\2W\2Y\2[\2"+
		"]!_\2a\2c\2e\"g\2i\2k\2m\2o\2q#s$u%\3\2\n\5\2C\\aac|\5\2\62;CHch\3\2\62"+
		"9\3\2\63;\4\2--//\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u0171\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2A\3\2\2\2\2"+
		"Q\3\2\2\2\2]\3\2\2\2\2e\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3"+
		"\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2"+
		"\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0088\3\2\2\2\25\u008d\3\2\2\2\27"+
		"\u0093\3\2\2\2\31\u0096\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2\37\u009d"+
		"\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2"+
		")\u00a9\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1"+
		"\3\2\2\2\63\u00b5\3\2\2\2\65\u00bb\3\2\2\2\67\u00c0\3\2\2\29\u00c6\3\2"+
		"\2\2;\u00d0\3\2\2\2=\u00d2\3\2\2\2?\u00d4\3\2\2\2A\u00d9\3\2\2\2C\u00db"+
		"\3\2\2\2E\u00e3\3\2\2\2G\u00eb\3\2\2\2I\u00f5\3\2\2\2K\u00f7\3\2\2\2M"+
		"\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u0104\3\2\2\2S\u010e\3\2\2\2U\u011a\3\2"+
		"\2\2W\u011c\3\2\2\2Y\u011f\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_\u012b"+
		"\3\2\2\2a\u012e\3\2\2\2c\u0134\3\2\2\2e\u0137\3\2\2\2g\u0142\3\2\2\2i"+
		"\u0144\3\2\2\2k\u0148\3\2\2\2m\u014e\3\2\2\2o\u0151\3\2\2\2q\u0154\3\2"+
		"\2\2s\u0163\3\2\2\2u\u016a\3\2\2\2wx\7.\2\2x\4\3\2\2\2yz\7=\2\2z\6\3\2"+
		"\2\2{|\7?\2\2|\b\3\2\2\2}~\7]\2\2~\n\3\2\2\2\177\u0080\7_\2\2\u0080\f"+
		"\3\2\2\2\u0081\u0082\7}\2\2\u0082\16\3\2\2\2\u0083\u0084\7\177\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087\22\3\2\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2"+
		"\u008c\24\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090\7"+
		"k\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\26\3\2\2\2\u0093\u0094"+
		"\7?\2\2\u0094\u0095\7?\2\2\u0095\30\3\2\2\2\u0096\u0097\7#\2\2\u0097\u0098"+
		"\7?\2\2\u0098\32\3\2\2\2\u0099\u009a\7>\2\2\u009a\34\3\2\2\2\u009b\u009c"+
		"\7@\2\2\u009c\36\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f "+
		"\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2\"\3\2\2\2\u00a3\u00a4"+
		"\7*\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7"+
		"-\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7,"+
		"\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae.\3\2\2\2\u00af\u00b0\7"+
		"\'\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2\u00ba\64\3\2\2\2\u00bb\u00bc"+
		"\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7f\2\2\u00bf"+
		"\66\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c58\3\2\2\2\u00c6\u00cc\5=\37\2\u00c7"+
		"\u00c9\5;\36\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd:\3\2\2\2\u00ce\u00d1\5? \2\u00cf\u00d1\5[.\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1<\3\2\2\2\u00d2\u00d3\5? \2\u00d3"+
		">\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5@\3\2\2\2\u00d6\u00da\5C\"\2\u00d7"+
		"\u00da\5E#\2\u00d8\u00da\5G$\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00daB\3\2\2\2\u00db\u00e1\5O(\2\u00dc\u00de\5[."+
		"\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"D\3\2\2\2\u00e3\u00e9\7\62\2\2\u00e4\u00e6\5M\'\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaF\3\2\2\2\u00eb"+
		"\u00ed\5I%\2\u00ec\u00ee\5K&\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7"+
		"\62\2\2\u00f2\u00f6\7z\2\2\u00f3\u00f4\7\62\2\2\u00f4\u00f6\7Z\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6J\3\2\2\2\u00f7\u00f8\t\3\2\2"+
		"\u00f8L\3\2\2\2\u00f9\u00fa\t\4\2\2\u00faN\3\2\2\2\u00fb\u00fc\t\5\2\2"+
		"\u00fcP\3\2\2\2\u00fd\u00ff\5S*\2\u00fe\u0100\5U+\2\u00ff\u00fe\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u0105\3\2\2\2\u0101\u0102\5Y-\2\u0102\u0103"+
		"\5U+\2\u0103\u0105\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u0101\3\2\2\2\u0105"+
		"R\3\2\2\2\u0106\u0108\5Y-\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\60\2\2\u010a\u010f\5Y-\2\u010b\u010c\5Y-"+
		"\2\u010c\u010d\7\60\2\2\u010d\u010f\3\2\2\2\u010e\u0107\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010fT\3\2\2\2\u0110\u0112\7g\2\2\u0111\u0113\5W,\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011b\5Y"+
		"-\2\u0115\u0117\7G\2\2\u0116\u0118\5W,\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\5Y-\2\u011a\u0110\3\2\2\2\u011a"+
		"\u0115\3\2\2\2\u011bV\3\2\2\2\u011c\u011d\t\6\2\2\u011dX\3\2\2\2\u011e"+
		"\u0120\5[.\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2"+
		"\2\u0121\u0122\3\2\2\2\u0122Z\3\2\2\2\u0123\u0124\t\7\2\2\u0124\\\3\2"+
		"\2\2\u0125\u0126\5_\60\2\u0126\u0127\5c\62\2\u0127\u0128\5a\61\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b/\2\2\u012a^\3\2\2\2\u012b\u012c\7\61\2\2"+
		"\u012c\u012d\7,\2\2\u012d`\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7\61"+
		"\2\2\u0130b\3\2\2\2\u0131\u0133\13\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135d\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u013b\5o8\2\u0138\u013a\5i\65\2\u0139\u0138\3\2\2"+
		"\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\5k\66\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b\63\2\2\u0141f\3\2\2\2\u0142\u0143\7^\2\2\u0143h\3\2\2\2\u0144"+
		"\u0145\5m\67\2\u0145\u0146\5g\64\2\u0146\u0147\5s:\2\u0147j\3\2\2\2\u0148"+
		"\u0149\5m\67\2\u0149\u014a\5s:\2\u014al\3\2\2\2\u014b\u014d\n\b\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014fn\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\61\2\2\u0152\u0153"+
		"\7\61\2\2\u0153p\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156\5g\64\2\u0156"+
		"\u0157\5s:\2\u0157\u015b\7\61\2\2\u0158\u015a\5i\65\2\u0159\u0158\3\2"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5k\66\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\b9\2\2\u0161r\3\2\2\2\u0162\u0164\7\17\2\2\u0163\u0162"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\f\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\b:\2\2\u0168t\3\2\2\2\u0169\u016b\t\t\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b;\2\2\u016fv\3\2\2\2\33\2\u00ca"+
		"\u00cc\u00d0\u00d9\u00df\u00e1\u00e7\u00e9\u00ef\u00f5\u00ff\u0104\u0107"+
		"\u010e\u0112\u0117\u011a\u0121\u0134\u013b\u014e\u015b\u0163\u016c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}