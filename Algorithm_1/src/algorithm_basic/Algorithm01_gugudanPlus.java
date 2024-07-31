package algorithm_basic;

public class Algorithm01_gugudanPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("  |");
		for(int i=1;i<=9;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.println("===============================");

		for(int h=1;h<=9;h++) {
			System.out.print(h+" |");
			for(int j=1;j<=9;j++)
			{
				System.out.printf("%3d",h*j);
			}
			System.out.println();
		}
		

}
	
}
