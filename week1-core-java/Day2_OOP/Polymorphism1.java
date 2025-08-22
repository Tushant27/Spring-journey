public class Polymorphism {

	int age ;
	String name;
	void print()
	{
		System.out.println("Yo print");
	}
	void print (int age )
	{
		System.out.println("Yo age :"+age);
	}
	
	void print (int age,String name )
	{
		System.out.println("Yo age :"+age+ " name :" +name);
	}
	
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.age=27;
		obj.print();
		obj.print(11);
		obj.print(obj.age,"Tushant");
	}

}