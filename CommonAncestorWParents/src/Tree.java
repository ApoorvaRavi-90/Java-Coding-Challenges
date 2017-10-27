
public class Tree {
	class Node
	{
		int data;
		Node parent;
		Node(int n)
		{
			data=n;
		}
	}
	Node CommonAncestor(Node s,Node d)
	{
		int delta=depth(s)-depth(d);
		Node first=delta>0?d:s;
		Node second= delta>0?s:d;
		second=goUpby(second,Math.abs(delta));
		while(first!=second && first!=null && second != null)
		{
			second=second.parent;
			first=first.parent;
		}
		return (first==null||second==null)? null:first;
		
	}
	Node goUpby(Node a,int x)
	{
		while(x>0 && a!=null)
		{
			a=a.parent;
			x--;
		}
		return a;
		
	}
	int depth(Node s)
	{
		int depth=0;
		while(s!=null)
		{
			s=s.parent;
			depth++;
		}
		return depth;
	}

}
