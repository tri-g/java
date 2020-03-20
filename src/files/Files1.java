package files;

import java.io.FileOutputStream;

public class Files1 {
	public static void main(String[] args) {
		try {
		FileOutputStream f=new FileOutputStream("C:\\Users\\slk\\core java\\tri.txt");
		String s="Hey yall!!Watsup!!!";
		byte b[]=s.getBytes();
		f.write(b);
		f.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
