package chapt03;

public class VariableTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println("=======기본형=======");
		if(i==j) {
			System.out.println("기본형 같다.");
		}else {
			System.out.println("기본형 다르다.");
		}
		//참조형 변수
		String str1 = new String("java");
		String str2 = new String("java");
		//str1 == str2
//		if(str1 == str2) {
//			System.out.println("참조형같다.");
//		}else {
//			System.out.println("참조형다르다.");
//		}
		//문자열 비교 - String 클래스 메소드로 처리
		if(str1.equals(str2)) { 
			System.out.println("문자열같다.");
		}else {
			System.out.println("문자열다르다.");
		}
	}

}
