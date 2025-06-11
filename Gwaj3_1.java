package Gawj4;
import java.util.Scanner;
public class Gwaj3_1 {

	public static void main(String[] args) {
	Scanner ab = new Scanner(System.in);
	
//과제 7
		System.out.println("당신의 등수는?..");
		int r = ab.nextInt();
		if(r==1) {System.out.println(r+"등 이네요, 아주 잘했어요!");}
		else if (r>=2&&r<=3) {System.out.println(r+"등 이네요, 잘했네요.");}
		else if (r>=4&&r<=6) {System.out.println(r+"등 이네요, 보통입니다.");}
		else if (r>=7&&r<=19) {System.out.println(r+"등 이네요, 노력이 필요합니다.");}
		else {System.out.println("잘못된 등수입니다");}
	System.out.println();
//과제 8
		System.out.println("수1:");
		int a = ab.nextInt();
		System.out.println("수2:");
		int b = ab.nextInt();
		
		if(a>b) {System.out.println("큰수 : "+a+" 작은 수 : "+b);}
		else if (b>a) {System.out.println("큰수 : "+b+" 작은 수 : "+a);}
		else {System.out.println("같은 수");}
	System.out.println();
//과제 9
		System.out.println("수를 입력하세요:");
		double num = ab.nextDouble();
		
		if (num%1==0) {System.out.println("정수입니다.");}
		else {System.out.println("실수입니다.");}
	System.out.println();
//과제 10
		System.out.println("정수를 입력하세요:");
		int c = ab.nextInt();
		
		int n1 = c/100;
		int n2 = (c/10)%10;
		int n3 = c%10;
		
		if(c>=100&&c<=999) 
		{System.out.println(""+n3+n2+n1);}
		else if (c>=10&&c<=99)
		{System.out.println(n2+"+"+n3+"="+(n2+n3));}
		else {System.out.println("2자리거나 3자리의 정수 다시 입력");}
	System.out.println();
//과제 11
		System.out.println("수 입력:");
		int d = ab.nextInt();
		int sum=0;
		for(int i=1;i<=d;i++) 
		{sum+=i;}
		System.out.println(sum);
	System.out.println();
//과제 12
		System.out.println("수 입력:");
		int e = ab.nextInt();
		for(int i=1;i<=e;i++) 
		{
			if(i%3==0) {System.out.print(i+" ");}
		}
	}

}
