package chapt04;

import java.util.Random;
//if���� Random test
public class IfTest01 {

	public static void main(String[] args) {
		//Random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų�� �۾�	
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
//		int num = 90 ;
			if(num >=90) {
					System.out.println("����");
					System.out.println("�� ��° ����");
			
			}
			System.out.println("����");
	}

}
