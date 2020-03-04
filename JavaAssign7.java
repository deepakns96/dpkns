package Java_Assignment;
import java.util.*;
public class JavaAssign7 {
public static void main(String[] args)
{
	Scanner obj1=new Scanner(System.in);
	UserMainCode7 obj2=new UserMainCode7();
	int n1,n2;
	System.out.println("Enter an integer :");
	n1=obj1.nextInt();
	n2=obj2.reverseNumber(n1);
	System.out.println("The reversed number is "+n2);
}
}
class UserMainCode7 {
	static int reverseNumber(int n3)
	{
		int rev=0;
		while(n3!=0)
		{
			int temp=n3%10;
			rev = rev*10 + temp;
			n3/=10;
		}
		return rev;
	}
}
