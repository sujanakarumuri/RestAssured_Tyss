package ArrayConcept;

public class Ass1Prog2swapping2NumbersWithout3rdVariable {

	public static void main(String[] args) {
		int a=20, b=10;
		System.out.println("Before sorting a= "+a+" b= "+b);
		if(a!=b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println("After sorting a= "+a+" b= "+b);
		

	}

}
