package chapt04;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���:");
		Scanner key = new Scanner(System.in);
		int mw = key.nextInt();
		
		System.out.println("���̸� �Է��ϼ���:");
		int age = key.nextInt();
		
		if(mw%2==1) {	
			if(age>=20) {
				System.out.print("���γ���");
				}
			else {
				System.out.print("û�ҳⳲ��");
				}
			}
		else {
			if(age>=20) {
				System.out.print("���ο���");
																			}
			else {
				System.out.print("û�ҳ⿩��");
				}
			}
	}

}
