package com.practice.tree;


import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        InOrderTraversal inOrderTraversalMeth = new InOrderTraversal();
        inOrderTraversalMeth.inorderTraversal(root);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return inOrder;
    }
    public List<Integer> inOrder = new ArrayList<>();
    public void add(TreeNode node) {
        inOrder.add(node.val);
    }
    public void traverse(TreeNode node) {
        if(node.left==null && node.right==null) {
            add(node);
        }
        while(node.left != null || node.right != null) {
            if(node.left != null)
                traverse(node.left);
            add(node);
            if(node.right != null)
                traverse(node.right);
        }
    }

    public static class TreeNode {
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

}
