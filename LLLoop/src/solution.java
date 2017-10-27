class Node
{
	int data;
	Node next=null;
	Node()
	{
		
	}
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
	
	public Node isLoop(Node head)
	{
		Node n1=head;
		Node n2=head;
		while(n1!=null && n1.next!=null)
		{
			n1=n1.next.next;
			n2=n2.next;
			if(n1==n2)
			{
				break;
			}			
		}
		if(n2==null||n2.next==null)
		{
			return null;
		}
		n1=head;
		while(n1!=n2)
		{
			n1=n1.next;
			n2=n2.next;
		}
		return n2;	
		
	}

	public static void main(String[] args) {

	}

}
