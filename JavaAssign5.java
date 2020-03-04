package Java_Assignment;
import java.util.*;
public class JavaAssign5 {
public static void main(String[] args) {
	Scanner obj1=new Scanner(System.in);
	UserMainCode5 obj2=new UserMainCode5();
	String a1;
	int a2;
	System.out.println("Enter the string");
	a1=obj1.nextLine();
	a2=obj2.checkCharacters(a1);
	
	if(a2==1)
	{
		System.out.println("The string is Valid");
	}
	else if(a2==-1)
	{
		System.out.println("The string is Invalid");
	}
	else
	{
		System.out.println("Please enter a string!");
	}
}
}

class UserMainCode5{
	static int  checkCharacters(String a3)
	{
		int len=a3.length();
		if(a3.charAt(0)==a3.charAt(len-1))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}