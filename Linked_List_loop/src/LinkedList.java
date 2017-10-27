import java.util.*;


public class LinkedList {
	Node head;
	class Node
	{
		int data ;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	void push(int d)
	{
		Node new_node=new Node(d);
		new_node.next=head;
		head=new_node;
	}
    boolean isLoop(Node head)
    {
    	Node fast=head.next;
    	Node slow=head;
    	while(fast!=null && fast.next!=null && slow!=null )
    	{
    		if(fast==slow)
    		{
    			return true;
    		}
    		fast=fast.next.next;
    		slow=slow.next;
    		
    	}
    	return false;
    }
	public static void main(String[] args) 
	{
		LinkedList llist=new LinkedList();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the List 1numbers:");
		for (int i=0;i<3;i++)
		{
			llist.push(input.nextInt());
		}
		
	}

}
