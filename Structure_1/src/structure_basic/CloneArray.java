package structure_basic;
import java.util.Arrays;
public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b=a.clone();
		
		b[3]=0;
		
		System.out.println("a="+Arrays.toString(a));
		System.out.println("b="+Arrays.toString(b));
	}

}