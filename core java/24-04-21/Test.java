class A{
	A(){
	this(true);
	System.out.println("Zero arg:A");
	}
	A(int x){
		super();
		System.out.println("int arg: A :"+x);
		}
	A(boolean b){
		this(111);
	System.out.println("boolean: A :"+b);
	}
}
class B extends A{
	B (String x){
	super();
	System.out.println("String arg : B :"+x);
	}
	B(){
		this("avnash");
		System.out.println("zero arg:B");
	}
}
class Test{
public static void main(String a[]){
	B obj = new B();
	}
}

/*output:
int arg: A :111
boolean: A :true
Zero arg:A
String arg : B :avnash
zero arg:B*/