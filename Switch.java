package bennkyo2;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner axb = new Scanner(System.in);
		
	//switch문
		/*int n=2;
		switch (n) {
		case 1:
		     System.out.println("하나입니다.");
		break;
		case 2:
		     System.out.println("둘입니다.");
		break;
		case 3:
		     System.out.println("셋입니다.");
		break;
		default:
			System.out.println("넷이상입니다");}
		
		//과제 1
		System.out.println("층수를 눌러주세요>>");
		int level = axb.nextInt();
		switch (level) {
			
		case 1:
		     System.out.println("약국");
		break;
		case 2:
		     System.out.println("내과");
		break;
		case 3:
		     System.out.println("한의원");
		break;
		case 4:
		     System.out.println("스터디 카페");
		break;
		case 5:
		     System.out.println("태권도 학원");
		break;
		default:
		     System.out.println("다시 층수를 눌러 주세요.");		
		}
		
		//과제2
		System.out.println("순위를 입력하세요>>");
		int rank = axb.nextInt();
		switch (rank) {
		
		case 1:
		     System.out.println("금메달 입니다.");
		break;
		case 2:
		     System.out.println("은메달 입니다.");
		break;
		case 3:
		     System.out.println("동메달 입니다.");
		break;
		default:
			System.out.println("메달을 획득하지 못했습니다");*/
		
		/*//while문
		int i=0;
		while (i<5) {
			System.out.println(i);
			i++;
		}
		
		//과제1
		int q=10;
		while (q>0) {
			System.out.println(q);
			q--;
		}
		//과제2
		int w=1;
		int r=0;
		while (w<11) {
			r+=w;//r=r+w
			w++;}
		System.out.println("1부터 10까지의 합은 "+r+" 입니다.");*/
		
		//do~while문 무조건 1번 실행하고 조건을 확인
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<5);
		
		//과제1
		int w=1;
		int r=0;
		do {
			r+=w;
			w++;
		}while(w<51);
		System.out.println("1부터 50까지의 합은 "+r+" 입니다.");
	}
}
