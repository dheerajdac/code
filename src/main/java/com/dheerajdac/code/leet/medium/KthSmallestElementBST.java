package com.dheerajdac.code.leet.medium;

import com.dheerajdac.code.leet.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementBST {


    public void inOrder(TreeNode node, List<TreeNode> list){
        if(node == null){
            return;
        }
        inOrder(node.left, list);
        list.add(node);
        inOrder(node.right, list);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        inOrder(root,treeNodeList);
        return treeNodeList.get(k-1).val;
    }
}
