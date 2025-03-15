package Q518;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int a,b,c;
       a =sc.nextInt();
       b =sc.nextInt();
       c =sc.nextInt();
       sc.close();
       System.out.println("sum : "+(a+b+c));
       System.out.println("avg : "+(a+b+c)/3);
	}
}