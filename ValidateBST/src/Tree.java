import java.util.*;
public class Tree {
	class Node
	{
		int data;
		Node left,right;
		Node(int d)
		{
			data =d;
		}
	}
	public boolean validateBST(Node root)
	{
		int last_printed=Integer.MAX_VALUE;
		if(root==null)
		{
			return true;
		}
		if(!validateBST(root.left))
		{
			return false;
		}
		
		if(last_printed != Integer.MAX_VALUE && last_printed <=root.data)
		{
			return false;
		}
		last_printed=root.data;
		
		if(!validateBST(root.right))
		{
			return false;
		}
		return true;
	}

}
