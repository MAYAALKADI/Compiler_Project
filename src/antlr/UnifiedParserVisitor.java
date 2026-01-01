// Generated from D:/مشاريع المترجمات/Compiler_project/src/antlr/UnifiedParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnifiedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UnifiedParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(UnifiedParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#programItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramItem(UnifiedParser.ProgramItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(UnifiedParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(UnifiedParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(UnifiedParser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#scriptJsonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptJsonBlock(UnifiedParser.ScriptJsonBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(UnifiedParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(UnifiedParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidHtmlElement(UnifiedParser.VoidHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#voidName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidName(UnifiedParser.VoidNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(UnifiedParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(UnifiedParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(UnifiedParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(UnifiedParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(UnifiedParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(UnifiedParser.MiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#jinjaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmt(UnifiedParser.JinjaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(UnifiedParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(UnifiedParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(UnifiedParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#jinjaExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExtends(UnifiedParser.JinjaExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#cssStylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStylesheet(UnifiedParser.CssStylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(UnifiedParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(UnifiedParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(UnifiedParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#elementSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSelector(UnifiedParser.ElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#pseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(UnifiedParser.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(UnifiedParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#valueGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueGroup(UnifiedParser.ValueGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(UnifiedParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#jsonDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonDocument(UnifiedParser.JsonDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(UnifiedParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(UnifiedParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(UnifiedParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnifiedParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(UnifiedParser.ArrayContext ctx);
}