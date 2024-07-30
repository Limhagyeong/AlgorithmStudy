package algorithm_basic;
// 합을 구하는 과정 , 총합
import java.util.Scanner;
public class Algorithm01_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("1부터 n까지의 총합");
		int n;
		
		do {
			System.out.print("n: ");
			n=scanner.nextInt();
		}while(n<=0);
		
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i<n)
				System.out.print(i+"+"); 
			else
				System.out.print(i+"="); 
			sum+=i; 
		}
		
		System.out.println(sum);
	}

}
