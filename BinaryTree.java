package practise;

import java.util.Scanner;

/**
 * 学习二叉树的构造以及遍历
 * @author Viaxiz
 * 在构造树的时候，用的是先序的方法构造树的，构造的时候是需要构造一棵满二叉树，所以在没有的节点的位置将其输入0就OK了
 * 如输入：1，2，4，0，0，5，0，0，3，0，0
 */
class Node{
	protected int data;
	Node left;
	Node right;
}

public class BinaryTree {
	public static Scanner scan;
	
	public static Node createTree() {
		Node nodeindex;
		//System.out.println("输入节点");
		scan=new Scanner(System.in);
		int data=scan.nextInt();
		if(data==0) {
			nodeindex=null;
			System.out.print("构建节点为空！请输入下一个节点：");
		}
		else {
			nodeindex=new Node();
			nodeindex.data=data;
			nodeindex.left=createTree();
			nodeindex.right=createTree();
		}
		return nodeindex;
	}
	
	//先序遍历
	public static void preOrderTree(Node root) {
		if(root!=null) {
			System.out.print(root.data);
			preOrderTree(root.left);;
			preOrderTree(root.right);
		}
	}
	
	//中序遍历
	public static void middleOrederTree(Node root) {
		if(root!=null) {
			middleOrederTree(root.left);
			System.out.print(root.data);
			middleOrederTree(root.right);
		}
	}
	
	//后序遍历
	public static void backOrderTree(Node root) {
		if(root!=null) {
			backOrderTree(root.left);
			backOrderTree(root.right);
			System.out.println(root.data);
		}
	}
	
	public static void main(String[] args) {
		Node root;
		root=createTree();
		//System.out.println("先序遍历:");
		//preOrderTree(root);
		//System.out.println("\n中序遍历:");
		//middleOrederTree(root);
		System.out.println("\n后续遍历:");
		backOrderTree(root);
	}
}
