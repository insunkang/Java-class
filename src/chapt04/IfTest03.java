package chapt04;

import java.util.Scanner;
//��øif�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {

	public static void main(String[] args) {
			//scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
			//90�̸��̸� "�����"�� ����ϼ���.
		
			Scanner key = new Scanner(System.in);
			System.out.print("��������:");
			int point = key.nextInt();
			
			System.out.print("����Ƚ��:");
			int count = key.nextInt();
			if( point >=90) {
				System.out.println("���");
			}else {
					if(count>=3) {
						System.out.println("ó������ �ٽ� ����...");
					}else {
						System.out.println("�� ���� �����...");
					}
			}
			

	}

}