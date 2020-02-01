package com.dheerajdac.code.leet;

import java.util.ArrayList;
import java.util.List;

public class NodeDistanceK {


    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {

        List<Integer> list = new ArrayList<>();
        distanceK(root,target,K,list);
        return list;
    }

    public Integer distanceK(TreeNode root, TreeNode target, int K, List<Integer> childs){
        if(root.val == target.val){
            childDistance(root, K, childs);
            return K-1;
        } else {
            Integer left = null;
            Integer right = null;
            if(root.left != null){
                left = distanceK(root.left, target,K, childs);
            }
            if(root.right != null){
                right = distanceK(root.right, target,K, childs);
            }

            if(left != null  ) {
                if(left == 0){
                    childs.add(root.val);
                    return -1;
                }
                if(root.right != null)
                childDistance(root.right, left-1, childs);
                return left-1;
            }

            if(right != null ) {
                if(right == 0){
                    childs.add(root.val);
                    return -1;
                }
                if (root.left != null)
                childDistance(root.left, right-1, childs);
                return right-1;
            }

        }
        return null;
    }



    public void childDistance(TreeNode node,int  k, List<Integer> childs){
        if(k == 0){
            childs.add(node.val);
        } else {
            if(node.left != null){
                childDistance(node.left,k-1,childs);
            }
            if(node.right != null) {
                childDistance(node.right, k-1,childs);
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        node.right = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right.right = new TreeNode(3);

        NodeDistanceK nodeDistanceK = new NodeDistanceK();
        List<Integer> integers = nodeDistanceK.distanceK(node, node.right.right, 3);
        integers.toString();
        System.out.println(integers.toString());
    }
}