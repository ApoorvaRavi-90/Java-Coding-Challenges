import java.util.*;
public class AnimalQueue {
	LinkedList<Dog> dogs=new LinkedList<Dog>();
	LinkedList<Cat> cats= new LinkedList<Cat>();
	int order=0;
	
	void add(Animal a)
	{
		order++;
		a.setOrder(order);
		if(a instanceof  Cat)
		{
			cats.addLast((Cat)a);
		}
		else if (a instanceof Dog)
		{
			dogs.addLast((Dog)a);
		}
	}
	Animal remove()
	{
		if(dogs.isEmpty())
		{
			return dequeueDogs();
		}
		if(cats.isEmpty())
		{
			return dequeueCats();
		}
		Dog dog=dogs.peek();
		Cat cat=cats.peek();
		if(cat.isOlderThan(dog))
		{
			return dequeueCats();
		}
		else
		{
			return dequeueDogs();
		}
		
	}
	Animal dequeueDogs()
	{
		return dogs.poll();
	}
	Animal dequeueCats()
	{
		return cats.poll();
	}

}
