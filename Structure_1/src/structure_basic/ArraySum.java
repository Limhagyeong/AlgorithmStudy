package structure_basic;
//배열의 합
import java.util.Arrays;
import java.util.Random;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x=new int[5];
		int sum=0;
		Random ran=new Random();
		
		for(int i=0;i<x.length;i++) {
			int n=ran.nextInt(100)+1;
			x[i]=n;
			sum+=x[i];
		}
		System.out.println(Arrays.toString(x));
		System.out.println(sum);
		
		
		
	}

}
