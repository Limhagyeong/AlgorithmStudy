package searching_algo;
// 선형 검색(2) => 보초를 사용하여 검색 실패 시 종료판단횟수를 줄여줌 => if(i==n) 필요 X
import java.util.*;
public class SeqSearch02 {
	static int seqSearch(int[] a,int n,int key) {
		int i=0; // 인덱스
		
		a[n]=key; // 배열 마지막에 검색 값을 저장
	
		while(true) {
			if(a[i]==key) {
				break; // 보초에 검색한 값을 저장했기때문에 인덱스 내에 값이 없어도 발견 O 
			}
			i++;
		}
		return i==n?-1:i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=scanner.nextInt();
		int[] x=new int[num+1];
		
		Random ran=new Random();
		
		for(int i=0;i<num;i++) {
			int random=ran.nextInt(100)+1;
			x[i]=random;
			System.out.print("x["+i+"]: "+x[i]+"\n");
		}
		
		System.out.print("검색할 값: ");
		int key=scanner.nextInt();
		
		int idx=seqSearch(x, num, key);
		
		if(idx==-1) {
			System.out.println("검색한 값이 존재하지않습니다");
		}
		else {
			System.out.println("검색한 값은 x["+idx+"] 에 있습니다");
		}
		
	}

}
