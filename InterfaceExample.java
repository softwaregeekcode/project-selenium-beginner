package javaBeginner;

interface A{
	int x=10;
	public void method1(int a, int b);
}

interface B{
	int x=100;
	public void method2(int a, int b);
}

public class InterfaceExample implements A, B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceExample inter = new InterfaceExample();
		System.out.println(A.x);
		System.out.println(B.x);
		inter.method1(A.x, B.x);
		inter.method2(A.x, B.x);	
	}
	

	public void method1(int a, int b) {
		System.out.println("The sum of two numbers:"+(a+b));
	}
	
	public void method2(int a, int b) {
		System.out.println("The substraction of two numbers:"+(B.x-A.x));
	}

}
