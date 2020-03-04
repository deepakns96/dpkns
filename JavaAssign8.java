package Java_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaAssign8 {
public static void main(String[] args)
{
	ArrayList <Integer> a=new ArrayList<Integer>();
	ArrayList <Integer> b=new ArrayList<Integer>();
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter the 5 elements of first Array list :");
	for(int i=0;i<5;i++)
		a.add(obj1.nextInt());
	System.out.println("Enter the 5 elements of second Array list :");
	for(int i=0;i<5;i++)
		b.add(obj1.nextInt());
	obj1.close();
	ArrayList <Integer> c=new ArrayList<Integer>();
	c=UserMainCode8.sortMergedArrayList(a,b);
	for(Integer o:c)
		System.out.println(o);
}
}
class UserMainCode8{
	static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer>x,ArrayList<Integer> y)
	{
		ArrayList <Integer> z=new ArrayList<Integer>();
		x.addAll(y);
		Collections.sort(x);
		System.out.println("Ordered array" +x);
		z.add(x.get(2));
		z.add(x.get(6));
		z.add(x.get(8));
		return z;
	}
}