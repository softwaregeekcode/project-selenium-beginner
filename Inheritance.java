package javaBeginner;

class Calculation{
	int z;
	
	public void addition(int x, int y) {
		z=x+y;
		System.out.println("The sum of the given numbers:"+z);
	}
	
	public void substraction(int x, int y) {
		z=y-x;
		System.out.println("The difference of two numbers:"+z);
	}
}

public class Inheritance extends Calculation{
	
	public void Multiplication(int x, int y) {
		z=x*y;
		System.out.println("The multiplication of two numbers:"+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		
		Inheritance inherit = new Inheritance();
		inherit.addition(a, b);
		inherit.substraction(b, a);
		inherit.Multiplication(a, b);
		
		}

}
