// Generated from D:/مشاريع المترجمات/Compiler_project/src/antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStmtLine}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStmtLine}
	 * labeled alternative in {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmtLine(PythonParser.SimpleStmtLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(PythonParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(PythonParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(PythonParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DottedName}
	 * labeled alternative in {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DottedName}
	 * labeled alternative in {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameList}
	 * labeled alternative in {@link PythonParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterNameList(PythonParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameList}
	 * labeled alternative in {@link PythonParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitNameList(PythonParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(PythonParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOnlyStmt}
	 * labeled alternative in {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprOnlyStmt(PythonParser.ExprOnlyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOnlyStmt}
	 * labeled alternative in {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprOnlyStmt(PythonParser.ExprOnlyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDef}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dec_orator}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDec_orator(PythonParser.Dec_oratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dec_orator}
	 * labeled alternative in {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDec_orator(PythonParser.Dec_oratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParamList(PythonParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link PythonParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParamList(PythonParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuiteBlock}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuiteBlock(PythonParser.SuiteBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuiteBlock}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuiteBlock(PythonParser.SuiteBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuiteSimple}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuiteSimple(PythonParser.SuiteSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuiteSimple}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuiteSimple(PythonParser.SuiteSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIfElse}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIfElse(PythonParser.ExprIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIfElse}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIfElse(PythonParser.ExprIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comp_arison}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComp_arison(PythonParser.Comp_arisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comp_arison}
	 * labeled alternative in {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComp_arison(PythonParser.Comp_arisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PythonParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PythonParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link PythonParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExprPrimary}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExprPrimary(PythonParser.AtomExprPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExprPrimary}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExprPrimary(PythonParser.AtomExprPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PythonParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenExpr}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterGenExpr(PythonParser.GenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenExpr}
	 * labeled alternative in {@link PythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitGenExpr(PythonParser.GenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryAtom}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAtom(PythonParser.PrimaryAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryAtom}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAtom(PythonParser.PrimaryAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterAttrTrailer(PythonParser.AttrTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitAttrTrailer(PythonParser.AttrTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomList}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomList(PythonParser.AtomListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomList}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomList(PythonParser.AtomListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomDict}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomDict(PythonParser.AtomDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomDict}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomDict(PythonParser.AtomDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PythonParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link PythonParser#list_literal}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link PythonParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link PythonParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArgList(PythonParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link PythonParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArgList(PythonParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArg(PythonParser.KeywordArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArg(PythonParser.PositionalArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArg}
	 * labeled alternative in {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArg(PythonParser.PositionalArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorExpr}
	 * labeled alternative in {@link PythonParser#generator_expr}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExpr(PythonParser.GeneratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorExpr}
	 * labeled alternative in {@link PythonParser#generator_expr}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExpr(PythonParser.GeneratorExprContext ctx);
}