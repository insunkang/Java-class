package chapt04;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		System.out.println("성별을 입력하세요:");
		Scanner key = new Scanner(System.in);
		int mw = key.nextInt();
		
		System.out.println("나이를 입력하세요:");
		int age = key.nextInt();
		
		if(mw%2==1) {	
			if(age>=20) {
				System.out.print("성인남자");
				}
			else {
				System.out.print("청소년남자");
				}
			}
		else {
			if(age>=20) {
				System.out.print("성인여자");
																			}
			else {
				System.out.print("청소년여자");
				}
			}
	}

}
