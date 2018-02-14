package javaBeginner;

interface addition {
	int a=20;
	public void addition(int x, int y, int z);
	
}

interface substraction{
	int b=40;
	public void substraction(int x, int y, int z);
}

interface multiplication {
	int c=60;
	public void multiplication(int x, int y, int z);
}

public class MultipleInheritanceUsingInterfaces implements addition, substraction, multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		System.out.println("the value of A:"+a);
		System.out.println("the value of B:"+b);
		System.out.println("the value of C:"+c);
		
		MultipleInheritanceUsingInterfaces multi = new MultipleInheritanceUsingInterfaces();
		multi.addition(a, b, c);
		multi.substraction(a, b, c);
		multi.multiplication(a, b, c);

	}

	@Override
	public void multiplication(int x, int y, int z) {
		// TODO Auto-generated method stub
		int d=a*b*c;
		System.out.println("The multiplication of three numbers are:"+d);
		
	}

	@Override
	public void substraction(int x, int y, int z) {
		// TODO Auto-generated method stub
		int d=c-b-a;
		System.out.println("The Substraction of three numbers are:"+d);
		
	}

	@Override
	public void addition(int x, int y, int z) {
		// TODO Auto-generated method stub
		int d=a+b+c;
		System.out.println("The addition of three numbers are:"+d);		
		
	}

	
}
