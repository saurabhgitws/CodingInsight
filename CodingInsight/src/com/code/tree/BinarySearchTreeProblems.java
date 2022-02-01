package com.code.tree;


class BinarySearchTreeSolutions{
       NodeBinaryTreeNode mRoot;
       
       public void insertNode(int key) {
    	  
       }
       
       public void insertNode(NodeBinaryTreeNode root,int key) {
    	   if(mRoot== null) {
    		   mRoot = new NodeBinaryTreeNode(key);
    		   return;
    	   }
    	   
    	   if(root==null)
    		   return;
    	   
    	   if(key < root.key) {
    		   if(root.leftChild== null) {
    			   root.leftChild = new NodeBinaryTreeNode(key);
    			   root.leftChild.parent = root;
    		   }else {
    			   insertNode(root.leftChild,key);
    		   }
    	   }else {
    		   if(root.rightChild== null) {
    			   root.rightChild = new NodeBinaryTreeNode(key);
    			   root.rightChild.parent = root;
    		   }else {
    			   insertNode(root.rightChild,key);
    		   }
    	   }
       }
}

public class BinarySearchTreeProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
