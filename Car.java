class Car{
	double height;
	double weight;
	String color;
	double speed;
	public void start(){
		System.out.println(" Car Started");
	}
	public void move(){
		System.out.println("Car is moving");
		speed++;
	}
	public void stop(){
		speed=0;
		System.out.println("Car is stopped");
	}
}