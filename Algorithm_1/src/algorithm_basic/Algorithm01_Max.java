package algorithm_basic;
import java.util.Scanner;
public class Algorithm01_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("세 정수의 최댓값");
		
		System.out.print("a: ");
		int a=scanner.nextInt();
		System.out.print("b: ");
		int b=scanner.nextInt();
		System.out.print("c: ");
		int c=scanner.nextInt();
		
		int max=a;
		if(b>a) {
			max=b;
		}
		if(c>b) {
			max=c;
		}
		
		System.err.println("최댓값: "+max);
		
	}

}
