package Basic;

public class Calculator implements Calci  {
	//int a=10;
	//int b=20;
public void add() {
	System.out.println(a+b);
}
public void sub() {
	System.out.println(a-b);
}
public static void main(String[]args){
	Calci c=new Calculator();
	c.add();
	
	} 
}

