package algorithm_basic;
// b-a => a>b 경우 b값 재입력
import java.util.Scanner;
public class Algorithm01_Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("a: ");
		int a=scanner.nextInt();
		System.out.print("b: ");
		int b=scanner.nextInt();
		
		while(a>b) {
				System.out.println("b값은 a값보다 크거나 같아야합니다");
				System.out.print("b 재입력: ");
				b=scanner.nextInt();
			}
		System.out.println("b-a = "+(b-a));
	}

}
