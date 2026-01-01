package visitor;

import java.util.List;

<<<<<<< HEAD
=======
// يدعم كلا النوعين: Ast.AstNode و AST.ASTNode عبر الانعكاس البسيط
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
public class AstPrinter {

    public static void print(Object root) {
        printRecursive(root, "", true);
    }

    private static void printRecursive(Object node, String prefix, boolean isLast) {
        if (node == null) return;

        System.out.print(prefix);
        System.out.print(isLast ? "└─────" : "├─────");

<<<<<<< HEAD
        // نعتمد فقط على toString() للعقدة
        System.out.println(node.toString());
=======
        String label = node.toString();
        int line = getField(node, "line");
        int col  = getField(node, "column");

        if (line >= 0 && col >= 0) {
            System.out.println(label + "  @" + line + ":" + col);
        } else {
            System.out.println(label);
        }
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8

        List<?> children = getChildren(node);
        for (int i = 0; i < children.size(); i++) {
            printRecursive(children.get(i), prefix + (isLast ? "    " : "│   "), i == children.size() - 1);
        }
    }

    @SuppressWarnings("unchecked")
    private static List<?> getChildren(Object node) {
        try {
            var m = node.getClass().getMethod("getChildren");
            return (List<?>) m.invoke(node);
        } catch (Exception e) {
<<<<<<< HEAD
            return java.util.Collections.emptyList();
        }
    }
=======
            // لبعض عقد Python التي لا تحتوي getChildren؛ نجمع عبر الحقول الشائعة إن لزم
            return java.util.Collections.emptyList();
        }
    }

    private static int getField(Object node, String name) {
        try {
            var f = node.getClass().getField(name);
            Object v = f.get(node);
            return (v instanceof Integer) ? (Integer) v : -1;
        } catch (Exception e) {
            return -1;
        }
    }
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
}