package Programs;

public class Fibonacciseriesupto100 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
	int c=a+b;
	System.out.println(a);
	System.out.println(b);
	while(c<=100){
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
	}

}
}
