class L{
	int a = 111;
	void m1(){
		System.out.println("Super-L-m1 method");
	}
	static int b = 111;
 	static void m2(){
		System.out.println("Super-L-m1 method");
	}
}
class M extends{
	void call(){
		System.out.println("a: "+this.a);
		this.m1();
		System.out.println("b: "+this.b);
		this.m2();
	}
public static void main(String a[]){
	M obj = new M();
	obj.call();
	}
}