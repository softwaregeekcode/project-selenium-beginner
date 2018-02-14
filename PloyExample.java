package javaBeginner;

public class PloyExample extends Calculation {
	
	public void multiplication(int x, int y) {
		z=x+y;
		System.out.println("The product of the two given numbers:"+z);
	}
	
	// Overridden from Calculation
	public void addition(int x, int y) {
		z=x+y+1000;
		System.out.println("The sum of the two numbers with 1000:"+z);
	}
	
	public void substraction(int x, int y) {
		z=1000-x-y;
		System.out.println("The difference of the two numbers with 1000:"+z);
	}
	
	
	// Overloaded from Calculation
	public void addition(double x, double y) {
		double z=x+y;
		System.out.println("the sum of the two double numbers are:"+z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 20, b= 30;
		double c=20.34, d=10.27;
		
		PloyExample poly = new PloyExample();
		poly.addition(a,b);
		poly.addition(c, d);
		poly.substraction(a, b);
		poly.multiplication(a, b);
		
		Calculation cal = new Calculation();
		cal.addition(a, b);
		cal.substraction(a, b);
		
	}

}
