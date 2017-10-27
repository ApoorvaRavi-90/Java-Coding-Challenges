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
public class solution 
{
	public static Node reverseList(Node n1,Node n2,int carry)
	{
		if (n1==null && n2==null && carry==0)
		{
			return null;
		}
		Node result= new Node();
		
		int value=carry;
		if(n1!=null)
		{
			value+=n1.data;
		}
		if(n2!=null)
		{
			value+=n2.data;
		}
		result.data=value%10;
		if(n1!=null||n2!=null)
		{
			Node more=reverseList(n1==null?null:n1.next,n2==null?null:n2.next,value>=10?1:0);
			result.next=more;
		}
		return result;
		
	}

	public static void main(String[] args) {
		Node n1=new Node(5);
		n1.append(4);
		n1.append(5);
		Node n2=new Node(6);
		n2.append(9);
		n2.append(6);
		Node x=reverseList(n1,n2,0);
		while(x!=null)
		{
			System.out.println(x.data);
			x=x.next;
		}

	}

}
