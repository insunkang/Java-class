package chapt04;

public class ForExam03 {

	public static void main(String[] args) {
		int a= 0 ;
		int b=  0;
		int c= 0;
		
		for (int i  = 1; i<=100; i++) {
			a= a+i;
			if(i%2==0) {
				b=b+i;
			}else {
				c=c+i;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
//