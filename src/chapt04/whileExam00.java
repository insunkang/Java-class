package chapt04;

public class whileExam00 {

	public static void main(String[] args) {
		int a= 0;
		int b= 0;
		int c =0;
		int i = 1;
		while(i<=100) {
			 a = a+i;
			if(i%2==0) {
				b = b+i;
			}else{
				c=c+i;
			}
		i++;}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
