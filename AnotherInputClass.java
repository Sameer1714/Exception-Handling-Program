package Home;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnotherInputClass {

	public static void main(String[] args) throws Exception{
		
		InputStreamReader inr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inr);
		
		System.out.println("ENter A:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("ENter B :");
		int b=Integer.parseInt(br.readLine());
		
		System.out.println(Math.abs(a-b));
	}

}
