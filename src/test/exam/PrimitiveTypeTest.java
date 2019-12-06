package test.exam;
//자바 기본형 데이터의 리터럴에 대해서 살펴보는 예제
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean 형
		boolean bool = true; 
		System.out.println(bool);
		//문자형
		char c = 'a'; //char타입 변수는 리터럴을 표현할대 ''로 표현
		System.out.println(c);
		//정수형변수
		//정수형변수에 기본으로 할당되는 리터럴의 타입은 int
		byte b = 127;
		System.out.println(b);

		short s = 32767; //short = int
		System.out.println(s);
		
		int i = 21474837; //int = int
		System.out.println(i);
		
		long l = 213647;
		System.out.println(l);

		float f = 10.F; //float = double
						//float 타입인 경우 접미사나 F나 f를 추가한다
		System.out.println(f);

		double d = 10.5;
		System.out.println(d);
		
		double exam = 10/3;
		System.out.println(exam);
	}
}

