package chapt04;

import java.util.Scanner;
//if~else ���� Scanner
public class IfTest02 {

	public static void main(String[] args) {
			//scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
			//90�̸��̸� "�����"�� ����ϼ���.
		
			Scanner key = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���:");
			int inputVal = key.nextInt();
			
			if(inputVal>=90) {
				System.out.println("���");
				key.close();
			}else {
				System.out.println("�����");
				key.close();
			}
			

	}

}
