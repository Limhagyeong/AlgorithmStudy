package structure_basic;
// 1000 이하 소수 나열(3)
// 어떤 수 n이 p로 나누어떨어지면 (p,n/p)는 약수 쌍을 이룬다
// 약수 쌍은 반드시 n의 제곱근 이하와 이상으로 이루어진다
// n을 제곱근으로 나누었을 때 나누어 떨어지는 값이 있다면 n은 소수가 아닌것! 
// => 제곱근 이하에서 나누어떨어지는 값이 있다면 이상에도 반드시 존재하기 때문

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0; // 나눗셈횟수
		int ptr=0; // 소수 갯수
		int[] prime=new int[500]; // 소수 저장
		
		prime[ptr++]=2;
		prime[ptr++]=3;
		
		for(int n=5;n<=1000;n+=2) {
			boolean flag=false; 
			for(int i=1;prime[i]*prime[i]<=n;i++) { // n의 제곱근까지만 수행해보면 충분함 
				counter+=2; // 연산 수행 횟수를 기록 => prime[i]*prime[i] , n%prime[i]
				if(n%prime[i]==0) { // 나누어 떨어지면 무조건 쌍을 이룸 (소수 X)
					flag=true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++]=n;
				counter++;
			}
		}
		
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈 실행 횟수: "+counter);
	}

}
