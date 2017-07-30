package week4.recursion.tree_task;

import java.util.Arrays;

/**
 * Обход в глубину - с помощью рекурсии.
 * Есть еще обход в ширину, но его можно реализовать циклом с Queue
 */
public class TestCreationTree {

    public static void main(String[] args) {
        TreeNode employee1 = new TreeNode(1000, "employee1");
        TreeNode employee2 = new TreeNode(3000, "employee2");
        TreeNode employee3 = new TreeNode(4000, "employee3");
        TreeNode employee4 = new TreeNode(5000, "employee4");

        TreeNode manager1 = new TreeNode(200, Arrays.asList(employee1, employee2), "manager");
        TreeNode manager2 = new TreeNode(300, Arrays.asList(employee3, employee4), "manager");
        TreeNode manager3 = new TreeNode(400, Arrays.asList(new TreeNode(800, "employee5")),  "manager");

        TreeNode director = new TreeNode(2000, Arrays.asList(manager1, manager2, manager3), "director");

        System.out.println(TreeNodeUtils.count(director));
    }


}
