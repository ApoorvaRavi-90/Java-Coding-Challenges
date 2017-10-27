import java.util.*;
public class Tree {
	class Node
	{
		int data;
		Node left,right;
		Node(int n)
		{
			data=n;
		}
	}
	
	Node commonAncestor(Node root, Node p,Node q)
	{
		if(!(covers(root,p))||!covers(root,q))
		{
			return null;
		}
		return ancestorhelper(root,p,q);
	}
	Node ancestorhelper(Node root, Node p,Node q)
	{
		if((root==null)||root==p||root==q)
		{
			return root;
		}
		boolean pisonleft = covers(root.left,p);
		boolean qisonleft=covers(root.left,q);
		if (pisonleft!=qisonleft)
		{
			return root;
		}
		Node childside = pisonleft? root.left:root.right;
		return ancestorhelper(childside,p,q);
	}
	boolean covers(Node root, Node p)
	{
		if (root==null)
		{
			return false;
		}
		if (root==p)
		{
			return true;
		}
		return (covers(root.left,p)||covers(root.left,p));
	}

}
