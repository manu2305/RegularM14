package Basic;

public class Method {
int a=10;
static int b=20;
public static void main(String[] args) {
	Method m=new Method();
	System.out.println(m.a);
	System.out.println(b);
	System.out.println(Method.b);
	System.out.println(m.b);
	m.m1();
	m.m1(30);
}
public  void m1() {
	System.out.println("hi hello");
}
public  void m1(int a) {
	System.out.println("bye");
}
}
