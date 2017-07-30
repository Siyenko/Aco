package week4.recursion.tree_task;

import java.util.List;

/**
 * Created by 1 on 10.05.2017.
 */
public class TreeNode {

    public int amount;
    public List<TreeNode> slaves;
    String name;

    public TreeNode() {
    }

    public TreeNode(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public TreeNode(int amount, List<TreeNode> slaves, String name) {
        this.amount = amount;
        this.slaves = slaves;
        this.name = name;
    }
}

