import java.util.Scanner;
public class calculatorjava {

	
	public static void main(String[] args) {
		int ch1;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();	
			System.out.println("enter the choice");
			System.out.println("1=addition");
			System.out.println("2=subtraction");
			System.out.println("3=multiplication");
			System.out.println("4=division");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Addition " +(a+b));
			}
			else if(ch==2)
			{
				System.out.println("Subtraction " +(a-b));
			}
			else if(ch==3)
			{
				System.out.println("Multiplication "+(a*b));
			}
			else if(ch==4)
			{
				System.out.println("Division " +(float) a/(float) b);
			}
			System.out.println("u want to continue press 1 if yes else press 0");
			ch1=sc.nextInt();
		}while(ch1==1);

		}
}


