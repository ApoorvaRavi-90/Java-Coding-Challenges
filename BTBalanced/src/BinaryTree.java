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
	public static boolean checkBalanced(Node root)
	{
		int lheight=getheight(root.left);
		int rheight=getheight(root.right);
		int diffheight=(lheight-rheight);
		if (Math.abs(diffheight)>1)
		{
			return false;
		}
		return true;
	}
	public static int getheight(Node root)
	{
		if (root==null)
		{
			return 0;
		}
		return (Math.max(getheight(root.left),getheight(root.right))+1);
		
	}

	public static void main(String[] args) 
	{
		BinaryTree tree=new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(6);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.left.right.left= new Node(1);
 
        if (checkBalanced(tree.root))
            System.out.println("IS balanced");
        else
            System.out.println("Not balanced");

	}

}
