import java.util.Scanner;

public class BasicCalculator{
	
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

 	System.out.println("Which of the operation do you want to perform? +,-,*,/");
	String opt = sc.next();


	System.out.println("Enter First number");
	int num1 = sc.nextInt();
	
	System.out.println("Enter First number");
	int num2 = sc.nextInt();

	

	switch(opt){

		case "+": 
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

		break; 
		
		case "-":
			 System.out.println(num1 + " - " + num2 + (num1+num2));
		break;

		case "*":
			System.out.println(num1 + " * " + num2 + (num1*num2));
		break;
		
		case "/":
			if(num2 != 0){
			  System.out.println(num1 + " / " + num2 + (num1/num2));
			}
			else{
			  System.out.println(" Not define ");
			}
		break;


		 default:
 		   System.out.println("These operations are not defined or invalid operation");


	}


	
 }
}