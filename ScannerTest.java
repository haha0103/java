package basic;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner axb = new Scanner(System.in);
	
	//scanner 
	System.out.println("문자열 입력:");
	String inputString = axb.nextLine();
	System.out.println(inputString);
	System.out.println();
	
	
	System.out.println("정수 입력:");
	int inputint = axb.nextInt();
	System.out.println(inputint);
	System.out.println();
	
	System.out.println("실수 입력:");
	double inputdouble = axb.nextDouble();
	System.out.println(inputdouble);
	System.out.println();
	
	System.out.println("숫자를 입력하세요:");
	int num = axb.nextInt();
	System.out.println("당신이 입력한 숫자는:"+num);
	
	//과제1
	System.out.print("이름을 입력해 주세요:");
	String name = axb.nextLine();
	System.out.println("당신의 이름:"+name);
	
	//과제2
	System.out.print("X=");
	int x = axb.nextInt();
	System.out.print("Y=");
	int y = axb.nextInt();
	int sum = x+y;
	System.out.println("X+Y="+sum);
	
	//과제3
	System.out.print("A=");
	double a = axb.nextDouble(); //float
	System.out.print("B=");
	double b = axb.nextDouble();
	System.out.println("A*B="+a*b);
	
	//과제4
	System.out.println("삼각형의 넓이");
	System.out.print("밑변=");
	int q = axb.nextInt();
	System.out.print("높이=");
	int w = axb.nextInt();
	double t = q*w*0.5;
	System.out.println("넓이="+t);
	
	//과제5
	System.out.println("이름을 입력하세요>>");
	String iname = axb.nextLine();
	System.out.println("나이를 입력하세요>>");
	int age = axb.nextInt();
	System.out.println("혈액형을 입력하세요>>");
	String fe = axb.nextLine();
	System.out.println("이름: "+iname);
	System.out.println("나이: "+age+"세");
	System.out.println("혈핵형: "+fe+"형");
	
	//과제6
	System.out.print("화씨를 입력해라>>");
	int f = axb.nextInt();
	double c = (5/9)*(f-32);
	System.out.println("화씨:"+f+"F");
	System.out.println("섭씨:"+c+"도");
	}
}
	
	
