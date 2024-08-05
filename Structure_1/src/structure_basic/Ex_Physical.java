package structure_basic;
import java.util.Scanner;
public class Ex_Physical {
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		// 생성자 => 인스턴스 초기화를 위해 사용됨
		public PhyscData(String name, int height, double vision) { 
			// TODO Auto-generated constructor stub
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
		
	}
	
	// 평균 키
	static double avgHeight(PhyscData[] dat) {
		double sum=0;
		
		for(int i=0;i<dat.length;i++)
			sum+=dat[i].height;
		
		return sum/dat.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		PhyscData[] a= {
				new PhyscData("임하경", 165, 0.3),
				new PhyscData("강민하", 163, 0.7),
				new PhyscData("박준서", 174, 1.5),
				new PhyscData("유서범", 182, 0.6),
				new PhyscData("이수연", 168, 0.9)
		};
		
		
		System.out.println("■ 신체 검사 리스트 ■");
		System.out.println("이름     키    시력");
		System.out.println("----------------");
		
		for(int i=0; i< a.length; i++) {
			System.out.printf("%-6s%3d%5.1f\n",a[i].name,a[i].height,a[i].vision);	
		}
		System.out.println("평균 키: "+avgHeight(a));

	}

}
