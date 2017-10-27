import java.util.*;
public class Graph {
	ArrayList<Project> nodes =new ArrayList<Project>();
	HashMap<String,Project> map=new HashMap<String,Project>();
	
	Project createNode(String n)
	{
		if(!map.containsKey(n))
		{
			Project x= new Project(n);
			nodes.add(x);
			map.put(n, x);
			
		}
		return map.get(n);
	}
	void addedge(String a, String b)
	{
		Project A=createNode(a);
		Project B=createNode(b);
		A.addNeighbour(B);
	}
	public ArrayList<Project> getNodes()
	{
		return nodes;
	}
	
	

}
