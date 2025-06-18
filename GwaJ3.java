package Gwaj3;

import java.util.Scanner;

public class M20417 {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		
//과제 1
		System.out.println("정수를 입력하세요.");
		int num = ab.nextInt();
		
		if(num>=10) 
		{System.out.println("10이상 입니다.");}
		else {System.out.println("10보다 작습니다.");}
	System.out.println();
//과제 2
		System.out.println("두 개의 정수를 입력하세요.");
		System.out.println("X=");
		int x = ab.nextInt();
		System.out.println("Y=");
		int y = ab.nextInt();

		if(x+y>=20) 
		{System.out.println("두 수의 합이 20이 넘습니다. "+(x+y));}
		else {System.out.println("두 수의 합이 20이 안넘습니다. "+(x+y));}
	System.out.println();
//과제 3
		System.out.println("정수를 입력하세요.");
		int num1 = ab.nextInt();
		
		String q;
		q = (num1%2==0)? "짝수":"홀수";
		System.out.println(q+" 입니다.");
		
		if(num1%2==0) 
		{System.out.println("짝수 입니다.");}
		else {System.out.println("홀수 입니다.");}
	System.out.println();0
//예제 length
		System.out.println("이름을 입력하세요>>");
		String name = ab.nextLine();
		System.out.println("입력한 이름: "+name);
		System.out.println("이름의 글자 수: "+name.length());
	System.out.println();
//과제 4
		System.out.println("이름을 입력하세요>>");
		String name1 = ab.nextLine();
		
		if(name1.length()>=5) 
		{System.out.println("5글자 이상입니다.");}
		else {System.out.println("어서오세요 "+name1+"님");}
//과제 5
		System.out.println("3자리의 정수를 입력하세요.");
		int num2 = ab.nextInt();
		if(num2>=100&&num2<=999) 
		{
			int n1 = num2/100;
			int n2 = (num2/10)%10;
			int n3 = num2%10;
			System.out.println(n1+"+"+n2+"+"+n3+"="+(n1+n2+n3));
		}
		else {System.out.println("다시 3자리의 정수를 입력하세요.");}
//과제 6
		System.out.println("연필>>");
		int pen = ab.nextInt();
		System.out.println("학생>>");
		int stu = ab.nextInt();
		
		int ps1 = pen/stu;
		int ps2 = pen%stu;
				
		System.out.println("나눠 줄 것 "+ps1+"개 : 나머지 "+ps2+"개");
	}

}
