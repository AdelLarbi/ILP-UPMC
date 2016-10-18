// Generated from ILPMLgrammar3.g4 by ANTLR 4.5.3

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ILPMLgrammar3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ILPMLgrammar3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar3Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ILPMLgrammar3Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar3Parser#globalFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFunDef(ILPMLgrammar3Parser.GlobalFunDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar3Parser#localFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalFunDef(ILPMLgrammar3Parser.LocalFunDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInteger(ILPMLgrammar3Parser.ConstIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ILPMLgrammar3Parser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry(ILPMLgrammar3Parser.TryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ILPMLgrammar3Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(ILPMLgrammar3Parser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFalse(ILPMLgrammar3Parser.ConstFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ILPMLgrammar3Parser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(ILPMLgrammar3Parser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFloat(ILPMLgrammar3Parser.ConstFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(ILPMLgrammar3Parser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodefinitions(ILPMLgrammar3Parser.CodefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(ILPMLgrammar3Parser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ILPMLgrammar3Parser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTrue(ILPMLgrammar3Parser.ConstTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ILPMLgrammar3Parser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstString(ILPMLgrammar3Parser.ConstStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(ILPMLgrammar3Parser.BindingContext ctx);
}