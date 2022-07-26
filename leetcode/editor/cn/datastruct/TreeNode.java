package datastruct;


// 这是一个二叉树的数据结构！
public class TreeNode {
    public TreeNode left;
    public int val;
    public TreeNode right;
    public TreeNode(TreeNode left, TreeNode treeNode) {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}