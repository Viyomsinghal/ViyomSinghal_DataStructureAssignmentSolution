package com.greatLearning;

public class Main {
	public static void main(String[] args) {
		Driver tree=new Driver();
		
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		int order=0;
		tree.createSkewedTree(tree.node, order);
		System.out.println("Rightly skewed tree is as follows :");
		tree.traverseRightSkewed(tree.headNode);
	

}
}