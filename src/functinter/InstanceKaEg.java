package functinter;

public class InstanceKaEg {
	public void type() {
		System.out.println("wat type of aniaml do u want?");
	}

	public static void main(String[] args) {
		InstanceKaEg i=new InstanceKaEg();
		Animal a=i::type;
		a.tye();
		
		Animal a1=new InstanceKaEg()::type;
		a1.tye();
		
		

	}

}
