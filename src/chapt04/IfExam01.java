package chapt04;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		int input = key.nextInt();
		if(input<0) {
				System.out.println(input+"�� �����Դϴ�.");			
		}else {
			if(input%2==1) {
				System.out.println(input+"�� Ȧ�� �Դϴ�.");
			}else {
				System.out.println(input+"�� ¦�� �Դϴ�.");
			}
		}

	}

}
