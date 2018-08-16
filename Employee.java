 class Employee{
	int id;
	char gender;
	String name;
	double salary;
	Car car;
	String[] tasklist;

	Employee(int id,String name,double salary,char gender){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.gender=gender;
		}

	Employee(){
		id=-1;
		name="not specified";
		salary=-1;
		gender='x';
		}
		
		 void dosomething(){
		System.out.println(name+"is doing something in his "+ car.color+" color car");
	}
	
	void printdetails(){
		System.out.println(id);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(salary);
		//System.out.println(car);  
	}
	
	void displaytask(){
		for(String task:tasklist){
			System.out.println(task);
		}
	}
	
	public static double risesalary(Employee emp,int percentage){
		emp.salary=emp.salary + (emp.salary/100) * percentage;
		return emp.salary;
	}
}
