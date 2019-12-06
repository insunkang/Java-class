package chapt04;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int input = key.nextInt();
		if(input<0) {
				System.out.println(input+"는 음수입니다.");			
		}else {
			if(input%2==1) {
				System.out.println(input+"는 홀수 입니다.");
			}else {
				System.out.println(input+"는 짝수 입니다.");
			}
		}

	}

}
