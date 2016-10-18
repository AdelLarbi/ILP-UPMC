// Generated from ILPMLgrammar3.g4 by ANTLR 4.5.3

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ILPMLgrammar3Parser}.
 */
public interface ILPMLgrammar3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ILPMLgrammar3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ILPMLgrammar3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar3Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunDef(ILPMLgrammar3Parser.GlobalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar3Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunDef(ILPMLgrammar3Parser.GlobalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar3Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void enterLocalFunDef(ILPMLgrammar3Parser.LocalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar3Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void exitLocalFunDef(ILPMLgrammar3Parser.LocalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstInteger(ILPMLgrammar3Parser.ConstIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstInteger(ILPMLgrammar3Parser.ConstIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ILPMLgrammar3Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ILPMLgrammar3Parser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTry(ILPMLgrammar3Parser.TryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTry(ILPMLgrammar3Parser.TryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ILPMLgrammar3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ILPMLgrammar3Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(ILPMLgrammar3Parser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(ILPMLgrammar3Parser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(ILPMLgrammar3Parser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(ILPMLgrammar3Parser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ILPMLgrammar3Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ILPMLgrammar3Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(ILPMLgrammar3Parser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(ILPMLgrammar3Parser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFloat(ILPMLgrammar3Parser.ConstFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFloat(ILPMLgrammar3Parser.ConstFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ILPMLgrammar3Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ILPMLgrammar3Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCodefinitions(ILPMLgrammar3Parser.CodefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCodefinitions(ILPMLgrammar3Parser.CodefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(ILPMLgrammar3Parser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(ILPMLgrammar3Parser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ILPMLgrammar3Parser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ILPMLgrammar3Parser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstTrue(ILPMLgrammar3Parser.ConstTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstTrue(ILPMLgrammar3Parser.ConstTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ILPMLgrammar3Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ILPMLgrammar3Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstString(ILPMLgrammar3Parser.ConstStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstString(ILPMLgrammar3Parser.ConstStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinding(ILPMLgrammar3Parser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinding(ILPMLgrammar3Parser.BindingContext ctx);
}