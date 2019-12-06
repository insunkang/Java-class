package test.exam;
public class TypeCastingTest{
	public static void main(String[] args){
		//기본형에서 형변환
		//-자동형변환(큰 데이터타입의 변수 = 작은 데이터 타ㅂ입 변수)
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(f);

		char c = 'A';
		System.out.println(c);
		//A의 ascii값을 사용하고 싶은 경우
		int data = c;
		System.out.println(data);
		
		//명시적 형변환
		//기본형에서 명시적 형변환
		byte bytedata= (byte)200;
		System.out.println(bytedata);

		int intdata = 111;
		//int data를 character로 변환하는 경우
		char chardata = (char)intdata;
		System.out.println(chardata);
		//115를 char로 명시적 캐스팅
		System.out.println((char)115);

		double doubledata = (double)20/100*100;
		System.out.println(doubledata);
	}
}
