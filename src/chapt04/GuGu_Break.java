package chapt04;
//continue   - 선언된 위치 아래의 코드를 skip 하기 위해 사용
public class GuGu_Break {
	public static void main(String[] args) {	
	for(int dan=2; dan<=9;dan++) {
		if(dan==5) {
			break;
		}
			for(int i = 1; i <=9; i++) {
//				if(dan==5) {                      //break문이 내부 for에 선언되어 있으므로 반복문이 종료되지는 않는다.
//					break;
//				}
				System.out.print(dan+"*"+i+"="+dan*i+"     ");	
			}
			System.out.println();
	}
	}
}
//