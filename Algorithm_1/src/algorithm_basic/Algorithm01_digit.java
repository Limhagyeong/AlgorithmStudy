package algorithm_basic;
//입력한 정수의 자릿수
import java.util.Scanner;
public class Algorithm01_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n=scanner.nextInt();
		
		int digit=0;
		if(n==0) {
			digit=1;
		}
		else {
			while(n!=0) {
				n=n/10;
				digit++;
			}
		}
		
		System.out.println("입력한 정수의 자릿수: "+digit);
		
	}

}
