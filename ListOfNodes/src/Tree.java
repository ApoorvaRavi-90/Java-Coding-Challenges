import java.util.*;
public class Tree {
class Node
{
	int data;
	Node left,right;
	Node (int d)
	{
		data=d;
	}
}
public ArrayList<LinkedList<Node>> getList(Node root)
{
	ArrayList<LinkedList<Node>> result= new ArrayList<LinkedList<Node>>();
	LinkedList<Node> current= new LinkedList<Node>();
	if (root!=null)
	{
		current.add(root);
	}
	while(current.size()>0)
	{
		result.add(current);
		LinkedList<Node> parents=current;
		current=new LinkedList<Node>();
		for ( Node s :parents)
		{
			if(s.left!=null){
				current.add(s.left);
			}
			if(s.right!=null)
			{
				current.add(s.right);
				
			}
		}
		
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
