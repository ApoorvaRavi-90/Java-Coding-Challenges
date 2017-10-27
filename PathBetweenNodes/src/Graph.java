import java.util.*;

public class Graph 
{
	HashMap<Integer,Node> nodelookup=new HashMap<Integer,Node>();
	class Node
	{
	  int data;
	  LinkedList<Node> adjacent=new LinkedList<Node>();
	  Node(int data)
	  {
		  this.data=data;
	  }
	    
	}
	
	public Node getNode(int id)
	{
		if (nodelookup.containsKey(id))
		{
			return nodelookup.get(id);
		}
		Node a=new Node(id);
		nodelookup.put(id, a);
		return a;
		
	}
	public  void addedge(int source,int destination)
	{
		Node s=getNode(source);
		Node d=getNode(destination);
		s.adjacent.add(d);
	}
	public boolean haspathDFS(int src, int dest)
	{
		Node source=getNode(src);
		Node destination =getNode(dest);
		HashSet<Integer> visited= new HashSet<Integer>();
		return haspathDFS(source,destination,visited);
		
	}
	public boolean haspathDFS(Node source,Node destination,HashSet<Integer> visited)
	{
		if(visited.contains(source.data))
		{
			return false;
		}
		visited.add(source.data);
		if (source==destination)
		{
			return true;
		}
		for (Node child: source.adjacent)
		{
			return (haspathDFS(child,destination,visited));
		}
		return false;
	}
	public boolean hasPathBFS(int src,int dest)
	{
		HashSet<Integer> visited=new HashSet<Integer>();
		LinkedList<Node> nextToVisit= new LinkedList<Node>();
		Node source=getNode(src);
		Node destination=getNode(dest);
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty())
		{
			Node n = nextToVisit.remove();
			if (n==destination)
			{
				return true;
			}
			if (visited.contains(n.data))
			{
				continue;
			}
			visited.add(n.data);
			for (Node child : source.adjacent)
			{
				nextToVisit.add(child);
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
