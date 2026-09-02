class MuttonRunner {
	public static void main(String[] args) {

		Mutton mutton1 = new Mutton();
		mutton1.type = "Goat";
		mutton1.price = 700;
		mutton1.quantity = 1;

		System.out.println(mutton1.type);
		System.out.println(mutton1.price);
		System.out.println(mutton1.quantity);

		Mutton mutton2 = new Mutton();
		mutton2.type = "Lamb";
		mutton2.price = 800;
		mutton2.quantity = 1;

		System.out.println(mutton2.type);
		System.out.println(mutton2.price);
		System.out.println(mutton2.quantity);
	}
}