// Generated from ILPMLgrammar2.g4 by ANTLR 4.5.3

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ILPMLgrammar2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ILPMLgrammar2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ILPMLgrammar2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar2Parser#globalFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFunDef(ILPMLgrammar2Parser.GlobalFunDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInteger(ILPMLgrammar2Parser.ConstIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ILPMLgrammar2Parser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ILPMLgrammar2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(ILPMLgrammar2Parser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFalse(ILPMLgrammar2Parser.ConstFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ILPMLgrammar2Parser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(ILPMLgrammar2Parser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFloat(ILPMLgrammar2Parser.ConstFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(ILPMLgrammar2Parser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ILPMLgrammar2Parser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTrue(ILPMLgrammar2Parser.ConstTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ILPMLgrammar2Parser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstString(ILPMLgrammar2Parser.ConstStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(ILPMLgrammar2Parser.BindingContext ctx);
}