package algorithm_basic;

public class Algorithm01_Max2 {

	static int max3(int a, int b, int c){
		int max=a;
		
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(10,67,22)의 최댓값: " + max3(10, 67, 22));
		System.out.println("max3(1,7,2)의 최댓값: " + max3(1, 7, 2));
		System.out.println("max3(104,647,242)의 최댓값: " + max3(104, 647, 242));
	}
}
