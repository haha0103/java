package bennkyo4;
import java.util.Scanner;
public class For2 {

	public static void main(String[] args) {
		Scanner axb = new Scanner(System.in);
		
	//break문
		for(int i=0; i < 10; i++) {
			if(i==4) {break;}
			System.out.println(i);
		}System.out.println();
	//과제1
		int s=0;
		int q;
		for(q=1 ; q <=100; q++) {
			s+=q;
			if(s>100) {break;}}System.out.println(q);
		System.out.println();
		
	//continue문
		for(int i=0; i < 10; i++) {
			if(i==4) {continue;}
			System.out.println(i);
		}System.out.println();
		
	//과제1
		for(int i=1; i <=10; i++) {
			if(i%3==0) {continue;}System.out.println(i);}
		System.out.println();
	//과제2
		//1
		for(int i=1; i <=10; i++) {
			if(i%3==0) {System.out.println(i+" ");continue;}}
		System.out.println();
		//2
		for(int i=1; i <=10; i++) {
			if(i%3!=0) {continue;}System.out.println(i);}
		System.out.println();
		
	//문제1
		System.out.println("두개의 정수를 입력하시오.");
		System.out.println("첫 번째 정수를 입력하세요.");
		double x = axb.nextDouble();
		System.out.println("두 번째 정수를 입력하세요.");
		double y = axb.nextDouble();
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println();
		
	//문제2
		System.out.println("초를 입력하세요.");
		int total= axb.nextInt();
		int minutes= total/60;
		int seconds= total%60;
		System.out.println(total+"초는 "+minutes+"분 "+seconds+"초입니다.");
	//문제3
		String e;
		System.out.println("정수를 입력하세요>>");
		int num=axb.nextInt();
		e=(num%2==0)?"짝수":"홀수";
		System.out.println("이 수는 "+e+"입니다.");
	//문제6
		//1for
		for(int i=1;i<=300;i++) {
			System.out.println(i);}
		//2while
		int w=1;
		while(w<=300) {System.out.println(w);w++;}
	}

}
