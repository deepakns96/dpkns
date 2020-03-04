package Java_Assignment;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JavaAssign9 {
	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		UserMainCode9 obj2=new UserMainCode9();
		String a1;
		int a2;
		System.out.println("Enter the date in format dd/mm/yyyy :");
		a1=obj1.nextLine();
		a2=obj2.validateDate(a1);
		if(a2==1)
		{
			System.out.println("The date is valid");
		}
		if(a2==-1)
		{
			System.out.println(("The date is invalid!"));
		}
	}

}
class UserMainCode9{
	static int validateDate(String s1) {
		Pattern p=Pattern.compile("[0-9][0-9](/)[0-9][0-9](/)[0-9][0-9][0-9][0-9]");
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