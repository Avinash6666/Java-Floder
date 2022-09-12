public class Test{
	static int a = 123;
	static int d = 345;
	       int b = 567;
	{
		System.out.println("constructor");
		}
            Test(){
		int a1 = 12;
	        int a2 = 23;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("constructor");
		}
		void n1(){
			System.out.println("n1 method");
			System.out.println("b : "+b);
			System.out.println("a : "+a);
			//System.out.println("e : "+e);
		}
	public static void main(String[] a){
		int c = 678;
		System.out.println("a :"+a);
		Test ts = new Test();
		System.out.println("b :"+ts.b);
		ts.n1();
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		System.out.println("a :"+ts.a);
	}	
}