package Home;

class Age extends RuntimeException{
	
	

	Age(String msg){
		super(msg);
	}
}

public class MannualExceptionUsingThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=15;
		try
		{
		   if(age<18) {
			throw new Age("Your Age NOt Valid For Voting");
		   }
		   else {
			System.out.println("you can vote");
		   }
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}

}
