package chapt03;  //chap03������ �����ϰ� �� �ȿ� APITest.class�� �����Ѵ�.

import java.io.File;
import java.util.Random;
//Ctrl+Shift+O �ڵ����� import package
//import  java.io.*;    //java.lang��Ű���� �⺻���� �ν��ϹǷ�
									 //�ٸ� ��Ű���� �����ϴ� Ŭ������ ����ϴ� ��� � ��Ű���� �ִ���
									 //�νĽ�Ű�� �۾��� �ؾ��Ѵ�.
//import java.util.*; //Random Ŭ������ �νĽ�Ű�� 
//API ����ϱ� - ������ ���� ����
public class APITest {

	public static void main(String[] args) {
		//1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿�
		//    �ø��� �۾� - JVM�� �ν��ϴ� �۾� ������ �Ҵ�
		//	����� Ŭ������ ���� = new ����� Ŭ������()
		//	-------------------------------------------------
		//	Ÿ������ ���ȴ�.
		String str = new String();   //memory�� �ø��°�
		StringBuffer sb = new  StringBuffer();
		File file = new File("text.txt");
		Random rand= new Random();
		//ArrayList list = new ArrayList();
		
		//2.   ��ü(Ŭ������ ����ϱ� ���� �޸𸮿� �÷�������)�� �޼ҵ� ����ϱ�
		//	   -> �ν��Ͻ���� ��
		//	  charAt�� ���� ����� charŸ���̹Ƿ� ���� Ÿ���� ������ �����ؼ� ����
		String str2 = new String("cactus cannavaro");
		char returnVal = str2.charAt(0);
		System.out.println("Result =>"+returnVal);
		
		
		//i love you��� ���ڿ��� �̿��ؼ� String��ü�� �����ϰ�
		//�� ���ڿ��� ���̸� ������ ���� �������� ����ϼ���
		//[�������]
		//���ڿ��� ���� => ______ 
		
		String str3 = new String("i love you");
		int size = str3.length();
		System.out.println("���ڿ��� ����=>"+size);
		
		
	}

}
