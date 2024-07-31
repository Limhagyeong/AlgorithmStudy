package algorithm_basic;
import java.util.Scanner;
public class Algorithm01_gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("단 입력: ");
			n=scanner.nextInt();
			
			if(n<=0) break;
			
			for(int j=1;j<=9;j++) {
				System.out.println(n+"*"+j+"="+(n*j));
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
			
	}

}
