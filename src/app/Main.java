package app;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;

import antlr.UnifiedLexer;
import antlr.UnifiedParser;

import antlr.PythonLexer;
import antlr.PythonParser;

import Ast_Web.AstNode;
import visitor.HtmlAstBuilderVisitor;
import visitor.PythonAstBuilder;
import visitor.AstPrinter;
import shared.SymbolTable;

public class Main {

    public static void main(String[] args) throws Exception {

        // 1) جدول رموز مشترك
        SymbolTable symbols = new SymbolTable();

        // 2) قراءة ملف HTML/Jinja/CSS/JSON
        Path webPath = Paths.get("src", "resources", "input.html");
        String webCode = java.nio.file.Files.readString(webPath, StandardCharsets.UTF_8);

        UnifiedLexer webLexer = new UnifiedLexer(CharStreams.fromString(webCode));
        CommonTokenStream webTokens = new CommonTokenStream(webLexer);
        UnifiedParser webParser = new UnifiedParser(webTokens);

        var webTree = webParser.program();
        HtmlAstBuilderVisitor webVisitor = new HtmlAstBuilderVisitor(symbols);
        AstNode webAst = webVisitor.visit(webTree);

        // 3) قراءة ملف Python/Flask
        Path pyPath = Paths.get("src", "resources","example.py");
        PythonLexer pyLexer = new PythonLexer(CharStreams.fromPath(pyPath, StandardCharsets.UTF_8));
        CommonTokenStream pyTokens = new CommonTokenStream(pyLexer);
        PythonParser pyParser = new PythonParser(pyTokens);

        var pyTree = pyParser.file_input();
        var pyAst = (Ast_Paython.Program) new PythonAstBuilder(symbols).visit(pyTree);

        // 4) الطباعة
        System.out.println("==== شجرة HTML/Jinja/CSS/JSON ====");
        AstPrinter.print(webAst);

        System.out.println("\n==== شجرة Flask/Python ====");
        AstPrinter.print(pyAst);

        System.out.println("\n==== Symbol Table (مشترك) ====");
        symbols.print();
    }
}