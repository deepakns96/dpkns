package Java_Assignment;
import java.util.*;
public class JavaAssign3 {
public static void main(String[] args)
{
	Scanner myObj1=new Scanner(System.in);
	UserMainCode3 myObj2=new UserMainCode3();
	int num1,num2;
	System.out.println("Enter a positive integer :");
	num1=myObj1.nextInt();
	num2=myObj2.sumOfSquareOfEvenDigits(num1);
	System.out.println("Sum of squares of even digits is "+num2);
}
}

class UserMainCode3 {
	static int sumOfSquareOfEvenDigits(int num1)
	{
		int temp,sum=0;
		while(num1>0)
		{
			temp=num1%10;
			if(temp%2==0)
			{
				sum+=temp*temp;
			}
			num1/=10;
		}
	return sum;
	}
}