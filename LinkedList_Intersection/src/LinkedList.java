import java.util.Scanner;


public class LinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	void push(int d)
	{
		Node n=new Node(d);
		n.next=head;
		head=n;
	}
	Node findIntersection(Node l1,Node l2)
	{
		if(l1==null||l2==null)return null;
		result r1=getSizeTail(l1);
		result r2=getSizeTail(l2);
		if(r1.tail!=r2.tail)
		{
			return null;
		}
		
		Node shorter=(r1.size>r2.size?l2:l1);
		Node longer =r1.size>r2.size?l1:l2;
		longer=getKthNode(longer,Math.abs(r1.size-r2.size));
		while(shorter!=longer)
		{
			shorter=shorter.next;
			longer=longer.next;
		}
		return longer;
		
	}

	public static void main(String[] args) {
		LinkedList llist=new LinkedList();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the List 1numbers:");
		for (int i=0;i<3;i++)
		{
			llist.push(input.nextInt());
		}
		

	}


class result
{
	public Node tail;
	public int size;
	public result(Node tail,int size)
			{ this.tail=tail;
			this.size=size;
			
		
	}
}
result getSizeTail(Node a)
{
	if(a==null) return null;
	int ct=0;
	Node curr=a;
	while(curr.next!=null)
	{
		ct++;
		curr=curr.next;
		
	}
	return new result(curr,ct);
}
Node getKthNode(Node a,int k)
{
	Node x=a;
	while(k>0 && x.next!=null)
	{
		x=x.next;
		k--;
	}
	return (x);
}
}