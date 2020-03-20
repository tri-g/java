package files;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class test {
	public static void main(String[] args) {
		try {
			serial1 s=new serial1();
		FileOutputStream f=new FileOutputStream("C:\\Users\\slk\\core java\\wat.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s);
		o.flush();
		o.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
