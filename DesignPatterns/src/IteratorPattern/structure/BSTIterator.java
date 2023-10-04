package IteratorPattern.structure;





import java.util.Stack;

public class BSTIterator  {

    private final TreeNode root;
    private final Stack<TreeNode> nodes;

    public BSTIterator(TreeNode root) {
        this.root = root;
        this.nodes = new Stack<>();
        init();
    }



    private void init() {
        TreeNode curr = root;
        while (curr != null) {
            nodes.push(curr);
            curr = curr.getLeft();
        }
    }
}