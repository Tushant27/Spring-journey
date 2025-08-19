class E
{
	private int value;
	
	public void setValue(int a)
	{
		this.value = a;
	}
	
	public int getValue()
	{
		return value;
	}
}
public class Encapsulations {

	public static void main(String[] args) {
		E e = new E();
		e.setValue(27);
		System.out.println(e.getValue());
   }
}