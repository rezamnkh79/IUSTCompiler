// Generated from C:/Users/asus/Desktop/IUSTCompiler/Q4\MiniJavaLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, INTEGER_LITERAL=2, CLASS=3, LPAREN=4, RPAREN=5, LBRACE=6, 
		RBRACE=7, LBRACK=8, RBRACK=9, SEMI=10, COMMA=11, DOT=12, TRUE=13, FALSE=14, 
		PUBLIC=15, STATIC=16, VOID=17, MAIN=18, STRING=19, EXTENDS=20, RETURN=21, 
		INT=22, BOOLEAN=23, IF=24, ELSE=25, WHILE=26, SOUT=27, ASSIGN=28, ADD=29, 
		SUB=30, MUL=31, LT=32, ANDAND=33, LEN=34, NOT=35, NEW=36, THIS=37, WS=38, 
		COMMENT=39, LINE_COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "INTEGER_LITERAL", "Digit", "Letter", "LetterOrDigit", 
			"CLASS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "TRUE", "FALSE", "PUBLIC", "STATIC", "VOID", 
			"MAIN", "STRING", "EXTENDS", "RETURN", "INT", "BOOLEAN", "IF", "ELSE", 
			"WHILE", "SOUT", "ASSIGN", "ADD", "SUB", "MUL", "LT", "ANDAND", "LEN", 
			"NOT", "NEW", "THIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'class'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'true'", "'false'", "'public'", "'static'", "'void'", 
			"'main'", "'String'", "'extends'", "'return'", "'int'", "'boolean'", 
			"'if'", "'else'", "'while'", "'System.out.println'", "'='", "'+'", "'-'", 
			"'*'", "'<'", "'&&'", "'length'", "'!'", "'new'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "INTEGER_LITERAL", "CLASS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "TRUE", "FALSE", 
			"PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "EXTENDS", "RETURN", "INT", 
			"BOOLEAN", "IF", "ELSE", "WHILE", "SOUT", "ASSIGN", "ADD", "SUB", "MUL", 
			"LT", "ANDAND", "LEN", "NOT", "NEW", "THIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJavaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\3\3\3\3\7\3d\n\3\f\3\16\3g\13"+
		"\3\5\3i\n\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\6*\u0111\n"+
		"*\r*\16*\u0112\3*\3*\3+\3+\3+\3+\7+\u011b\n+\f+\16+\u011e\13+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\7,\u0129\n,\f,\16,\u012c\13,\3,\3,\3\u011c\2-\3\3"+
		"\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!"+
		"\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?"+
		"\36A\37C E!G\"I#K$M%O&Q\'S(U)W*\3\2\7\3\2\63;\3\2\62;\5\2C\\aac|\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\tl\3\2\2\2\13p\3\2"+
		"\2\2\rr\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25~\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3"+
		"\2\2\2!\u008a\3\2\2\2#\u008f\3\2\2\2%\u0095\3\2\2\2\'\u009c\3\2\2\2)\u00a3"+
		"\3\2\2\2+\u00a8\3\2\2\2-\u00ad\3\2\2\2/\u00b4\3\2\2\2\61\u00bc\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00c7\3\2\2\2\67\u00cf\3\2\2\29\u00d2\3\2\2\2;\u00d7"+
		"\3\2\2\2=\u00dd\3\2\2\2?\u00f0\3\2\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E"+
		"\u00f6\3\2\2\2G\u00f8\3\2\2\2I\u00fa\3\2\2\2K\u00fd\3\2\2\2M\u0104\3\2"+
		"\2\2O\u0106\3\2\2\2Q\u010a\3\2\2\2S\u0110\3\2\2\2U\u0116\3\2\2\2W\u0124"+
		"\3\2\2\2Y]\5\t\5\2Z\\\5\13\6\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^\4\3\2\2\2_]\3\2\2\2`i\7\62\2\2ae\t\2\2\2bd\5\7\4\2cb\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h`\3\2\2\2ha\3\2\2\2i\6\3"+
		"\2\2\2jk\t\3\2\2k\b\3\2\2\2lm\t\4\2\2m\n\3\2\2\2nq\5\t\5\2oq\5\7\4\2p"+
		"n\3\2\2\2po\3\2\2\2q\f\3\2\2\2rs\7e\2\2st\7n\2\2tu\7c\2\2uv\7u\2\2vw\7"+
		"u\2\2w\16\3\2\2\2xy\7*\2\2y\20\3\2\2\2z{\7+\2\2{\22\3\2\2\2|}\7}\2\2}"+
		"\24\3\2\2\2~\177\7\177\2\2\177\26\3\2\2\2\u0080\u0081\7]\2\2\u0081\30"+
		"\3\2\2\2\u0082\u0083\7_\2\2\u0083\32\3\2\2\2\u0084\u0085\7=\2\2\u0085"+
		"\34\3\2\2\2\u0086\u0087\7.\2\2\u0087\36\3\2\2\2\u0088\u0089\7\60\2\2\u0089"+
		" \3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d"+
		"\u008e\7g\2\2\u008e\"\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\7r\2\2\u0096\u0097\7w\2\2\u0097\u0098\7d\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7e\2\2\u009b&\3\2\2\2\u009c\u009d\7u\2"+
		"\2\u009d\u009e\7v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7e\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7f\2\2\u00a7*\3\2\2\2\u00a8\u00a9"+
		"\7o\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		",\3\2\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3.\3\2\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7z\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7p\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7u\2\2\u00bb\60\3\2"+
		"\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0"+
		"\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2\62\3\2\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\64\3\2\2\2\u00c7\u00c8"+
		"\7d\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\66\3\2\2\2\u00cf"+
		"\u00d0\7k\2\2\u00d0\u00d1\7h\2\2\u00d18\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6:\3\2\2\2\u00d7"+
		"\u00d8\7y\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7n\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc<\3\2\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7{\2"+
		"\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3"+
		"\7o\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7t\2"+
		"\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7n\2\2\u00ee\u00ef\7p\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1@\3"+
		"\2\2\2\u00f2\u00f3\7-\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5D\3\2"+
		"\2\2\u00f6\u00f7\7,\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9H\3\2\2"+
		"\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7(\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7"+
		"n\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7i\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7j\2\2\u0103L\3\2\2\2\u0104\u0105\7#\2\2\u0105N\3"+
		"\2\2\2\u0106\u0107\7p\2\2\u0107\u0108\7g\2\2\u0108\u0109\7y\2\2\u0109"+
		"P\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c\7j\2\2\u010c\u010d\7k\2\2\u010d"+
		"\u010e\7u\2\2\u010eR\3\2\2\2\u010f\u0111\t\5\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\b*\2\2\u0115T\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118"+
		"\7,\2\2\u0118\u011c\3\2\2\2\u0119\u011b\13\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7,\2\2\u0120\u0121\7\61\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\b+\2\2\u0123V\3\2\2\2\u0124\u0125\7\61\2\2"+
		"\u0125\u0126\7\61\2\2\u0126\u012a\3\2\2\2\u0127\u0129\n\6\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b,\2\2\u012eX\3\2\2\2\n"+
		"\2]ehp\u0112\u011c\u012a\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}