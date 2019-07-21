import java.util.Scanner;
public class addInput
{
	public static void main(String args[]) 
	{
		double x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Number:");
		x = sc.nextDouble();
		
		System.out.println("Enter Your Second Number:");
		y = sc.nextDouble();
		
		System.out.println("Enter Your Operater:");
		char operator = sc.next().charAt(0); 
		
		if(operator == '+')
		{
			z=x+y;
			System.out.println("Your required result is:" +z);	
		}
		else if(operator == '-')
		{
			z = x-y;
			System.out.println("Your required result is:" +z);	
		}
		else if(operator == '*')
		{
			z = x*y;
			System.out.println("Your required result is:" +z);		
		}
		else if(operator == '/')
		{
			z = x/y;
			System.out.println("Your required result is:" +z);	
		}
		else if(operator == '%')
		{
			z = x%y;
			System.out.println("Your required result is:" +z);		
		}
		
	}
}

