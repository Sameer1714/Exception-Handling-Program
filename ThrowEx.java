package Home;



public class ThrowEx {

	public static void arrayelement(int[] arr,int n) 
	{
		try
		{
		if(n > arr.length) {
			throw new ArrayIndexOutOfBoundsException("n is to high");
		}
		else
		{
			
			System.out.println(arr[n]);
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,4};
		
		arrayelement(arr,6);
	}

}
