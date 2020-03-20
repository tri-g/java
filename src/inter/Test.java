package inter;

public class Test {
	public static void main(String[] args) {
		Animal a=new Animal()
				{
			public void category()
			{
				System.out.println("Dogs are omnivores");
			}
				};
				a.category();
		/*Dog d=new Dog();
		Lion l=new Lion();
		d.category();
		d.sleep();
		l.category();
		l.sleep();
		l.extra();*/
	}

}
