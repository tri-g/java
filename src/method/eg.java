package method;

public class eg {
	int x,y;
	
	public void sum()
	{
		System.out.println(x+y);
	}
	public int sum(int a,int b)
	{
		int z=a*b;
		return z;
	}
	public float sum(float a,float b)
	{
		float z=a/b;
		return z;
	}
	public String sum(String a,String b)
	{
		String c;
		c=a+ b;
		return c;
	}
	public int sum(int ...x)
	{
		int add=0;
		for(int i:x)
		{
			add+=i;
		}
		return add;
	}
	public String sum(String ...x)
	{
		String add="";
		for(String i:x)
		{
			add+=i;
		}
		return add;
	}
}
