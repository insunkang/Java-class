package chapt05;

import java.util.Random;
import java.util.Scanner;

//������������ �迭 �����
public class ArrayTest02 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Random[] ranArr  = new Random[5];
		Scanner[] keyArr = new Scanner[100];
		
		//������ �迭������ �ʱⰪ�� null
		//null �� �ƹ��͵� ���� ���� �ʴ´ٴ� �ǹ�
		System.out.println(strArr[0]);
		System.out.println(ranArr[0]);
		System.out.println(keyArr[0]);
		
		//������ �迭�� ����, ������ �ʱ�ȭ
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("JDBC");
		arr[2] = new String("HTMLS");
		
		System.out.println(arr[1]);
	}

	
}
