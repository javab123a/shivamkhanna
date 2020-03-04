import java.util.Scanner;
public class lengthnumber {
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter a number");
		int num=sc.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("length of number is = " +count);
	}
}
