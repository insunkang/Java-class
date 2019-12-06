package chapt04;

import java.util.Scanner;

public class SwitchTest0 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력");
		int num=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("가");
			break;
		case 2:
			System.out.println("나");
			break;
		case 3:
			System.out.println("다");
		 default:
			 System.out.println("잘못입력");
		}
	}

}
