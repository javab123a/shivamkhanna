import java.util.Scanner;
public class prime1to100 {
	
public static void main(String[] args) {
	int num,i,count;
	for(num=1;num<=100;num++)
	{
		 count=0;
	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
	
	if(count==0)
	{
	System.out.println(num);
	}
	}}
}
