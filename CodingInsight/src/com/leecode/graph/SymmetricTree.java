package com.leecode.graph;

import java.util.ArrayList;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        rootRightLeft(root.left,list1);
        rootLeftRight(root.right,list2);
        
        if(list1.size()==list2.size()){
            for(int i=0;i<list1.size();i++){
                if(list1.get(i)!=list2.get(i))
                    return false;
            }
            return true;
        }else{
            return false;
        }
        
    }
    
    private void rootRightLeft(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            list.add(0);
            return;
        }
        list.add(root.val);
        rootRightLeft(root.right,list);
        rootRightLeft(root.left,list);
    }
    
    private void rootLeftRight(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            list.add(0);
            return;
        }
        list.add(root.val);
        rootLeftRight(root.left,list);
        rootLeftRight(root.right,list);
    }
}
