import java.util.*;
public class LinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node()
		{
			
		}
		Node(int d)
		{
			data =d;
		}
	}
	public void push(int d)
	{
		Node new_node= new Node(d);		
		new_node.next=head;
		head=new_node;
		
	}
	/********************************************************************
	 * 
	 * Delete Duplicates
	 *********************************************************************/
	void delDup(Node a)
	{
		HashSet<Integer> set =new HashSet<Integer>();
		Node previous=null;
		Node n=a;
		while(n.next!=null)
		{
			if (set.contains(n.data))
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
	/********************************************************************
	 * 
	 * Kth to last element
	 *********************************************************************/
	Node kthToLast(Node a,int k)
	{
		Node x=head;
		Node y=head;
		for (int i=0;i<k;i++)
		{
			if(x==null) return null;
			x=x.next;
		}
		while(x!=null)
		{
			x=x.next;
			y=y.next;
			
		}
		return y;
		
	}
	/******************************************************************************
	 * 
	 *Delete middle node
	 ******************************************************************************/
	void delMiddleNode(Node a)
	{
		Node x=a;
		Node p1=head;
		int ct=0;
		while (x.next!=null)
		{
			ct=ct+1;
			x=x.next;
		}
		for(int i=0;i<ct/2;i++)
		{
			p1=p1.next;
		}
		Node nex=p1.next;
		p1.data=nex.data;
		p1.next=nex.next;
		
	}	
	
	/*****************************************************************************
	 * Node partition
	 ****************************************************************************/
	Node partition(Node a,int x)
	{
		Node h=a;
		Node t=a;
		while(a !=null)
		{
			Node nex=a.next;
			if(a.data<x)
			{
				a.next=h;
				h=a;
			}
			else 
			{
				t.next=a;
				t=a;
			}
			a=nex;
		}
		t.next=null;
		return h;
		
	}
	/*****************************************************************************
	 * Add two linked list
	 ********************************************************************************/
     Node addLinkedlist(Node a,Node b, int carry)
     {
    	 if (a==null&&b==null && carry==0)return null;
    	 Node result=new Node();
    	 int value= carry;
    	 if(a!=null)
    	 {
    		 value+=a.data;
    	 }
    	 if(b!=null)
    	 {
    		 value+=b.data;
    	 }
    	 
    	 result.data=value%10;
    	 if(a!=null||b!=null){
    		 Node x=addLinkedlist(a==null?null:a.next,
    				              b==null?null:b.next,
    				              value>=10?1:0);
    		 result.next=x;
    	 }
    	 return result;
    	 
     }
     /******************************************************************************
      * 
      * Is palindrome
      */
     boolean isPlaindrome(Node a)
     {
    	 Node reverse=reverseAndClone(a);
    	 return isEqual(a,reverse);
     }
     Node reverseAndClone(Node node)
     {
    	Node h=null;
    	while(node!=null)
    	{
    		Node temp=new Node(node.data);
    		temp.next=h;
    		h=temp;
    		node=node.next;
    	}
    	return h;
     }
     boolean isEqual(Node a,Node rev)
     {
    	 while(a!=null&& rev!=null)
    	 {
    		 if(a.data!=rev.data)
    		 {
    			 return false;
    		 }
    		a=a.next;
    		rev=rev.next;
    	 }
    	 return(a==null&&rev==null);
     }
	
	
	/*****************************************************************************
	 ***************************************************************************** 
	 *******************************************************************************/
	
	
	public static void main(String[] args) 
	{
		LinkedList llist=new LinkedList();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the List 1numbers:");
		for (int i=0;i<3;i++)
		{
			llist.push(input.nextInt());
		}
		//llist.delDup(llist.head);
		//**********************************************************************
		
		//Node n=llist.kthToLast(llist.head, 4);
		//System.out.println(n.data);
		
		//********************************************************************
		/*llist.delMiddleNode(llist.head);
		Node n=llist.head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}*/
		//**********************************************************************
		/*Node n=llist.partition(llist.head,5);
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}*/
		//**********************************************************************
		/*LinkedList llist2=new LinkedList();
		System.out.println("enter the List2 1numbers:");
		for (int i=0;i<3;i++)
		{
			llist2.push(input.nextInt());
		}
		Node n=llist.addLinkedlist(llist.head, llist2.head, 0);
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}*/
		if(llist.isPlaindrome(llist.head))
		{
			System.out.println("Palindrome!");
		}
		else
		{
			System.out.println("Not Plaindrome!");
		}
					
	}

}
