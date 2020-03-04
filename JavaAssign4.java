package Java_Assignment;
import java.util.*;
public class JavaAssign4 {
public static void main(String[] args)
{
	Scanner obj1=new Scanner(System.in);
	UserMainCode4 obj2=new UserMainCode4();
	String n1,n2;
	System.out.println("Enter the string");
	n1=obj1.nextLine();
	int len=n1.length();
	if(len%2==0)
	{
		n2=obj2.getMiddleChars(n1);
		System.out.println("The middle characters are :"+n2);
	}
	else
	{
		System.out.println("Please enter even number string!");
	}
	
}
}

class UserMainCode4 {
	static String getMiddleChars(String s1)
	{
		int len2=(s1.length())/2;
		return s1.substring((len2-1),(len2+1));
	}
}