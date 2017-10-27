import java.util.*;
class Solution {
    public static boolean judgeCircle(String moves) {
        int sum=0,x;
        for (char a: moves.toCharArray())
        {
            switch(a){
               case 'L':
                 x=1;
                 break;
                case 'R':
                 x=-1;
                 break;
                case 'U':
                 x=2;
                 break;
                case 'D':
                 x=-2;
                 break;
                default:
                x=100;
                
            }
            
            sum+=x;          
            
        }
        if (sum==0)
        {
            return true;
        }
        return false;
        
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=in.nextLine();
		if (judgeCircle(s)){
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
	
		}

	}

}
