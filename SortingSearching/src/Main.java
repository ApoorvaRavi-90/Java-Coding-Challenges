import java.util.*;
public class Main {
	void sortMergerdList(int[] a,int[] b,int lastA,int lastB)
	{
		int indexA= lastA-1;
		int indexB=lastB-1;
		int mergeIndex=lastA+lastB-1;
		while (indexB>=0)
		{
			if(indexA>=0 && a[indexA]>b[indexB])
			{
				a[mergeIndex]=a[indexA];
				indexA--;
				
			}
			else
			{
				a[mergeIndex]=b[indexB];
				indexB--;
			}
			mergeIndex--;
		}
	}
    void sortAnagram(String[] array)
    {
    	HashMap<String,String> mapList=new HashMap<String,String>();
    	for(String s:array)
    	{
    		String key=sortChars(s);
    		mapList.put(key, s);
    	}
    	int index=0;
    	
    	for(String key: mapList.keySet())
    	{
    		//ArrayList<String> list =mapList.get(key);
    		/*for(String t:list)
    		{
    			array[index]=t;
    			index++;
    		}*/
    	}
    	
    	
    }
    String sortChars(String x)
	{
		char[] content= x.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
    
    int search(int[]array,int e)
    {
    	int x=array.length-1;
    	return (search(array,0,x,e));
    }
    int search(int[] array,int left, int right, int x)
    {
    	int mid=(left+right)/2;
    	if(x==array[mid])
    	{
    		return mid;
    	}
    	if(left>right)
    	{
    		return -1;
    	}
    	if(array[left]<array[mid])
    	{
    		if(x>array[left]&& x<array[mid])
    		{
    			return search(array,left,mid-1,x);
    		}
    		else 
    		{
    			return search(array,mid+1,right,x);
    		}
    	}
    	else if(array[right]>array[mid])
    	{
    		if(x>array[mid] && x<array[right])
    		{
    			return search(array,mid+1,right,x);
    		}
    		else
    		{
    			return search(array,left,mid-1,x);
    		}
    	}
    	else if(array[left]==array[mid])
    	{
    		if(array[mid]!=array[right])
    		{
    			return search(array,mid+1,right,x);
    		}
    		else
    		{
    			int result= search(array,left,mid-1,x);
    			if(result==-1)
    			{
    				return search(array,mid+1,right,x);
    			}
    			else
    			{
    				return result;
    			}
    		}
    		
    	}
    	return -1;
    	
    }
    int sparseSearch(String[] strings,String str,int first,int last)
    {
    	if (first>last)
    	{
    		return -1;
    	}
    	int mid=(last+first)/2;
    	if(strings[mid].isEmpty())
    	{
    		int left=mid-1;
    		int right=mid+1;
    		while(true)
    		{
    			if(left<first && right>last)
    			{
    				return -1;
    			}
    			else if(right<=last && !strings[right].isEmpty())
    			{
    				mid=right;
    				break;
    			}
    			else if( left>=first && !strings[left].isEmpty())
    			{
    				mid=left;
    				break;
    			}
    			left--;
    			right++;
    		}
    	}
    	if(str.equals(strings[mid]))
    	{
    		return mid;
    	}
    	else if(strings[mid].compareTo(str)>0)
    	{
    		return sparseSearch(strings,str,mid+1,last);
    	}
    	else if(strings[mid].compareTo(str)<0)
    	{
    		return sparseSearch(strings,str,first,mid-1);
    	}
    	return -1;
    }
    int sparseSearch(String[] array,String str)
    {
    	return sparseSearch(array,str,0,array.length-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
