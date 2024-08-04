package structure_basic;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ReverseArray {

	static void swap(int[] a,int f, int e) {
		int temp=a[f];
		a[f]=a[e];
		a[e]=temp;
	}
	
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			swap(a,i,a.length-i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=scanner.nextInt();
		
		System.out.println("=== 정렬 전 배열 ===");
		
		int[] x=new int[num];
		Random ran=new Random();
		
		for(int i=0;i<x.length;i++) {
			x[i]=ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(x));
		
		System.out.println("=== 정렬 후 배열 ===");
		reverse(x);
		System.out.println(Arrays.toString(x));
	}

}
