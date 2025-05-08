package bennkyo1;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner axb = new Scanner(System.in);
		
		/*int x=5;
		int y=10;
		int z=-5;
		System.out.println(x<<2);
		System.out.println(z<<2);
		System.out.println(x>>2);
		System.out.println(y>>2);
		System.out.println(z>>2);//2의 보수를 하고 시프트
		
		//과제6
		System.out.print("화씨를 입력해라>>");
		int f = axb.nextInt();
		double c = (5.0/9)*(f-32);
		//int c = (int)a; 
		System.out.println("화씨:"+f+"F");
		System.out.println("섭씨:"+c+"도");*/
		
		//if문
		int age = 10;
		if (age>=8) {
			System.out.println("학교에 다닙니다.");
		}
		
		int age1 = 7;
		if (age1>=8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		int x = 7;
		String s;
		if(x%2==0) {
			s="짝수";
		}
		else {
			s="홀수";
		}
		//s=(x%2==0)?"짝수":"홀수"; 짧게 쓰는 방법 변수이름=(조건)?"true":"false";
		System.out.println(s);
		
		int age2=9;
		if (age2<8) {
			System.out.println("취학 전 아동입니다.");
		}
		else if(age2<14) {
			System.out.println("초등학생 입니다.");
		}
		else if(age2<20) {
			System.out.println("청소년 입니다.");
		}
		else {
			System.out.println("일반인 입니다.");
		}
		
		//과제1
		System.out.println("나이를 입력하세요>>");
		int age3 = axb.nextInt();
		if (age3<8) {
			System.out.println("취학 전 아동입니다.");
			System.out.println("입장료는 1,000원입니다.");
		}
		else if(age3<14) {
			System.out.println("초등학생 입니다.");
			System.out.println("입장료는 2,000원입니다.");
		}
		else if(age3<20) {
			System.out.println("청소년 입니다.");
			System.out.println("입장료는 2,500원입니다.");
		}
		else {
			System.out.println("일반인 입니다.");
			System.out.println("입장료는 3,000원입니다.");
		}
		
		//과제2
		System.out.println("점수를 입력하세요>>");
		int score = axb.nextInt();
		String sc=(score>=60)?"합격":"불합격";
		System.out.println(sc);
		
		//과제3
		System.out.println("정수를 입력하세요>>");
		int number = axb.nextInt();
		String num=(number%2==0)?"짝수":"홀수";
		System.out.println(num);
		
		//과제4
		System.out.println("순위를 입력하세요>>");
		int rank = axb.nextInt();
		if (rank==1) {
			System.out.println("금메달 입니다.");
		}
		else if(rank==2) {
			System.out.println("은메달 입니다.");
		}
		else if(rank==3) {
			System.out.println("동메달 입니다.");
		}
		else {
			System.out.println("메달을 획득하지 못했습니다.");
		}
	}
}
