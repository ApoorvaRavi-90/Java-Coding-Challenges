
public class tree {
class Node
{
	int data;
	Node left,right;
	Node(int d)
	{
		data=d;
	}
}
public Node createBinaryTree(int[] array)
{
	return createBinaryTree(array,0,array.length-1);
}
public Node createBinaryTree(int[] array,int start, int end)
{
	if(end<start)
	{
		return null;
	}
	int mid=(start+end)/2;
	Node root=new Node(array[mid]);
	root.left=createBinaryTree(array,start,mid-1);
	root.right=createBinaryTree(array, mid+1,end);
	return root;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
