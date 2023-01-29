package Home;



public class Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
	  int a=10,b=2,c;
	  
	  try {
		  c=a/b;
		  
		  System.out.println(c);
	  }
	   catch (Exception e)
	  {
		// TODO: handle exception
		  
		   System.out.println(e);
	  }
	  finally {
	   System.out.println(a);
	   
	  }
	   
	}

}
