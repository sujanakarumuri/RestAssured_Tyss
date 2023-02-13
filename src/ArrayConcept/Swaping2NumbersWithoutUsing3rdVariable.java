package ArrayConcept;

public class Swaping2NumbersWithoutUsing3rdVariable {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		
		System.out.println("before swaping ==> A value is="+a +" b value is= "+b);
		a=a+b;// a=30
		b=a-b;//b=30-10=20
		a=a-b;// a=30-20=10
		System.out.println("After swap ==> A value is ="+a+" b value is ="+b);

	}

}
