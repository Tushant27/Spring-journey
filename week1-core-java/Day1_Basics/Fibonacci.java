import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int N= sc.nextInt();
		
		int n3;
		int n1=0;
		int n2=1;
		
		for(int i=0;i<N;i++)
		{
			System.out.println(n1+ " " );
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		