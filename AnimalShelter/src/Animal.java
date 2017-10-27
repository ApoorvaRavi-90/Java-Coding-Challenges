
public abstract class Animal {
	int order;
	String name;
	Animal(String n)
	{
		name=n;
	}
	void setOrder(int ord)
	{
		order=ord;
	}
	int getOrder(){ return order;}
	boolean isOlderThan(Animal a)
	{
		return this.order<a.getOrder();
	}

}
