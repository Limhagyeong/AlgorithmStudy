package algorithm_basic;
import java.util.Scanner;
// a,b 대소관계에 관계 없이 합 구하기
public class Algorithm01_Sum1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("a: ");
		int a=scanner.nextInt();
		System.out.print("b: ");
		int b=scanner.nextInt();
		
		int start=a > b ? b : a;
		int end=a < b ? b : a; 
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		
		System.out.println("a와b를 포함한 그 사이의 정수 합: " + sum);
		
	}
}
