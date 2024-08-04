package structure_basic;
// b배열을 a배열로 복사
import java.util.*;
public class ArrayCopy {
	
	static void copy(int[] a,int[] b) {
		
		int num=a.length<=b.length?a.length:b.length;
		
		for(int i=0;i<a.length;i++) {
			a[i]=b[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("a의 요솟수 입력:");
		int na=scanner.nextInt();
		int[] a=new int[na];
		
		System.out.print("b의 요솟수 입력:");
		int nb=scanner.nextInt();
		int[] b=new int[nb];
		
		Random ran=new Random();
		
		for(int i=0;i<b.length;i++) {
			b[i]=ran.nextInt(50)+1;
		}

		copy(a,b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
