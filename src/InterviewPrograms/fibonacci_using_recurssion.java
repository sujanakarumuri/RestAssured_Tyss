package InterviewPrograms;

public class fibonacci_using_recurssion {

	public static void main(String[] args) {

		int f1=0;
		int f2=1;		
		int f3=0;
		System.out.println(f1);
		System.out.println(f2);
		int a=0;
		while(a<5){    
		f3=fib(f1,f2);
		System.out.println(f3);
		f1=f2;
		f2=f3;
		a++;
	}
	}
		public static int fib(int f1,int f2){
			
		int f3=f1+f2;	
		
		return f3;
		
		}

}
