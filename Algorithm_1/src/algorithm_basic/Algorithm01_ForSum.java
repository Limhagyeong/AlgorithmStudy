package algorithm_basic;
import java.util.Scanner;
public class Algorithm01_ForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1부터 입력값까지의 총합: ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print("1부터 "+n+"까지의 총합: "+sum);
	}

}
