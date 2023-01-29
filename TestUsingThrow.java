package Home;

class ManualException extends RuntimeException{
	
	public ManualException(String msg) 
	{
		// TODO Auto-generated constructor stub
		
		super(msg);
	}
}

public class TestUsingThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10,b=0,c;
			
			if(a==0||b==0) {
			throw new ManualException("we cannot divide integer by Zero");
			//throw create manual Exception 
			}
			else 
			{
				c=a/b;
				
				System.out.println(c);
			}
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
			
		}
		
		
	}

}
