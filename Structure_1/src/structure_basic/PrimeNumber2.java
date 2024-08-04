package structure_basic;
// 1000 이하 소수 나열
// 같은 답이 더라도 어떤 알고리즘을 쓰느냐에따라 실행 횟수, 속도, 메모리 사용량 등이 달라짐
public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int ptr=0; // 소수 갯수(인덱스역할)
		int[] prime=new int[500]; // 소수 저장
		
		prime[ptr++]=2; // 0번째에 2 저장 후 1번째 저장소로 변경됨
		
		for(int n=3;n<=1000;n+=2) { // 홀수만 확인 => 2를 제외한 나머지 짝수는 홀수가 될 수 없음
			int i;
			for(i=1;i<ptr;i++) {
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr==i)
				prime[ptr++]=n;
		}
		
		for(int i=0;i<ptr;i++)
			System.out.println(prime[i]);
		
		System.out.println("나눗셈 수행 횟수: "+counter); // 나눗셈 수행 횟수를 현저히 줄일 수 있다
	}

}
