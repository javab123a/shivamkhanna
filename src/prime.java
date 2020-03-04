import java.util.Scanner;
public class prime {
	public static void main(String args[])
	{
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			break;
		}
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}
}
