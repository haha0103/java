package bennkyo3;

public class For {
	public static void main(String[] args) {
		
	//fro문
		//1
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
		System.out.println();
		//2
		for(int i=0;i<=5;i=i+2) {
			System.out.println(i);
		}
		System.out.println();
		
	//과제1
		int s=0;
		for(int i=0;i<101;i++) {
			s=i+s;
		}System.out.println("1부터 100까지 합은"+s+"입니다.");
		System.out.println();
	//과제2
		//1
		int q=0;
		for(int i=1;i<100;i+=2) {
			q+=i;
			
		}System.out.println("1부터 100까지 홀수의 합은"+q+"입니다.");
		//2
		int a=0;
		for(int i=0;i<101;i++) {
			if(i%2==1) a+=i;//=if(i%2!=0)
		}System.out.println("1부터 100까지 홀수의 합은"+a+"입니다.");
		System.out.println();
	//과제3
		int e=2;
		for(int i=1;i<10;i++) {
			System.out.println(e+"*"+i+"="+i*e);
		}
		System.out.println();
	
	//다중for문
		//1
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}System.out.println();}
		System.out.println();
		//2
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println( );}
		System.out.println();
		//3
		int cnt=0;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				cnt++;
			System.out.println("i="+i+", j="+j+" cnt="+cnt);
			}System.out.println("실행 횟수:"+cnt);}
	//과제1
		for(int r=2;r<10;r++) {
		System.out.println(); System.out.println(r+"단");
		for(int i=1;i<10;i++) {
			System.out.println(r+"*"+i+"="+i*r);}}
	}
}
