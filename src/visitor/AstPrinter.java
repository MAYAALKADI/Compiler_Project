package visitor;

import java.util.List;

public class AstPrinter {

    public static void print(Object root) {
        printRecursive(root, "", true);
    }

    private static void printRecursive(Object node, String prefix, boolean isLast) {
        if (node == null) return;

        System.out.print(prefix);
        System.out.print(isLast ? "└─────" : "├─────");

        // نعتمد فقط على toString() للعقدة
        System.out.println(node.toString());

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
            return java.util.Collections.emptyList();
        }
    }
}