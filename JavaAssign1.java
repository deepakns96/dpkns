package Java_Assignment;
import java.util.*;
public class JavaAssign1 {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
				int n,r;
		UserMainCode ob1=new UserMainCode();
		System.out.println("Enter a positive integer :");
		n=obj.nextInt();
		if(n>0)
		{
			r=ob1.CheckSum(n);
			if(r==1)
				System.out.println("The sum of odd digits is odd");
			if(r==-1)
				System.out.println("The sum of odd digits is even");
		}
		else
		{
			System.out.println("Please enter a positive integer!\n");
		}
	}
}

class UserMainCode {
static int CheckSum(int n)
{
	int temp,sum=0;
	while(n>0)
	{
		temp=n%10;
		if (temp%2!=0)
		{
			sum+=temp;
		}
		n/=10;
	}
	System.out.println("Sum is "+sum);
	if (sum%2!=0)
		return 1;
	else
		return -1;
}
}