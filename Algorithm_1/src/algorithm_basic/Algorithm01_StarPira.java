package algorithm_basic;
// n단의 피라미드 출력
import java.util.Scanner;
public class Algorithm01_StarPira {
	// 피라미드 출력 메소드
		static void pira(int n) {
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=n-i; j++)	
					System.out.print(' ');
				for (int j=1; j<=(i-1)*2+1; j++)
					System.out.print('*');
				System.out.println();				
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0;

		System.out.println("피라미드 출력");

		while(n<=0){
			System.out.print("단수: ");
			n = scanner.nextInt();
		};

		pira(n);				
	}

}
