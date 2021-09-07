
package com.dheerajdac.code.leet.easy;

import java.util.*;

public class BinaryTreePaths {

	private void traverse(TreeNode node, String path, List<String> list){
		if(node == null){
			return;
		}

		if(node.left == null && node.right == null){
			list.add(path+node.val);
			return;
		}

		path = path + node.val+ "->";

		traverse(node.left, path, list);
		traverse(node.right, path, list);
	}

	public List<String> binaryTreePaths(TreeNode root){
		List<String> result = new ArrayList<>();
		traverse(root,"", result);
		return result;
	}
}