package Home;

import java.util.ArrayList;

import java.util.ListIterator;

public class Sum_EvenInArrayList {

	public static void sum(ArrayList<Integer> al) {
		int sum=0;
		for(int i:al) {
			sum+=i;
		}
		System.out.println("Total Sum of ArrayList element : "+sum);
	}
	public static void even(ArrayList<Integer> al) {
		
		int sum=0;
		for(int i:al) {
			
			if(i%2==0) {
				sum+=i;
			}
		}
	System.out.println("Sum of Only Even No : "+sum);
	}
	public static void reverse(ArrayList<Integer> al,int n) 
	{
		
	       int no=al.get(n);
	      
	       int rev=0;
	       while(no >0) {
	    	   int rem=no%10;
	    	   rev=rev*10+rem;
	    	   no=no/10;
	       }
		System.out.println("Original No : "+al.get(n)+"  Reverse No : "+rev);
	}
	public static void maxno(ArrayList<Integer> al) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i:al) {
			if(i >max) {
				max=i;
			}
			if(i < min) {
				min=i;
			}
		}
		System.out.println("MAx Element In ArrayList : "+max);
		
		System.out.println("MIN Element In ArrayList : "+min);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(23);
		al.add(45);
		al.add(67);
		al.add(76);
		al.add(21);
		
		sum(al);
		even(al);
		reverse(al,3);
		maxno(al);
		
		ListIterator< Integer> li=al.listIterator();
		
		while(li.hasNext()) 
		{
			System.out.print(li.next()+" ");
		}
		
		System.out.println("\nreverse of arrayList : ");
		while(li.hasPrevious()) {
			if(76==li.previous()) {
			li.remove();
			}
		}
		System.out.println(al);
		
		
		
		
	}

}
