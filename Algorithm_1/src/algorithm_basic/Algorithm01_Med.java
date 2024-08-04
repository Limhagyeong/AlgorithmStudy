package algorithm_basic;
import java.util.Scanner;

public class Algorithm01_Med {
	static int med3(int a, int b, int c) {
		if((a<b && c>b) || (a>b && c<b))
			return b;
		else if((a<=b && c>=a) || (a>=b && c>=a))
			return a;
		return c;
	} 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("입력한 세 정수의 중앙값: ");
		System.out.print("a: ");
		int a=scanner.nextInt();
		System.out.print("b: ");
		int b=scanner.nextInt();
		System.out.print("c: ");
		int c=scanner.nextInt();
		
		System.out.println("중앙값은 "+med3(a, b, c));
	}
}
