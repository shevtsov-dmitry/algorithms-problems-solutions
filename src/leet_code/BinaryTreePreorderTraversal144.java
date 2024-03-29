
import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreePreorderTraversal144
 */

void main(String[] args) {
    TreeNode node = new TreeNode(1);
    node.right = new TreeNode(2);
    node.right.left = new TreeNode(3);
    preorderTraversal(node);
}

List<Integer> preorderTraversal(TreeNode node) {
    List<Integer> list = new ArrayList<>();
    traverse(node, list);
    System.out.println(list);
    return list;
}

void traverse(TreeNode node, List<Integer> list) {
    if (node != null) {
        list.add(node.val);
        traverse(node.left, list);
        traverse(node.right, list);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

