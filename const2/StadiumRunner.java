class StadiumRunner {
	public static void main(String[] args) {

		Stadium stadium1 = new Stadium();
		stadium1.name = "M Chinnaswamy Stadium";
		stadium1.location = "Bangalore";
		stadium1.capacity = 40000;

		System.out.println(stadium1.name);
		System.out.println(stadium1.location);
		System.out.println(stadium1.capacity);

		Stadium stadium2 = new Stadium();
		stadium2.name = "Wankhede Stadium";
		stadium2.location = "Mumbai";
		stadium2.capacity = 33000;

		System.out.println(stadium2.name);
		System.out.println(stadium2.location);
		System.out.println(stadium2.capacity);
	}
}