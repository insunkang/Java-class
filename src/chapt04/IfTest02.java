package chapt04;

import java.util.Scanner;
//if~else 문과 Scanner
public class IfTest02 {

	public static void main(String[] args) {
			//scanner로 점수를 입력 받아 90점 이상이면 "통과"를 출력하고
			//90미만이면 "재시험"을 출력하세요.
		
			Scanner key = new Scanner(System.in);
			System.out.println("숫자를 입력하세요:");
			int inputVal = key.nextInt();
			
			if(inputVal>=90) {
				System.out.println("통과");
				key.close();
			}else {
				System.out.println("재시험");
				key.close();
			}
			

	}

}
