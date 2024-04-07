import java.util.Scanner;

public class PrintEvenNum{

	public static void main(String[] args)
 	{
	Scanner scann = new Scanner(System.in);
	
	System.out.println("Enter a number, upto which you want to print the numbers");
	int num = scann.nextInt();

	for(int i = 2; i<=num; i++)
	{
		if(i%2==0)
		{
	   	System.out.println(i);
		}
	}	

 }
}