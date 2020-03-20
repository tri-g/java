package files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class serial2 {
	public static void main(String[] args) {
		try {
		ObjectInputStream s=new ObjectInputStream(new FileInputStream("C:\\Users\\slk\\core java\\wat.txt"));
		serial1 a=(serial1)s.readObject();
		System.out.println(a.name+" "+a.age);
		s.close();	
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
