
public class NumberSwapper {
	void swapNumbers(int a,int b)
	{
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("A: "+a+" B: "+b);
	}

}
