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
	public static Node reverseAndClone(Node n)
	{
		Node head=null;
		while(n!=null)
		{
			Node x=new Node(n.data);
		    x.next=head;
		    head=x;
		    n=n.next;
		}
		return head;
	}
    public static boolean isEqual(Node n1,Node n2)
    {
    	while(n1!=null && n2!=null)
    	{
    		if(n1.data!=n2.data)
    		{
    			return false;
    		}
    		n1=n1.next;
    		n2=n2.next;
    	}
    	return true;
    }
	public static void main(String[] args) {
		Node n1=new Node(5);
		n1.append(4);
		n1.append(6);
		Node n2=reverseAndClone(n1);
		if(isEqual(n1,n2))
				{
					System.out.println("Palindrome");
				}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
