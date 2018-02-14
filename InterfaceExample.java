interface A
{
    int x=10;
	public void method1(int a, int b);
}
interface B
{
    int x=100;
	public void method2(int a, int b);
}
class InterfaceExample implements A,B
{
    public static void main(String args[]) 
    {
	
	InterfaceExample inter = new InterfaceExample();
       // reference to x is ambiguous both variables are x
       //System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
	   inter.method1(A.x, B.x);
	   inter.method2(A.x, B.x);
    }
	public void method1(int a, int b)
	{
		System.out.println(b-a);
	}
	public void method2(int a, int b)
	{
	 System.out.println(a+b);
	}
}