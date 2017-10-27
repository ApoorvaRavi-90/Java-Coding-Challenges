import java.util.HashSet;


public class Solution {
	Node head;
	public class Node
	{
		int data;
		Node next;
		Node (int data)
		{
			this.data=data;
		}
	public void delDups(Node head)
	{
		HashSet<Integer> set =new HashSet<Integer>();
		Node previous=null;
		while(head!=null)
		{
			if (set.contains(head.data))
			{
				previous.next=head.next;
			}
			else
			{
				set.add(head.data);
				previous=head;
			}
			head=head.next;
		}
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
