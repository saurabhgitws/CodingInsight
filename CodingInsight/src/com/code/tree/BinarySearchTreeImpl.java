package com.code.tree;


class NodeBinaryTreeNode{
	int key;
	NodeBinaryTreeNode leftChild;
	NodeBinaryTreeNode rightChild;
	
	public NodeBinaryTreeNode(int key) {
		this.key = key;
		this.leftChild = null;
		this.rightChild = null;
	}
}

class BinarySearchTree{
	NodeBinaryTreeNode mRoot;
	
	public void insert(int key) {
		insert(mRoot, key);
	}
	
	public void insert(NodeBinaryTreeNode root,int key) {
		if(mRoot == null) {
			mRoot = new NodeBinaryTreeNode(key);
			return;
		}
		
		
		if(key>root.key) {
			if(root.rightChild == null)
				root.rightChild = new NodeBinaryTreeNode(key);
			else		
			   insert(root.rightChild,key);
		}else {
			if(root.leftChild == null)
			   root.leftChild = new NodeBinaryTreeNode(key);
			else		
			   insert(root.leftChild,key);
		}
	}
	
	
	
	boolean search(int key) {
		return search(mRoot, key)==null?false:true;
	}
	
	NodeBinaryTreeNode search(NodeBinaryTreeNode root,int key) {
		if(root == null)
			return null;
		
		if(root.key == key) {
			return root;
		}
		
		if(key > root.key)
			search(root.rightChild, key);
		else
			search(root.leftChild,key);
		return null;
	}
	
	
	public boolean delete(int key) {
		return delete(mRoot,key)==null ? false : true;
	}
	
	public NodeBinaryTreeNode delete(NodeBinaryTreeNode root,int key) {
		
		if(root == null) {
			return null;
		}
		
		if(key < root.key) {
			root.leftChild = delete(root.leftChild, key);
		}
		
		if(key > root.key) {
			root.rightChild = delete(root.rightChild, key);
		}
		
		if(key == root.key) {
			if(root.leftChild == null && root.rightChild == null) {
				root = null;
			}else if(root.leftChild == null || root.rightChild == null) {
				if(root.leftChild != null) {
					root = root.leftChild;
				}
				if(root.rightChild!=null) {
					root = root.rightChild;
				}
			}else if(root.leftChild != null && root.rightChild != null) {
				
				NodeBinaryTreeNode temp = inOrderSuccesor(root.rightChild);
				root.key = temp.key;
				root.rightChild = delete(root.rightChild, temp.key);
				
			}
			
		}
		
		
		return root;
	}
	
	public NodeBinaryTreeNode inOrderSuccesor(NodeBinaryTreeNode root) {
		if(root.leftChild != null)
			return inOrderSuccesor(root.leftChild);
	    else
			return root;
	}
	
	
	public void preOrderTraverse(NodeBinaryTreeNode root) {
		if(root == null)
			return;
		System.out.print(root.key+" ");
		preOrderTraverse(root.leftChild);
		preOrderTraverse(root.rightChild);
		
	}
	
	
    public void postOrderTraverse(NodeBinaryTreeNode root) {
		if(root == null)
			return;
		postOrderTraverse(root.leftChild);
		postOrderTraverse(root.rightChild);
		System.out.print(root.key+" ");


	}
    
    public void inOrderTraverse(NodeBinaryTreeNode root) {
		if(root == null)
			return;
		inOrderTraverse(root.leftChild);
		System.out.print(root.key+" ");
		inOrderTraverse(root.rightChild);
		
	}

	public void preOrder() {
		// TODO Auto-generated method stub
		preOrderTraverse(mRoot);
	}

	public void inOrder() {
		// TODO Auto-generated method stub
		inOrderTraverse(mRoot);
	}

	public void postOrder() {
		// TODO Auto-generated method stub
		postOrderTraverse(mRoot);
	}
	
}

public class BinarySearchTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree mBinarySearchTree = new BinarySearchTree();
		mBinarySearchTree.insert(100);
		mBinarySearchTree.insert(20);
		mBinarySearchTree.insert(10);
		mBinarySearchTree.insert(30);
		mBinarySearchTree.insert(200);
		mBinarySearchTree.insert(300);
		mBinarySearchTree.insert(150);
		System.out.println();
		System.out.println("pre order Tree Travseral");// 100,20,10,30,200,150,300
		mBinarySearchTree.preOrder();

		System.out.println();
		System.out.println("In order Tree Travseral"); // 10,20,30,100,150,200,300
		mBinarySearchTree.inOrder();

		System.out.println();
		System.out.println("post order Tree Travseral");// 10,30,20,150,300,200,100
		mBinarySearchTree.postOrder();

		
	   boolean found  =mBinarySearchTree.search(151);
		if (!found) {
			System.out.println("Item not found");
		} else {
			System.out.println("Item found");
		}

		mBinarySearchTree.insert(8);
		System.out.println();
		mBinarySearchTree.inOrder();
		mBinarySearchTree.insert(29);
		System.out.println();
		mBinarySearchTree.inOrder();
		mBinarySearchTree.insert(35);
		System.out.println();
		mBinarySearchTree.inOrder();

		System.out.println("\n Delete...");

		mBinarySearchTree.delete(300);
		System.out.println();
		mBinarySearchTree.inOrder();
		
		mBinarySearchTree.delete(10);
		System.out.println();
		mBinarySearchTree.inOrder();
		
		mBinarySearchTree.delete(20);
		System.out.println();
		mBinarySearchTree.inOrder();
	}

}
