package leet;

public class GreaterTree {

    public void addKeys(TreeNode node){
        int left = node.left != null ? node.left.val : 0;
        int right = node.right != null ? node.right.val : 0;
        int root = node.val;
        if( right > root && right > left) {
            if(left  > root){
                node.val = root + right + left;
                node.left.val = right + root;
            } else {
                node.left.val = root + right + left;
                node.val = right + root;
            }
        } else if(left > root && left > right){
            if(right  > root){
                node.val = root + right + left;
                node.right.val = left + root;
            } else {
                node.right.val = root + right + left;
                node.val = left + root;
            }
        } else {
            if(right  > left){
                node.left.val = root + right + left;
                node.right.val = right + root;
            } else {
                node.right.val = root + right + left;
                node.left.val = left + root;
            }
        }
    }

    public void recursive(TreeNode node){
        if(node != null){
            recursive(node.right);
        }
    }

    public TreeNode convertBST(TreeNode root) {
        recursive(root);
    return root;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = null;// = new TreeNode(13);
        TreeNode root = new TreeNode(1);

    root.left = left;
    root.right = right;

    GreaterTree tree = new GreaterTree();
    tree.convertBST(root);
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
