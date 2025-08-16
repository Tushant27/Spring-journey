abstract class Animal{
	
	abstract void sound(); 
	
	void dj() {
		System.out.println("dj");
	}
}

class A extends Animal{
	
	void sound()
	{
		System.out.println("Yo");
	}
}

class B extends Animal{
	
	
	void sound()
	{
		System.out.println("Lo");
	}
}

public class abstraction_1 {

	public static void main(String[] args) {
		
		Animal a = new A();
		B b = new B();
		a.sound();
		b.sound();
        b.dj();
        a.dj();
	}

}
