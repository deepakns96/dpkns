import java.util.Scanner;

class Assign2 {
public static void main(String[] args) {
 Scanner myNum = new Scanner(System.in);

 int a;
 System.out.println("Enter first number : ");
 a = myNum.nextInt();

 int b;
 System.out.println("Enter second number : ");
 b = myNum.nextInt();

 int c;
 System.out.println("Enter third number : ");
 c = myNum.nextInt();

 int x= (a>b) && (a>c) ? a : (b>a) && (b>c) ? b : c;
 System.out.println("The largest number is : " +x);

 }
}