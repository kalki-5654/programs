class Employeetest{
	public static void main(String[] args) {
		

        Employee emp1=new Employee();
		Employee emp2=new Employee(5654,"gowtham",60000,'M');
		Employee emp3=new Employee();
		
		emp3.id=123456;
		emp3.name="kalki";
		emp3.salary=85000;
		emp3.gender='M';

		String[] tasklist={"Work","eat","sleep"};
		emp1.tasklist=tasklist;
		emp2.tasklist=tasklist;
		emp3.tasklist=tasklist;
		
		System.out.println(" TASK LIST OF EMPLOYEE");
		emp3.displaytask();
		emp3.printdetails();
		System.out.println( " The raised salary is" + Employee.risesalary(emp3,20));
		emp3.car=new Car();
		emp3.car.height=100;
		emp3.car.weight=300;
		emp3.car.color="Black";
		System.out.println(" kalki's Car Details ");
		System.out.println(emp3.car.height);
		System.out.println(emp3.car.weight);
		System.out.println(emp3.car.color);
		emp3.dosomething();
		System.out.println("__________________________");

		System.out.println("Task list of employee");
        emp2.displaytask();
		emp2.printdetails();
		System.out.println( " The raised salary is" + Employee.risesalary(emp2,20));
		emp2.car= new Car();
		emp2.car.height=150;
		emp2.car.weight=400;
		emp2.car.color="Red";
		System.out.println(" Gowtham's Car Details ");
		System.out.println(emp2.car.height);
		System.out.println(emp2.car.weight);
		System.out.println(emp2.car.color);
		emp2.dosomething();
		System.out.println("_______________________");

        emp1.printdetails();
		
		

	}
}