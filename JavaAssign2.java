package Java_Assignment;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JavaAssign2 {
public static void main(String[] args)
{
	Scanner obj1=new Scanner(System.in);
	UserMainCode2 obj2=new UserMainCode2();
	int r,j;
	System.out.println("Enter the number in format : xxx-xxx-xxxx");
	String s=obj1.nextLine();
	r=obj2.ValidateNumber(s);
	if(r==1)
		System.out.println("Valid number format");
	if(r==-1)
		System.out.println("Invalid number format");
}
}
class UserMainCode2 {
	public int ValidateNumber(String s1)
	{
		Pattern p=Pattern.compile("[0-9][0-9][0-9](-)[0-9][0-9][0-9](-)[0-9][0-9][0-9][0-9]");
		Matcher m=p.matcher(s1);
		if(m.find()&&m.group().contentEquals(s1))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
