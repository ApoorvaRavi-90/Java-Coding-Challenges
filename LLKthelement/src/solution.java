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
	public static Node kthelement(Node n,int k)
	{
		Node p1,p2;
		p1=n;
		p2=n;
		for(int i=0;i<k;i++)
		{
			if(p1==null)
			{
				return null;
			}
			p1=p1.next;
		}
		while(p1!=null)
		{
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
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
		Node y=n;
		while(y!=null)
		{
			System.out.println(y.data);
			y=y.next;
		}
		Node x=kthelement(n,3);
		System.out.println(x.data);

	}

}
