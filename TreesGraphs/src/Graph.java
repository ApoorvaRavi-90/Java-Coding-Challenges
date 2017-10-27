import java.util.*;


public class Graph 
{ 
	HashMap<Integer, Node> nodeLookup = new HashMap<Integer,Node>();
	class Node
	   {
		int id;
		LinkedList<Node> adjacent=new LinkedList<Node>();
		public Node(int id)
		{
			this.id=id;
		}
	public Node getNode(int d)
	{
		if (nodeLookup.containsKey(id))
		{
			return nodeLookup.get(id);
		}
		Node node= new Node(id);
		nodeLookup.put(id, node);
		return node;
	}
	public void addEdge(int source,int destination)
	{
		Node s=getNode(source);
		Node d=getNode(destination);
		s.adjacent.add(d);
	}
		
	public boolean hasPathDFS(int source, int destination)
	{
		HashSet<Integer> visited=new HashSet<Integer>();
		Node s=getNode(source);
		Node d=getNode(destination);
		return hasPathDFS(s,d,visited);
		
	}
	public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited)
	{
		if (visited.contains(source.id))
		{
			return false;
		}
		visited.add(source.id);
		if(source==destination)
		{
			return true;
		}
		for(Node child: source.adjacent)
		{
			hasPathDFS(child,destination,visited);
		}	
		
		return false;
	}
	public boolean hasPathBFS(Node source,Node destination)
	{
		LinkedList<Node> nextToVisit =new LinkedList<Node>();
		HashSet<Integer> visited =new HashSet<Integer>();
		
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty())
		{
			Node node=nextToVisit.remove();
			if(node==destination)
			{
				return true;
			}
			visited.add(node.id);
			for(Node child:node.adjacent)
			{
				nextToVisit.add(child);
			}
		}
		return false;
	}
	}
		

	public static void main(String[] args) 
	{

	}

}
