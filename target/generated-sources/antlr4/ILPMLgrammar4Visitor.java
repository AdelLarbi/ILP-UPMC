// Generated from ILPMLgrammar4.g4 by ANTLR 4.5.3

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ILPMLgrammar4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ILPMLgrammar4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar4Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ILPMLgrammar4Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalFunctionDefinition}
	 * labeled alternative in {@link ILPMLgrammar4Parser#globalDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFunctionDefinition(ILPMLgrammar4Parser.GlobalFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link ILPMLgrammar4Parser#globalDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(ILPMLgrammar4Parser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar4Parser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(ILPMLgrammar4Parser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar4Parser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(ILPMLgrammar4Parser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar4Parser#globalFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFunDef(ILPMLgrammar4Parser.GlobalFunDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ILPMLgrammar4Parser#localFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalFunDef(ILPMLgrammar4Parser.LocalFunDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend(ILPMLgrammar4Parser.SendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInteger(ILPMLgrammar4Parser.ConstIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ILPMLgrammar4Parser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteField}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteField(ILPMLgrammar4Parser.WriteFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry(ILPMLgrammar4Parser.TryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ILPMLgrammar4Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadField}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadField(ILPMLgrammar4Parser.ReadFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Self}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(ILPMLgrammar4Parser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(ILPMLgrammar4Parser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(ILPMLgrammar4Parser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFalse(ILPMLgrammar4Parser.ConstFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper(ILPMLgrammar4Parser.SuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ILPMLgrammar4Parser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(ILPMLgrammar4Parser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFloat(ILPMLgrammar4Parser.ConstFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(ILPMLgrammar4Parser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodefinitions(ILPMLgrammar4Parser.CodefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(ILPMLgrammar4Parser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ILPMLgrammar4Parser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ILPMLgrammar4Parser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTrue(ILPMLgrammar4Parser.ConstTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstString(ILPMLgrammar4Parser.ConstStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(ILPMLgrammar4Parser.BindingContext ctx);
}