package chapt04;

import java.util.Scanner;

public class SwitchTest0 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�");
		int num=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
		 default:
			 System.out.println("�߸��Է�");
		}
	}

}
