class Emp{
int eid;
String ename;
}
 
class Array{
	public static void main(String args[]){
		Emp e1 = new Emp(111,"A");
		Emp e2 = new Emp(222,"B");
		Emp e3 = new Emp(333,"c");

		Emp[] e = new Emp[5];
		e[0] = e1;
		e[2] = e2;
		e[4] = e3;

	for (Objectn o : e){
		if (o instanceof Emp){
			Emp ee = (Emp)o;
			System.out.println(ee.eid+"---"+ee.ename);
		}
		if (o==null){
			System.out.println(o);
			}
		}
	}
}