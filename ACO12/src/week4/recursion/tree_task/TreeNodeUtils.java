package week4.recursion.tree_task;

/**
 * Created by 1 on 10.05.2017.
 */
public class TreeNodeUtils {
    public static int count(TreeNode root) {
        int amount = root.amount;

        if (root.slaves == null) {
            return root.amount;
        }

        for (TreeNode slave : root.slaves)
            amount += count(slave);

        return amount;
    }
}
