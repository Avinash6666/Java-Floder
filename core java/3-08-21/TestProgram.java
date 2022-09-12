class TestProgram{
	public static void main(String[] args){
		Employee e1 = new Employee();
			e1.eno = 107;
			e1.ename = "AK";
			e1.sal = 2500;
			e1.dept = "cj";
			
	
	System.out.println("Employee object is created and intialized with AV value");
	
		Companey c1 = new Companey();
		System.out.println("e1 object values");
		c1.display(e1);
		c1.annSal(e1);
		
		System.out.println(e1.ename+"s old monthly sal:"+ e1.sal);
		c1.increaseSal(e1,20);
		System.out.println(e1.ename+"s updated monthly sal:"+ e1.sal);

	}

}