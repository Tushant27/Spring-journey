class Sky
{
	void print()
	{
		System.out.println("super");
	}
}

class Fly extends Sky
{
	@Override
	
	void print()
	{
		super.print();
		System.out.println("sub");
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		Sky s = new Fly();
		s.print();
	}

}
