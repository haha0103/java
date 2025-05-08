package bennkyo;
import java.util.Scanner;
public class GwaJ2 {

	public static void main(String[] args) {
		Scanner axb = new Scanner(System.in);
	//문제 1
		System.out.println("두개의 정수를 입력하시오.");
		System.out.println("X=");
		int x= axb.nextInt();
		System.out.println("Y=");
		int y= axb.nextInt();
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"+"+y+"="+(x+y));
	System.out.println();
	//문제 2
		System.out.println("초를 입력하시오.");
		int total= axb.nextInt();
		int seconds=total%60;
		int minutes=total/60;
		System.out.println(total+"초는 "+minutes+"분 "+seconds+"초입니다.");
	System.out.println();
	//문제 3
		System.out.println("정수를 입력하세요>>");
		int num= axb.nextInt();
		String q;
		q=(num%2==0)?"짝수":"홀수";
		System.out.println("이 숫자는 "+q+"입니다.");
	System.out.println();
	//문제 5
		int price=0;
		System.out.println("Wlecom!! 놀이공원!!");
		System.out.println("<<입장객의 나이와 인원 입력>>");
		System.out.println("입장객의 나이(세):");
		int age = axb.nextInt();
		System.out.println("입장객의 인원(명):");
		int count= axb.nextInt();
		if (age<=7||age>=65) {price=500;}
		else {price=1500;}
		int total2=price*count;
		System.out.println(price+"원*"+count+"명"+"="+total2+"원");
		if(count>=20){
			total=total*80/100;
			System.out.println("20% 단체 할인 적용");}
		System.out.println("입장료 총액: "+total+"원");
	System.out.println();
	//문제 6
		//1 while
		int a=1;
		while(a<=300) {System.out.println(a);a++;}
		System.out.println();
		//2 for
		for(int i=1;i<=300;i++) {System.out.println(i);}
	System.out.println();
	//문제 7
	 	for(int i=0;i<3;i++) {System.out.println("환용합니다.");}
	 System.out.println();
	//문제 9
	 	int sum=0;
	 	for(int i=0;i<=10;i++) {sum+=i;}
	 	System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	 System.out.println();
	 //문제 10
		  int sum2=0;
		  for(int i=1;i<=20;i++) {if(i%3==0){System.out.print(i+" "); sum2+=i;}}
		  System.out.print(sum2); 
	  System.out.println();
	 // 문제 11
		  int oddsum=0;
		  int evensum=0;
		  for(int i=0;i<=100;i++) {
			  if(i%2==0) {oddsum+=i;}
			  else {evensum+=i;}
			}
		  System.out.println("1부터 100가지 홀수의 합은 "+evensum+"입니다.");
		  System.out.println("1부터 100가지 짝수의 합은 "+oddsum+"입니다.");
	System.out.println();
	//문제 12
		System.out.println("단을 입력하세요:");
		int dan = axb.nextInt();
		for(int i=1;i<=9;i++) 
		{System.out.println(dan+"*"+i+"="+(dan*i));}
	System.out.println();
	//문제 13
		System.out.println("X=");
		int num1= axb.nextInt();
		System.out.println("Y=");
		int num2= axb.nextInt();
		
		for(int i=1;i<=(num1<num2?num1:num2);i++) {
			if(num1%i==0&&num2%i==0) {System.out.println(i);}
		}
	}
}
