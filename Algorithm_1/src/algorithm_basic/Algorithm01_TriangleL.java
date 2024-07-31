package algorithm_basic;
// 왼쪽 아래가 직각인 이등변삼각형 출력
import java.util.Scanner;
public class Algorithm01_TriangleL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력\n");
		
		int n=0;
		int k=1;
		
		while(true) {
			System.out.println("1.프로그램 실행");
			System.out.println("2.프로그램 종료\n");
			System.out.print("번호 선택: ");
			n=scanner.nextInt();
			System.out.println();
			
			if(n==2) {
				System.out.println("프로그램 종료");
				scanner.close();
				break;
			}
			
			else if (n==1) {
				System.out.print("몇 단 삼각형을 출력하시겠습니까: ");
				k=scanner.nextInt();
				System.out.println();
				
				if(k<=1) {
					System.out.println("단은 1보다 큰 수이어야합니다\n");
					continue;
				}	
				
				for(int i=1;i<=k;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
				continue;
			}
			
			else if(n<1 || n>2)
				System.out.println("번호를 다시 입력하세요\n");
			
			
			}
			
			
		}
	}	

