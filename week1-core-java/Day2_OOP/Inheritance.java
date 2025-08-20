class A1
{
	int a=8,b=2;
	void add()
	{
	
		System.out.println("add" + (a+b));
	}
}

class A2 extends A1
{
	void sub ()
	{
		int a=4,b=2;
		
		System.out.println("sub" + (a-b));
	}
}

class A3 extends A2
{
	void div()
	{
		int a=10,b=2;
		
		System.out.println("div" + (a%b));
	}
}


public class Inheri {
	
	public static void main(String args[])
	{
		A3 a = new A3();
		a.div();
		a.sub();
		a.add();
	
	}
	
}