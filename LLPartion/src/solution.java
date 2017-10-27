class Node
{
	int data;
	Node next=null;
	Node(int data)
	{
		this.data=data;
	}
	void append(int data)
	{
		Node end=new Node(data);
		Node n=this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=end;
	}
	
		
}
public class solution {
	public static void part(Node n, int x)
	{
		Node head=n;
		Node tail=n;
		while(n!=null)
		{
			if(n.data<x)
			{
				n.next=head;
				head=n;
				
			}
			else
			{
				tail.next=n;
				tail=n;
			}
			n=n.next;
		}
		tail.next=null;
	}

	public static void main(String[] args) {
		Node n=new Node(5);
		n.append(4);
		n.append(3);
		n.append(2);
		n.append(1);
		n.append(6);
		n.append(7);
		n.append(8);
		n.append(9);
		n.append(11);
		part(n,5);		
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		

	}

}
