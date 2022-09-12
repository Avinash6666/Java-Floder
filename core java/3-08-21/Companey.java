class Companey{
	void display (Employee e){
		System.out.println(" e.eno\t		: "  +e.eno );
		System.out.println(" e.ename\t	: "  +e.ename);
		System.out.println(" e.sal\t		: "  +e.sal);
		System.out.println(" e.dept\t		: "  +e.dept);
	}
	 	void annSal(Employee e){
		 System.out.println(e.ename+"s annual sal is:"+(e.sal*12));
		}
			
		void increaseSal(Employee e,int perc){
			e.sal = e.sal+(e.sal*perc/100);
		}
}