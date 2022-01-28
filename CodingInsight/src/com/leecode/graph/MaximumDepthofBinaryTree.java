package com.leecode.graph;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int MaxCount=0;
    public int maxDepth(TreeNode root) {
        
        dotraverse(root,1);
        return MaxCount;
    }
    
    public void dotraverse(TreeNode root,int count){
        if(root == null){
          return;
        }
        if(count > MaxCount)
              MaxCount = count;
        dotraverse(root.left,count+1);
        dotraverse(root.right,count+1);
    }

}
