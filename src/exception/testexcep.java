package exception;

public class testexcep {

	public static void main(String[] args) {
		excep1 q=new excep1();
		//q.calculator(10, 0);	
		try {
		q.method2();
		}catch(Exception e)
		{
			System.out.println("watever");
		}
	}

}
