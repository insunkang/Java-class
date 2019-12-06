package chapt04;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
		System.out.println("출력할 단:");
		Scanner key = new Scanner(System.in);
		int dan = key.nextInt();
		for(int i = 1 ; i<=9; i++) {
			System.out.print(dan+"*"+i+"=");
			System.out.println(dan*i);
		}

	}

}
//