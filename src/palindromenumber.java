
import java.util.Scanner;
public class palindromenumber {
	public static void main(String args[])
	{
		int remainder,reverse=0,originalnumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		originalnumber=num;
		while(num!=0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		if(originalnumber==reverse)
		{
			System.out.println("palindrome number");
		}
		else 
		{
			System.out.println("not palindrme");
		}
	}

}
