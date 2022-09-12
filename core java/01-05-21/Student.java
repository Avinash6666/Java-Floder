public class Student{
 		int sid;
		String sname;

		void stdInfo(){
			
			System.out.println("sid :"+ this.sid);
			System.out.println("sname :"+ this.sname);

			Scanner scanner = new Scanner()

			System.out.println("Enter Student id");
			this.id = scan.nextInt();

			System.out.println("Enter Student Name");
			this.name = scan.next();
		}
	public static void main(String s[]){
		Student s1 = new Student();
		System.out.println("sid\t :"+s1.hashCode()+"\t"+ s1.sid);
		System.out.println("sname\t :"+ s1.hashCode()+"\t"+s1.sname);
		s1.stdInfo();
	}
}
