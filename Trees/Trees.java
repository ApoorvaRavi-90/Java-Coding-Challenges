import java.util.ArrayList;
import java.util.LinkedList;

public class Trees 
{
	public class TreeNode
	{
		int data;
		TreeNode left,right;
		TreeNode(int data)
		{
			this.data=data;
		}
		public void insert(int value)
		{
			if(value<=data)
			{
				if(left==null)
				{
					left= new TreeNode(value);
				}
				else
				{
					left=left.insert(value);
				}
				
			}
			else
			{
				if(right==null)
				{
					right= new TreeNode(value);
				}
				else
				{
					right=right.insert(value);
				}
			}
		}
		public boolean contains(int value)
		{
			if (value==data)
			{
				return true;
			}
			if (value<data)
			{
				if (left==null)
				{
					return false;
				}
				else
				{
					return left.contains(value);
				}
			}
			else
			{
				if (right==null)
				{
					return false;
				}
				else
				{
					return right.contains(value);
				}
			}
		}
	}
	
	
	public TreeNode createBST(int[] array)
	{
		return (createBST(array,0,array.length-1));
	}
	public TreeNode createBST(int[] array,int start, int end)
	{
		if (end<start)
		{
			return null;
		}
		int mid= (start+end)/2;
		TreeNode root=new TreeNode(array[mid]);
		root.left=createBST(array,start,mid-1);
		root.left=createBST(array,mid+1,end);
	}
	public void inOrderTraversal()
	{
		if(left!=null)
		{
			left.inOrderTraversal();
		}
		System.out.println(data);
		if(right!=null)
		{
			right.inOrderTraversal();
			
		}
	}
	void createLinkedList(TreeNode root, ArrayLists<<LinkedList<TreeNode>> lists, int level)
	{
		if (root==null)
		{
			return;
		}
		LinkedList<TreeNode> list=null;
		if (lists.size()==level)
		{
			list=new LinkedList<TreeNode>();
			lists.add(list);
		}
		else
		{
			list=lists.get(level);
		}
		list.add(root);
		createLinkedList(root.left,lists,level+1);
		createLinkedList(root.right,level+1);
	}
	
	ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode root)
	{
		ArrayList<LinkedList<TreeNode>> lists=new ArrayList<LinkedList<TreeNode>>();
		createLinkedList(root,lists,0);
	}
    ArrayList<LinkedList<treeNode>> createLinkedListBFS(TreeNode root)
    {
    	ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
    	LinkedList current=new LinkedList();
    	if (root!=null)
    	{
    		current.add(root);
    	}
    	while(!current.isEmpty())
    	{
    		result.add(current);
    		LinkedList<TreeNode> parents=current;
    		current=new LinkedList<TreeNode>();
    		for (TreeNode parent:parents)
    		{
    			if (parent.left!=null)
    			{
    				current.add(parent.left);
    			}
    			if(parent.right!=null)
    			{
    				current.add(parent.right);
    			}    			
    		}    		   		
    	}
    	return result;
    }
    
    public boolean isBalanced(TreeNode root)
    {
    	return (checkHeight(root)!=Integer.MIN_VALUE);
    }
    int checkHeight(TreeNode root)
    {
    	if(root==null)
    	{
    		return -1;
    	}
    	int leftheight=checkHeight(root.left);
    	if (leftheight==Integer.MIN_VALUE)
    	{
    		return Integer.MIN_VALUE;
    	}
    	int rightheight=checkHeight(root.right);
    	if (rightheight==Integer.MIN_VALUE)
    	{
    		return Integer.MIN_VALUE;
    	}
    	int heightDiff=leftheight-rightheight;
    	if (Math.abs(heightDiff)>1)
    	{
    		return Integer.MIN_VALUE;
    	}
    	else
    	{
    		return Math.max(leftheight, rightheight)+1;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
