import java.util.*;
public class Graph 
{
HashMap<Integer, Node> nodelookup =new HashMap<Integer,Node>();

class Node{
	int id;
	LinkedList<Node> adjacent =new LinkedList<Node>();
	Node(int d)
	{
		id=d;
	}
	
}
public Node getNode(int d)
{
	if (nodelookup.containsKey(d))
	{
		return nodelookup.get(d);
	}
	Node n=new Node(d);
	nodelookup.put(d, n);
	return n;
}
public void addedge(int src, int dest)
{
	Node source =getNode(src);
	Node destination =getNode(dest);
	source.adjacent.add(destination);
}
public boolean hasPathDFS(int src,int dest)
{
	Node s=getNode(src);
	Node d=getNode(dest);
	HashSet<Integer> visited=new HashSet<Integer>();
	return hasPathDFS(s,d,visited);
}
public boolean hasPathDFS(Node s,Node d,HashSet<Integer> visited)
{
	if (visited.contains(s.id))
	{
		return false;
	}
	visited.add(s.id);
	if(s==d)
	{
		return true;
	}
	for (Node child : s.adjacent)
	{
		hasPathDFS(child,d,visited);
	}
	return false;
}
public boolean hasPathBFS(int src,int dest)
{
	Node s=getNode(src);
	Node d=getNode(dest);
	HashSet<Integer> visited=new HashSet<Integer>();
	LinkedList<Node> nexttovisit = new LinkedList<Node>();
	
	nexttovisit.add(s);
	while(!nexttovisit.isEmpty())
	{
		Node n= nexttovisit.remove();
		if (n==d)
		{
			return true;
		}
		if (visited.contains(n.id))
		{
			return false;
		}
		visited.add(n.id);
		for (Node child : n.adjacent)
		{
			nexttovisit.add(child);
		}
	}
	
	return false;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
