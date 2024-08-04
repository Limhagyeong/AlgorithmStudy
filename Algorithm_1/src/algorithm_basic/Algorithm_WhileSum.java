package algorithm_basic;
import java.util.Scanner;
public class Algorithm_WhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("1부터 입력값까지의 총합: ");
		int n=scanner.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<=n) {
			sum+=i;
			i++;
		}
		
		System.out.print("1부터 "+n+"까지의 총합: "+sum);
		
	}

}
