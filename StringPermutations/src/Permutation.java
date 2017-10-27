
public class Permutation 
{
	void permute(String str, int left,int right)
	{
		if(left==right)
		{
			System.out.println(str);
		}
		for (int i=left;i<=right;i++)
		{
			str=swap(str,left,i);
			permute(str,left+1,right);
			str=swap(str,left,i);
			
		}
		
	}
	String swap(String str,int left,int right)
	{
		char[] array = str.toCharArray();
		char  temp= array[left];
		array[left]=array[right];
		array[right]=temp;
		return new String(array);
	}

	public static void main(String[] args) 
	{
		String str = "123";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
     
	}

}
