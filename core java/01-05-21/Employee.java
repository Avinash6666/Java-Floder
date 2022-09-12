public class Employee{

	int eid;
	String ename;

	public Employee(int id,String name){
		eid = id;
 		ename = name;
}
	public static void main(String a[]){
		Employee e1 = new Employee(666"Avi");
		System.out.println("eid\t:"+ eid);
		System.out.println("ename \t:"+ ename);
		}
	}