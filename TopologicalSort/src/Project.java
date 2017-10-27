import java.util.*;
public class Project {
	String name;
	ArrayList<Project> children =new ArrayList<Project>();
	HashMap<String,Project> map=new HashMap<String, Project>();
	int dependencies=0;
	Project(String n)
	{
		name=n;
	}
	void addNeighbour(Project node)
	{
	 if(!map.containsKey(node.getName()))	
	 {
		 children.add(node);
		 map.put(node.getName(), node);
		 node.incrementdependencies();
		 
	 }
	}
	void incrementdependencies(){
		dependencies++;
	}
	void decrementdependencies(){
		dependencies--;
	}
	String getName()
	{
		return name;
	}
	int getNumberofdependencies()
	{
		return dependencies;
	}
	ArrayList<Project> getChildren()
	{
		return children;
	}
	

}
