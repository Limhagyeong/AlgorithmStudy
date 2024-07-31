package algorithm_basic;
// 구구단 표의 위쪽과 왼쪽 더하기
public class Algorithm01_gugudanSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("   |");
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		for(int h=1;h<=9;h++) {
			System.out.print(" "+h+" |");
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d",h+j);
			}
			System.out.println();
		}
	}

}
