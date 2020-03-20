package poly;

public class Person {
	public void buy(Animal a)
	{
		System.out.println("hi!!");
		System.out.println();
		if(a instanceof Dog)
		{
			a.activity();
			System.out.println("u can buy any dogs of different breeds!");
		}
		else if(a instanceof Cat)
		{
			a.activity();
			System.out.println("u can buy these cats!");
		}
		else
		{
			System.out.println("Im sorry, do u want to buy any other animal?");
		}
		
	}

}
