import java.util.*;
class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
	}
}
public class BinaryTree {
	Node root;
	
	public static boolean isBST(Node root)
	{
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean isBST(Node n,int min,int max)
	{
		if (n==null)
		{
			return true;
		}
		if(n.data<min ||n.data>max)
		{
			return false;
		}
		return (isBST(n.left,min,n.data-1)&& isBST(n.right,n.data+1,max));
	}
	
	public static void main(String[] args) 
	{
		BinaryTree tree=new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(6);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (isBST(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
		

}


