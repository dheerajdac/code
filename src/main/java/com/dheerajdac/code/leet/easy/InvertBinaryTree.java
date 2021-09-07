package com.dheerajdac.code.leet.easy;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if(root == null){
			return root;
		}

		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;

		root.left = rightNode;
		root.right = leftNode;

		invertTree(rightNode);
		invertTree(leftNode);
		return root;
	}
}