import java.util.ArrayList;


public class solution {
	Project[] findBuildOrder(String[] projects, String[][] dependencies)
	{
		Graph graph= buildGraph(projects,dependencies);
		return orderProjects(graph.getNodes());
	}
	Graph buildGraph(String[] project, String[][]dependencies)
	{
		Graph graph=new Graph();
		for (String x : project)
		{
			graph.createNode(x);
		}
		for (String[] dependency:dependencies)
		{
			String first= dependency[0];
			String second =dependency[1];
			graph.addedge(first, second);
		}
		return graph;
	}
	Project[] orderProjects(ArrayList<Project> projects)
	{
		Project[] order=new Project[projects.size()];
		int endOfList= addNonDependent(order, projects,0);
		int tobeprocessed=0;
		while(tobeprocessed<order.length)
		{
			Project current= order[tobeprocessed];
			if (current==null)
			{
				return null;
			}
			ArrayList<Project> children = current.getChildren();
			for (Project child : children)
			{
				child.decrementdependencies();
			}
			 endOfList= addNonDependent(order, children,endOfList);
			 tobeprocessed++;
		}
		return order;
		
	}
	int addNonDependent(Project[] order,ArrayList<Project> projects, int offset)
	{
		for (Project project: projects)
		{
			if(project.getNumberofdependencies()==0)
			{
				order[offset]=project;
				offset++;
			}
		}
		return offset;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
