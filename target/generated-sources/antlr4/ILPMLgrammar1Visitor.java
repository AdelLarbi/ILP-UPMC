// Generated from ILPMLgrammar1.g4 by ANTLR 4.5.3

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ILPMLgrammar1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ILPMLgrammar1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ILPMLgrammar1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInteger(ILPMLgrammar1Parser.ConstIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ILPMLgrammar1Parser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ILPMLgrammar1Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFloat(ILPMLgrammar1Parser.ConstFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(ILPMLgrammar1Parser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFalse(ILPMLgrammar1Parser.ConstFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTrue(ILPMLgrammar1Parser.ConstTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ILPMLgrammar1Parser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(ILPMLgrammar1Parser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstString(ILPMLgrammar1Parser.ConstStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ILPMLgrammar1Parser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(ILPMLgrammar1Parser.InvocationContext ctx);
}