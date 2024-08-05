package searching_algo;
// 선형 검색(1) => 정렬되지 않은 배열에서 사용
// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
import java.util.*;
public class SeqSearch {
	static int seqSearch(int[] a,int n,int key) {
		int i=0; // 인덱스
		
//		while(true) {
//			if(i==n) {
//				return -1; // 검색 실패 (인덱스 끝까지 검색함)
//			}
//			if(a[i]==key) {
//				return i; // 검색 성공
//			}
//			i++;
//		}
	
		for(i=0;i<n;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=scanner.nextInt();
		int[] x=new int[num];
		
		Random ran=new Random();
		
		for(int i=0;i<num;i++) {
			int random=ran.nextInt(100)+1;
			x[i]=random;
			System.out.print("x["+i+"]: "+x[i]+"\n");
		}
		
		System.out.print("검색할 값: ");
		int key=scanner.nextInt();
		
		long startTime = System.currentTimeMillis();
		
		int idx=seqSearch(x, num, key);
		
		long endTime = System.currentTimeMillis();
		
		if(idx==-1) {
			System.out.println("검색한 값이 존재하지않습니다");
		}
		else {
			System.out.println("검색한 값은 x["+idx+"] 에 있습니다");
		}
		
		long duration = endTime - startTime;
        System.out.println("실행 시간: " + duration);
		
	}

}
