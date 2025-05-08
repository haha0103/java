package bennkyo5;

import java.util.Scanner;

public class GwaJ {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
	//문제 5
		int price = 0;
		System.out.println("입장객의 나이(세):");
		int age= ab.nextInt();
		System.out.println("입장객의 인원()명");
		int count= ab.nextInt();
		
		if (age>=65||age<=7) {price=500;}
		else {price=1500;}
		
		int total=price*count;
		System.out.println("<<입장료>>");
		System.out.println(price+"원"+"*"+count+"명"+"="+total+"원");
		
		if(count>=20) {
			total=total*80/100;
			System.out.println("20% 단체 할인 적용");}
		System.out.println("입장룡 총액: "+total+"원");
	//문제 7
		for(int i=0;i<3;i++) {
			System.out.println("환영합니다.");}
	System.out.println();
	//문제 9
		int sum=0;
		for(int i=0;i<11;i++) {
			sum+=i;
		}System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	System.out.println();
	//문제 10
	int sum2=0;
	for(int i=0;i<21;i++) {
		if(i%3==0) {
			System.out.print(i+" ");sum2+=i;}}
		System.out.print(sum2);
	System.out.println();
	//과제 11
		int oddsum=0;
		int evensum=0;
		for(int i=0;i<101;i++) {
			if(i%2==0) {oddsum+=i;}
			else {evensum+=i;}
		}System.out.println("1부터 100가지 짝수의 합은 "+oddsum+"입니다.");
		System.out.println("1부터 100가지 홀수의 합은 "+evensum+"입니다.");
	System.out.println();
	//과제 12
		System.out.println("단을 입력하세요>>");
		int dan = ab.nextInt();
		for(int i=1;i<10;i++) {
			System.out.print(dan+"*"+i+"="+(dan*i)+"\t");}
	System.out.println();
	//과제 13
		System.out.println("X=");
		int num1= ab.nextInt();
		System.out.println("Y=");
		int num2= ab.nextInt();
		
		for(int i=1;i<=(num1<num2?num1:num2);i++) {
			if(num1%i==0&&num2%i==0) {
				System.out.println(i);
			}
		}
	}

}
