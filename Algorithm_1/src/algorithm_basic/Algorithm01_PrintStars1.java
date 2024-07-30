package algorithm_basic;
import java.util.Scanner;
// *을 n개 출력 & W개마다 줄바꿈
public class Algorithm01_PrintStars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=0;
		int w=0;
		
		System.out.println("n개의 *을 출력하되 W개마다 줄바꿈");
		
		while(n<=0){
			System.out.print("n의 값:");
			n=scanner.nextInt();
		}; // while => 예외처리
		
		while(w<=0 || w>n){
			System.out.print("w의 값:");
			w=scanner.nextInt();
		}; // while => 예외처리
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
			if(i%w==0)
				System.out.println();
		}
		if(n%w!=0)
			System.out.println(); 
		System.out.println(1);
	}

}
