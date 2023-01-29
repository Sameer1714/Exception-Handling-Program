package Home;

class VotingAge extends Exception
{
	public VotingAge()
	{
		// TODO Auto-generated constructor stub
	}
	VotingAge(String msg)
	{
		super(msg);
	}
}
public class CheckExceptionProgram
{

	public static void main(String[] args) 
	{
		int age=17,temp=0;
		try 
		{
				if(age <18)
				{
					temp=1;
					throw new VotingAge("you are not eligible for Voting");
				}
				else 
				{
					System.out.println("you are eligible for voting");
				}
		}
		catch (Exception e)
		{
			
				e.printStackTrace();
		}
		if(temp==1)
		System.out.println("\n try next time");
	}

}
