import java.util.*;
public class Tree {
	class Node
	{
		int data;
		Node left,right,parent;
		Node(int d)
		{
			data=d;
		}
	}
	public Node nextSucessor(Node n)
	
	{
		if(n==null)
		{
			return null;
		}
		if(n.right!=null)
		{
			return leftmostchild(n.right);
		}
		else
		{
			Node q=n;
			Node x=q.parent;
			while(x!=null && x.left!=q)
			{
				q=x;
				x=x.parent;
			}
			return x;
		}
	}
	public Node leftmostchild(Node n)
	{
		if(n==null)
		{
			return null;
		}
		while(n.left!=null)
		{
			n=n.left;
		}
		return n;
	}

}
