package algorithm_basic;

public class Algorithm01_Min {

	static int min3(int a, int b, int c){
		int min=a;
		
		if(b<min) min=b;
		if(c<min) min=c;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(10,67,22)의 최소값: " + min3(10, 67, 22));
		System.out.println("max3(1,7,2)의 최소값: " + min3(1, 7, 2));
		System.out.println("max3(104,647,242)의 최소값: " + min3(104, 647, 242));
	}
}
