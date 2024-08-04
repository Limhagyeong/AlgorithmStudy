package structure_basic;
// 1000 이하 소수 나열
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0; // 나눗셈 횟수 
		
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n%i==0) 
					break;
			}
//			for문 나왔을 때 i값은 증가되어있음
			if(n==i) {
				System.out.println(n);
			}
		}
		System.out.println("나눗셈 수행 횟수: "+counter);
	}

}
