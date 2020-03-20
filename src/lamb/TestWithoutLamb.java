package lamb;

public class TestWithoutLamb {

	public static void main(String[] args) {
		/*Animal a=new Animal(){
			public void category()
			{
				System.out.println("there are many categories like herbivores,etc");
			}
			
		};
		a.category();*/
		/*Dog a=()->{System.out.println("hello");};
		a.action();
		*/
		/*Addable ad=( a, b)->(a+b);
		System.out.println(ad.add("JAY", " RYAN"));*/
		Animal a=(name)->{
			String s1=" hi! I wanna buy ";
			String s2=s1+name;
			return s2;
		};
		System.out.println(a.buy("dog"));
		
		
		
		
	}

}
