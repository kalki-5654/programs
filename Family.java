class Family{
	public static void main(String[] args) {
		Husband husband=new Husband();
		Wife wife=new Wife();
		wife.name="Sonia Gandhi";

		Kids[] kids=new Kids[2];
		kids[0]=new Kids();
		kids[1]=new Kids();

		Bicycle bicycle=new Bicycle();
		bicycle.model="Atlas";

		Barbie barbie=new Barbie();
		barbie.color="pink";

		kids[0].name="Rahul Gandhi";
	    kids[0].bicycle=bicycle;

	    kids[1].name="Priyanka Gandhi";
	    kids[1].bicycle=bicycle;
	    kids[1].barbie=barbie;
	   
	    husband.name="Rajeev Gandhi";
	    husband.wife=wife;
	    husband.kids=kids;
	    System.out.println(husband.name +" is the husband of "+wife.name);
	    System.out.println("They have" +husband.kids.length+" kids");
	    System.out.println(husband.kids[0].name);
	    System.out.println(husband.kids[1].name);
	    System.out.println("the kid "+husband.kids[0].name+" has got:");
	    System.out.println( " Bicycle "+husband.kids[0].bicycle.model);
	    System.out.println(" Barbie doll "+husband.kids[0].barbie);
	    System.out.println(" the kid "+husband.kids[1].name+" has got");
	    System.out.println(" Bicycle "+husband.kids[1].bicycle.model);
	    System.out.println("Barbie doll "+husband.kids[1].barbie.color+ " color toy");



	}
}