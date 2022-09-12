class A{
	A(){
		this(123);
		System.out.println("zero arg : A");
	}
	A(int x){
		
		System.out.println("int arg : A : "+x);
	}
}

class B extends A{
	B(String x){
		System.out.println("string arg : B: "+x);
	}
	B(){
		this("avinash");
		System.out.println("zero arg : B");
	}
}
class Test2{
	public static void main(String[] s){
		B obj = new B();
	}
}
class A extends java.lang.Object{
	A(){
		this(123);
		System.out.println("zero arg : A");
	}
	A(int x){
		super();	
		System.out.println("int arg : A : "+x);
	}
}

class B extends A{
	B(String x){
		super();
		System.out.println("string arg : B: "+x);
	}
	B(){
		this("avinash");
		System.out.println("zero arg : B");
	}
}
class Test2{
	public static void main(String[] s){
		B obj = new B();
	}
}
/*int arg : A : 123
zero arg : A
string arg : B: avinash
zero arg : B
*/