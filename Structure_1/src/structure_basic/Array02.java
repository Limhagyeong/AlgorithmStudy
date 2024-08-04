package structure_basic;
// 난수 발생
import java.util.Random;
import java.util.Scanner;
public class Array02 {
	static float maxOf(float[] a) {
		float max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수: ");
		int num=scanner.nextInt();
		System.out.print(" ");
		float[] height=new float[num];
		for(int i=0;i<num;i++) {
			float ranheight=100+ran.nextFloat(90);
			height[i]=ranheight;
			
			System.out.printf((i+1)+"번쨰 키: %.1f%n ",ranheight);
		}
		System.out.printf("가장 큰 키는 %.1f%n",maxOf(height));
	}

}
