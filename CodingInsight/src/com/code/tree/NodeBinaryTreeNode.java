package com.code.tree;

public class NodeBinaryTreeNode {
		int key;
		NodeBinaryTreeNode leftChild;
		NodeBinaryTreeNode rightChild;
		NodeBinaryTreeNode parent;
		
		public NodeBinaryTreeNode(int key) {
			this.key = key;
			this.leftChild = null;
			this.rightChild = null;
			this.parent = null;
		}
}
