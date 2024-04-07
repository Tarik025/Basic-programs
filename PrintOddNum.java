import java.util.Scanner;

public class PrintOddNum{

	public static void main(String[] args)
	{
	  Scanner scn = new Scanner(System.in);
	
 	  System.out.println("Enter a number");
	  int num = scn.nextInt();

	  System.out.println("Odd numbers between 0 to " + num + " are: ");

	  for(int i=0; i<=num; i++)
	    {
	      if(i%2!=0)
		{
		  System.out.println(i);
		}
	
	
	    }
	
 }
}