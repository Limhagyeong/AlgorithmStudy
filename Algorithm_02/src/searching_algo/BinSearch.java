package searching_algo;
// 이진 검색 (1)
// 요솟수가 n개인 오름차순 정렬 배열 a에서 key와 같은 요소를 이진 검색
import java.util.*;
public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
		int pl=0; // 검색 범위의 첫 인덱스
		int pr=n-1; // 검색범위 끝 인덱스
		
		do {
			int pc=(pl+pr)/2; // 검색범위 중간 인덱스
			if(a[pc]==key) {
				return pc;
			}
			else if(a[pc]<key) {
				pl=pc+1; // 오름차순 정렬 되어있으므로 검색 시작 범위 뒤쪽 절반으로 좁힘
			}
			else
				pr=pc-1; // 검색 종료 범위를 앞쪽 절반으로 좁힘
		
		}while(pl<=pr);
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=scanner.nextInt();
		int[] a=new int[num];
		
		Random ran=new Random();
		for(int i=0;i<num;i++) {
			int random=ran.nextInt(100)+1;
			a[i]=random;
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<num;i++) {
			System.out.print("a["+i+"]: "+a[i]+"\n");
		}
		
		System.out.print("검색할 값 입력: ");
		int key=scanner.nextInt();
		
		long startTime = System.currentTimeMillis();
		
		int idx=binSearch(a, num, key);
		
		long endTime = System.currentTimeMillis();
		
		if(idx==-1) {
			System.out.println("검색하고자 하는 값이 없습니다");
		}
		else
			System.out.println("검색한 값은 a["+idx+"] 에 있습니다");
		
		long duration = endTime - startTime;
        System.out.println("실행 시간: " + duration);
	}
	
	

}
