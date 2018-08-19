import java.util.Scanner;
public class largest {
 public static void main(String[] args) {
  int a,b,c;
 System.out.println("Enter the numbers");
 Scanner in = new Scanner(System.in);
 a = in.nextInt();
 b = in.nextInt();
 c = in.nextInt();

if( a>= b && a>=c)
 { System.out.println("largest number is" +a);
 }
else if( b>= a && b>=c)
 { System.out.println("largest number is" +b);
 }
else
 { System.out.println("largest number is" +c);
 }
}
}