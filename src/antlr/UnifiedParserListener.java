// Generated from D:/مشاريع المترجمات/Compiler_project/src/antlr/UnifiedParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UnifiedParser}.
 */
public interface UnifiedParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UnifiedParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UnifiedParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#programItem}.
	 * @param ctx the parse tree
	 */
	void enterProgramItem(UnifiedParser.ProgramItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#programItem}.
	 * @param ctx the parse tree
	 */
	void exitProgramItem(UnifiedParser.ProgramItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(UnifiedParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(UnifiedParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(UnifiedParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(UnifiedParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(UnifiedParser.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(UnifiedParser.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#scriptJsonBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptJsonBlock(UnifiedParser.ScriptJsonBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#scriptJsonBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptJsonBlock(UnifiedParser.ScriptJsonBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(UnifiedParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(UnifiedParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(UnifiedParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(UnifiedParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterVoidHtmlElement(UnifiedParser.VoidHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#voidHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitVoidHtmlElement(UnifiedParser.VoidHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#voidName}.
	 * @param ctx the parse tree
	 */
	void enterVoidName(UnifiedParser.VoidNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#voidName}.
	 * @param ctx the parse tree
	 */
	void exitVoidName(UnifiedParser.VoidNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(UnifiedParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(UnifiedParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(UnifiedParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(UnifiedParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(UnifiedParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(UnifiedParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(UnifiedParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(UnifiedParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(UnifiedParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(UnifiedParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(UnifiedParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(UnifiedParser.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmt(UnifiedParser.JinjaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#jinjaStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmt(UnifiedParser.JinjaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(UnifiedParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(UnifiedParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(UnifiedParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(UnifiedParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(UnifiedParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(UnifiedParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#jinjaExtends}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExtends(UnifiedParser.JinjaExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#jinjaExtends}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExtends(UnifiedParser.JinjaExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void enterCssStylesheet(UnifiedParser.CssStylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void exitCssStylesheet(UnifiedParser.CssStylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(UnifiedParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(UnifiedParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(UnifiedParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(UnifiedParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(UnifiedParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(UnifiedParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#elementSelector}.
	 * @param ctx the parse tree
	 */
	void enterElementSelector(UnifiedParser.ElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#elementSelector}.
	 * @param ctx the parse tree
	 */
	void exitElementSelector(UnifiedParser.ElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(UnifiedParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(UnifiedParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(UnifiedParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(UnifiedParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#valueGroup}.
	 * @param ctx the parse tree
	 */
	void enterValueGroup(UnifiedParser.ValueGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#valueGroup}.
	 * @param ctx the parse tree
	 */
	void exitValueGroup(UnifiedParser.ValueGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(UnifiedParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(UnifiedParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#jsonDocument}.
	 * @param ctx the parse tree
	 */
	void enterJsonDocument(UnifiedParser.JsonDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#jsonDocument}.
	 * @param ctx the parse tree
	 */
	void exitJsonDocument(UnifiedParser.JsonDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(UnifiedParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(UnifiedParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(UnifiedParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(UnifiedParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(UnifiedParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(UnifiedParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnifiedParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(UnifiedParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnifiedParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(UnifiedParser.ArrayContext ctx);
}