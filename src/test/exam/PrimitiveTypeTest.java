package test.exam;
//�ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean ��
		boolean bool = true; 
		System.out.println(bool);
		//������
		char c = 'a'; //charŸ�� ������ ���ͷ��� ǥ���Ҵ� ''�� ǥ��
		System.out.println(c);
		//����������
		//������������ �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127;
		System.out.println(b);

		short s = 32767; //short = int
		System.out.println(s);
		
		int i = 21474837; //int = int
		System.out.println(i);
		
		long l = 213647;
		System.out.println(l);

		float f = 10.F; //float = double
						//float Ÿ���� ��� ���̻糪 F�� f�� �߰��Ѵ�
		System.out.println(f);

		double d = 10.5;
		System.out.println(d);
		
		double exam = 10/3;
		System.out.println(exam);
	}
}

