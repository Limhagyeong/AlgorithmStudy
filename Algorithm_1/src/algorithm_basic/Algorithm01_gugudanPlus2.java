package algorithm_basic;
// 입력한 수를 한 변으로 하는 정사각형을 *로 출력
import java.util.Scanner;
public class Algorithm01_gugudanPlus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.print("출력할 정사각형의 변의 길이 지정: ");
			
			int n=scanner.nextInt();
			
			if(n<=0) {
				System.out.println("0보다 큰 수를 입력하세요");
				continue;
			}
			
			for(int i=1;i<=n;i++) {
				System.out.print("*");
				for(int j=1;j<=n;j++) {
					if(j%n==0) {
						System.out.println();
					}
					else System.out.print("*");
				}
			}
		}
		
	}

}
