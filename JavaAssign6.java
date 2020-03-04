package Java_Assignment;
import java.util.*;
public class JavaAssign6 {
public static void main(String[] args)
{
	Scanner obj1=new Scanner(System.in);
	UserMainCode6 obj2=new UserMainCode6();
	String a1,a2;
	int n1;
	System.out.println("Enter the string :");
	a1=obj1.nextLine();
	System.out.println("Enter the integer :");
	n1=obj1.nextInt();
	if(a1.length()>=(2*n1))
	{
			a2=obj2.formNewWord(n1,a1);
	}
	else
	{
		System.out.println("The entered string is invalid");
	}
}
}
class UserMainCode6 {
	static String formNewWord(int n2,String a3)
	{
		String s1,s2;
		s1=a3.substring(0,n2);
	    int len=a3.length();
	    s2=a3.substring(len-n2,len);
	    System.out.println(s1+""+s2);
	    return s1+""+s2;
	    
	}
}