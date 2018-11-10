// Generated from C1Parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C1Parser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_decl = 1, RULE_constdecl = 2, RULE_constdef = 3, 
		RULE_vardecl = 4, RULE_btype = 5, RULE_vardef = 6, RULE_funcdef = 7, RULE_block = 8, 
		RULE_blockItem = 9, RULE_stmt = 10, RULE_lval = 11, RULE_cond = 12, RULE_relop = 13, 
		RULE_exp = 14, RULE_number = 15, RULE_binop = 16, RULE_unaryop = 17;
	public static final String[] ruleNames = {
		"compilationUnit", "decl", "constdecl", "constdef", "vardecl", "btype", 
		"vardef", "funcdef", "block", "blockItem", "stmt", "lval", "cond", "relop", 
		"exp", "number", "binop", "unaryop"
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

	@Override
	public String getGrammarFileName() { return "C1Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(C1Parser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Const:
				case Int:
				case Float:
					{
					setState(36);
					decl();
					}
					break;
				case Void:
					{
					setState(37);
					funcdef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Int) | (1L << Float) | (1L << Void))) != 0) );
			setState(42);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public ConstdeclContext constdecl() {
			return getRuleContext(ConstdeclContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				constdecl();
				}
				break;
			case Int:
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				vardecl();
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

	public static class ConstdeclContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(C1Parser.Const, 0); }
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public List<ConstdefContext> constdef() {
			return getRuleContexts(ConstdefContext.class);
		}
		public ConstdefContext constdef(int i) {
			return getRuleContext(ConstdefContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(C1Parser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(C1Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(C1Parser.Comma, i);
		}
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterConstdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitConstdecl(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(Const);
			setState(49);
			btype();
			setState(50);
			constdef();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(51);
				match(Comma);
				setState(52);
				constdef();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(SemiColon);
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

	public static class ConstdefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C1Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(C1Parser.Assign, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(C1Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(C1Parser.RightBracket, 0); }
		public TerminalNode LeftBrace() { return getToken(C1Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(C1Parser.RightBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(C1Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(C1Parser.Comma, i);
		}
		public ConstdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterConstdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitConstdef(this);
		}
	}

	public final ConstdefContext constdef() throws RecognitionException {
		ConstdefContext _localctx = new ConstdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constdef);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(Identifier);
				setState(61);
				match(Assign);
				setState(62);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(Identifier);
				setState(64);
				match(LeftBracket);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Identifier) | (1L << IntConst) | (1L << FloatConst))) != 0)) {
					{
					setState(65);
					exp(0);
					}
				}

				setState(68);
				match(RightBracket);
				setState(69);
				match(Assign);
				setState(70);
				match(LeftBrace);
				setState(71);
				exp(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(72);
					match(Comma);
					setState(73);
					exp(0);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(RightBrace);
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

	public static class VardeclContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(C1Parser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(C1Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(C1Parser.Comma, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			btype();
			setState(84);
			vardef();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(85);
				match(Comma);
				setState(86);
				vardef();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(SemiColon);
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

	public static class BtypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(C1Parser.Int, 0); }
		public TerminalNode Float() { return getToken(C1Parser.Float, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterBtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitBtype(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_btype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C1Parser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(C1Parser.LeftBracket, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(C1Parser.RightBracket, 0); }
		public TerminalNode Assign() { return getToken(C1Parser.Assign, 0); }
		public TerminalNode LeftBrace() { return getToken(C1Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(C1Parser.RightBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(C1Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(C1Parser.Comma, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardef);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(Identifier);
				setState(98);
				match(LeftBracket);
				setState(99);
				exp(0);
				setState(100);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(Identifier);
				setState(103);
				match(Assign);
				setState(104);
				exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(Identifier);
				setState(106);
				match(LeftBracket);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Identifier) | (1L << IntConst) | (1L << FloatConst))) != 0)) {
					{
					setState(107);
					exp(0);
					}
				}

				setState(110);
				match(RightBracket);
				setState(111);
				match(Assign);
				setState(112);
				match(LeftBrace);
				setState(113);
				exp(0);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(114);
					match(Comma);
					setState(115);
					exp(0);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(RightBrace);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(C1Parser.Void, 0); }
		public TerminalNode Identifier() { return getToken(C1Parser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(C1Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(C1Parser.RightParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitFuncdef(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Void);
			setState(126);
			match(Identifier);
			setState(127);
			match(LeftParen);
			setState(128);
			match(RightParen);
			setState(129);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(C1Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(C1Parser.RightBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LeftBrace);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SemiColon) | (1L << LeftBrace) | (1L << If) | (1L << While) | (1L << Const) | (1L << Int) | (1L << Float) | (1L << Identifier))) != 0)) {
				{
				{
				setState(132);
				blockItem();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RightBrace);
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

	public static class BlockItemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockItem);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case Int:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				decl();
				}
				break;
			case SemiColon:
			case LeftBrace:
			case If:
			case While:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public TerminalNode Assign() { return getToken(C1Parser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(C1Parser.SemiColon, 0); }
		public TerminalNode Identifier() { return getToken(C1Parser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(C1Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(C1Parser.RightParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode If() { return getToken(C1Parser.If, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(C1Parser.Else, 0); }
		public TerminalNode While() { return getToken(C1Parser.While, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				lval();
				setState(145);
				match(Assign);
				setState(146);
				exp(0);
				setState(147);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Identifier);
				setState(150);
				match(LeftParen);
				setState(151);
				match(RightParen);
				setState(152);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(If);
				setState(155);
				match(LeftParen);
				setState(156);
				cond();
				setState(157);
				match(RightParen);
				setState(158);
				stmt();
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(159);
					match(Else);
					setState(160);
					stmt();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(While);
				setState(164);
				match(LeftParen);
				setState(165);
				cond();
				setState(166);
				match(RightParen);
				setState(167);
				stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(SemiColon);
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

	public static class LvalContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(C1Parser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(C1Parser.LeftBracket, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(C1Parser.RightBracket, 0); }
		public LvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterLval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitLval(this);
		}
	}

	public final LvalContext lval() throws RecognitionException {
		LvalContext _localctx = new LvalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lval);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Identifier);
				setState(174);
				match(LeftBracket);
				setState(175);
				exp(0);
				setState(176);
				match(RightBracket);
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

	public static class CondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			exp(0);
			setState(181);
			relop();
			setState(182);
			exp(0);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(C1Parser.Equal, 0); }
		public TerminalNode NonEqual() { return getToken(C1Parser.NonEqual, 0); }
		public TerminalNode Less() { return getToken(C1Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(C1Parser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(C1Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(C1Parser.GreaterEqual, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NonEqual) | (1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpContext extends ParserRuleContext {
		public UnaryopContext unaryop() {
			return getRuleContext(UnaryopContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(C1Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(C1Parser.RightParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LvalContext lval() {
			return getRuleContext(LvalContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
				{
				setState(187);
				unaryop();
				setState(188);
				exp(5);
				}
				break;
			case LeftParen:
				{
				setState(190);
				match(LeftParen);
				setState(191);
				exp(0);
				setState(192);
				match(RightParen);
				}
				break;
			case IntConst:
			case FloatConst:
				{
				setState(194);
				number();
				}
				break;
			case Identifier:
				{
				setState(195);
				lval();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(198);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(199);
					binop();
					setState(200);
					exp(5);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FloatConst() { return getToken(C1Parser.FloatConst, 0); }
		public TerminalNode IntConst() { return getToken(C1Parser.IntConst, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==IntConst || _la==FloatConst) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(C1Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(C1Parser.Minus, 0); }
		public TerminalNode Multiply() { return getToken(C1Parser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(C1Parser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(C1Parser.Modulo, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Multiply) | (1L << Divide) | (1L << Modulo))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnaryopContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(C1Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(C1Parser.Minus, 0); }
		public UnaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).enterUnaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C1ParserListener ) ((C1ParserListener)listener).exitUnaryop(this);
		}
	}

	public final UnaryopContext unaryop() throws RecognitionException {
		UnaryopContext _localctx = new UnaryopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unaryop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\5\3\61\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5\5\5"+
		"T\n\5\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n\3\13\3\13\5\13\u0091"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00a4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c7\n\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00cd\n\20\f\20\16\20\u00d0\13\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\2\3\36\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\7\3"+
		"\2\33\34\3\2\20\25\3\2\37 \3\2\26\32\3\2\26\27\2\u00df\2(\3\2\2\2\4\60"+
		"\3\2\2\2\6\62\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\f`\3\2\2\2\16}\3\2\2\2\20"+
		"\177\3\2\2\2\22\u0085\3\2\2\2\24\u0090\3\2\2\2\26\u00ac\3\2\2\2\30\u00b4"+
		"\3\2\2\2\32\u00b6\3\2\2\2\34\u00ba\3\2\2\2\36\u00c6\3\2\2\2 \u00d1\3\2"+
		"\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2\2&)\5\4\3\2\')\5\20\t\2(&\3\2\2\2(\'"+
		"\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\2\2\3-\3\3\2\2\2"+
		".\61\5\6\4\2/\61\5\n\6\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\7"+
		"\17\2\2\63\64\5\f\7\2\649\5\b\5\2\65\66\7\3\2\2\668\5\b\5\2\67\65\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\4\2\2=\7"+
		"\3\2\2\2>?\7\36\2\2?@\7\5\2\2@T\5\36\20\2AB\7\36\2\2BD\7\6\2\2CE\5\36"+
		"\20\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\7\2\2GH\7\5\2\2HI\7\b\2\2IN\5"+
		"\36\20\2JK\7\3\2\2KM\5\36\20\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PN\3\2\2\2QR\7\t\2\2RT\3\2\2\2S>\3\2\2\2SA\3\2\2\2T\t\3\2\2"+
		"\2UV\5\f\7\2V[\5\16\b\2WX\7\3\2\2XZ\5\16\b\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\4\2\2_\13\3\2\2\2`a\t\2\2\2a"+
		"\r\3\2\2\2b~\7\36\2\2cd\7\36\2\2de\7\6\2\2ef\5\36\20\2fg\7\7\2\2g~\3\2"+
		"\2\2hi\7\36\2\2ij\7\5\2\2j~\5\36\20\2kl\7\36\2\2ln\7\6\2\2mo\5\36\20\2"+
		"nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\7\2\2qr\7\5\2\2rs\7\b\2\2sx\5\36\20"+
		"\2tu\7\3\2\2uw\5\36\20\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2"+
		"\2\2zx\3\2\2\2{|\7\t\2\2|~\3\2\2\2}b\3\2\2\2}c\3\2\2\2}h\3\2\2\2}k\3\2"+
		"\2\2~\17\3\2\2\2\177\u0080\7\35\2\2\u0080\u0081\7\36\2\2\u0081\u0082\7"+
		"\n\2\2\u0082\u0083\7\13\2\2\u0083\u0084\5\22\n\2\u0084\21\3\2\2\2\u0085"+
		"\u0089\7\b\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0088\u008b\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\t\2\2\u008d\23\3\2\2\2\u008e\u0091\5\4\3"+
		"\2\u008f\u0091\5\26\f\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\25\3\2\2\2\u0092\u0093\5\30\r\2\u0093\u0094\7\5\2\2\u0094\u0095\5\36"+
		"\20\2\u0095\u0096\7\4\2\2\u0096\u00ad\3\2\2\2\u0097\u0098\7\36\2\2\u0098"+
		"\u0099\7\n\2\2\u0099\u009a\7\13\2\2\u009a\u00ad\7\4\2\2\u009b\u00ad\5"+
		"\22\n\2\u009c\u009d\7\f\2\2\u009d\u009e\7\n\2\2\u009e\u009f\5\32\16\2"+
		"\u009f\u00a0\7\13\2\2\u00a0\u00a3\5\26\f\2\u00a1\u00a2\7\r\2\2\u00a2\u00a4"+
		"\5\26\f\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ad\3\2\2\2"+
		"\u00a5\u00a6\7\16\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\5\32\16\2\u00a8"+
		"\u00a9\7\13\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\7"+
		"\4\2\2\u00ac\u0092\3\2\2\2\u00ac\u0097\3\2\2\2\u00ac\u009b\3\2\2\2\u00ac"+
		"\u009c\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\27\3\2\2"+
		"\2\u00ae\u00b5\7\36\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\7\6\2\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\u00b3\7\7\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3"+
		"\2\2\2\u00b4\u00af\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\5\36\20\2\u00b7"+
		"\u00b8\5\34\17\2\u00b8\u00b9\5\36\20\2\u00b9\33\3\2\2\2\u00ba\u00bb\t"+
		"\3\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\b\20\1\2\u00bd\u00be\5$\23\2\u00be"+
		"\u00bf\5\36\20\7\u00bf\u00c7\3\2\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\5"+
		"\36\20\2\u00c2\u00c3\7\13\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c7\5 \21\2"+
		"\u00c5\u00c7\5\30\r\2\u00c6\u00bc\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ce\3\2\2\2\u00c8\u00c9\f\6\2\2\u00c9"+
		"\u00ca\5\"\22\2\u00ca\u00cb\5\36\20\7\u00cb\u00cd\3\2\2\2\u00cc\u00c8"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\t\4\2\2\u00d2!\3\2\2\2\u00d3"+
		"\u00d4\t\5\2\2\u00d4#\3\2\2\2\u00d5\u00d6\t\6\2\2\u00d6%\3\2\2\2\24(*"+
		"\609DNS[nx}\u0089\u0090\u00a3\u00ac\u00b4\u00c6\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}