import java.util.*;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

public class solution {
	public static void deldups(Node n)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		Node previous=null;
		while(n!=null)
		{
			if(set.contains(n.data))
			{
				previous.next=n.next;				
			}
			else
			{
				set.add(n.data);
				previous=n;
			}
			n=n.next;
			
		}
		
		
	}

	public static void main(String[] args) {
}
}

