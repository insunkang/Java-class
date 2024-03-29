package chapt03;  //chap03폴더를 생성하고 이 안에 APITest.class를 저장한다.

import java.io.File;
import java.util.Random;
//Ctrl+Shift+O 자동으로 import package
//import  java.io.*;    //java.lang패키지만 기본으로 인식하므로
									 //다른 패키지의 존재하는 클래스를 사용하는 경우 어떤 패키지에 있는지
									 //인식시키는 작업을 해야한다.
//import java.util.*; //Random 클래스만 인식시키기 
//API 사용하기 - 참조형 변수 선언
public class APITest {

	public static void main(String[] args) {
		//1. API에서 제공하는 클래스를 자바 프로그램 안에서 사용하기 위해 메모리에
		//    올리는 작업 - JVM이 인식하는 작업 공간에 할당
		//	사용할 클래스명 변수 = new 사용할 클래스명()
		//	-------------------------------------------------
		//	타입으로 사용된다.
		String str = new String();   //memory에 올리는것
		StringBuffer sb = new  StringBuffer();
		File file = new File("text.txt");
		Random rand= new Random();
		//ArrayList list = new ArrayList();
		
		//2.   객체(클래스를 사용하기 위해 메모리에 올려놓은것)의 메소드 사용하기
		//	   -> 인스턴스라고도 함
		//	  charAt의 실행 결과가 char타입이므로 같은 타임의 변수를 선언해서 저장
		String str2 = new String("cactus cannavaro");
		char returnVal = str2.charAt(0);
		System.out.println("Result =>"+returnVal);
		
		
		//i love you라는 문자열을 이용해서 String객체를 생성하고
		//이 문자열의 길이를 다음과 같은 형식으로 출력하세요
		//[출력형태]
		//문자열의 길이 => ______ 
		
		String str3 = new String("i love you");
		int size = str3.length();
		System.out.println("문자열의 길이=>"+size);
		
		
	}

}
