package structure_basic;
import java.util.Scanner;
// 배열 요솟수 결정
/*			
 * 			<<본체>>
 * 			length
 * 			| (5) | 
 *          |  0  |
 *          |  1  |
 * height-->|  2  |<--a 통해 참조
 *    |     |  3  |   ↑
 *    |     |  4  |   |  ==> 참조하는 곳 복사
 * 	   - - - - - - - -
 */
public class Array01 {

	static float maxOf(float[] a) {
		float max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수: ");
		int num=scanner.nextInt();
		
		float[] height=new float[num]; // 저장 공간 생성
		for(int i=0;i<num;i++) {
			System.out.print((i+1)+"번 째 키: ");
			height[i]=scanner.nextFloat();
		}
		System.out.println("가장 큰 키는 "+maxOf(height)+"입니다");
	}

}