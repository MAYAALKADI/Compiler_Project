// Generated from D:/مشاريع المترجمات/Compiler_project/src/antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStmtLine}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(PythonParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DottedName}
	 * labeled alternative in {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameList}
	 * labeled alternative in {@link PythonParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(PythonParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOnlyStmt}
	 * labeled alternative in {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOnlyStmt(PythonParser.ExprOnlyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dec_orator}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_orator(PythonParser.Dec_oratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(PythonParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuiteBlock}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuiteBlock(PythonParser.SuiteBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuiteSimple}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuiteSimple(PythonParser.SuiteSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIfElse}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIfElse(PythonParser.ExprIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comp_arison}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_arison(PythonParser.Comp_arisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExprPrimary}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExprPrimary(PythonParser.AtomExprPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenExpr}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExpr(PythonParser.GenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryAtom}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAtom(PythonParser.PrimaryAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrTrailer(PythonParser.AttrTrailerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomList}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomList(PythonParser.AtomListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomDict}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomDict(PythonParser.AtomDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PythonParser#list_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#dict_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link PythonParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(PythonParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArg(PythonParser.PositionalArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorExpr}
	 * labeled alternative in {@link PythonParser#generator_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExpr(PythonParser.GeneratorExprContext ctx);
}