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
public class BinaryTree 
{
	Node root;
	public static Node createMinimaltree(int[] array)
	{
		return createMinimaltree(array,0,array.length-1);
	}
	public static Node createMinimaltree(int[] array, int start,int end)
	{
		if(end<start)
		{
			return null;
		}
		int mid=(start+end)/2;
		Node root=new Node(array[mid]);
		root.left=createMinimaltree(array,start,mid-1);
		root.right=createMinimaltree(array,mid+1,end);
		return root;
	}
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		Node ab=createMinimaltree(a);
		// TODO Auto-generated method stub

	}

}
