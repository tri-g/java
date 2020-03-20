package files;
import java.io.*;
import java.io.FileInputStream;

public class Files2 {
	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("C:\\Users\\slk\\core java\\tri.txt");
		int i=0;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);	
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
			
		
	}
	}


