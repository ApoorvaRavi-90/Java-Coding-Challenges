
public class Tree {
	class Node{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
		}
	}
	public boolean isBalanced(Node root)
	{
		return (checkheight(root)!=Integer.MAX_VALUE);
	}
	public int checkheight(Node root)
	{
		if (root==null)
		{
			return -1;
		}
		int leftheight=checkheight(root.left);
		int rightheight=checkheight(root.left);
		int heightdiff=Math.abs(leftheight-rightheight);
		if(heightdiff>1)
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return Math.max(leftheight,rightheight)+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
