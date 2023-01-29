package Home;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class readwrite 
{	
	public void redfile() throws Exception
	{
		
		FileInputStream fi=new FileInputStream("d:/sa.txt");
	}
	public void savefile() throws Exception
	{
		
		FileOutputStream fos=new FileOutputStream("ed:/sam.txt");
	}
	
}

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readwrite r=new readwrite();
		
		try
		{
		r.redfile();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			r.savefile();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("program execute Sucessfully");
	}

}
