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
class Result
{
	public Node tail;
	public int size;
	Result(Node tail,int size)
	{
		this.tail=tail;
		this.size=size;
	}
}
	

public class solution {
	public static Result getTailandSize(Node n)
	{
		Node x=n;
		int count=1;
		while(x!=null)
		{
			count+=1;
			x=x.next;
		}
		return new Result(x,count);
		
	}
	public static Node getKthNode (Node x,int k)
	{
		Node y=x;
		for(int i=0;i<k;i++)
		{
			y=y.next;
		}
		return y;
		
	}
	
	public static Node findIntersection(Node n1,Node n2)
	{
		if(n1==null &&n2==null)
		{
			return null;
		}
		Result r1=getTailandSize(n1);
		Result r2=getTailandSize(n2);
		Node shorter =(r1.size>r2.size?n2:n1);
		Node longer =(r1.size>r2.size?n1:n2);
		int k=Math.abs(r1.size-r2.size);
		longer=getKthNode(longer,k);
		while(shorter!=longer)
		{
			shorter=shorter.next;
			longer=longer.next;
		}
		return longer;
		
	}

	public static void main(String[] args) {
		
	}

}
