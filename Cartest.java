class Cartest{
	public static void main(String[] args) {
		Car ford=new Car();//instance of class car is created
		ford.height=10;
		ford.weight=200;
		ford.color="red";
		System.out.println(ford.height);
		System.out.println(ford.weight);
		System.out.println(ford.color);
		System.out.println(ford.speed);
		System.out.println("_______________");
		Car audi=new Car();
		audi.height=18;
		audi.weight=300;
		audi.color="Black";
		System.out.println(audi.height);
		System.out.println(audi.weight);
		System.out.println(audi.color);
		System.out.println(audi.speed);
		System.out.println("__________________");
		ford.start();
		audi.start();


	}
}