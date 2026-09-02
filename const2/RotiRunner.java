class RotiRunner {
	public static void main(String[] args) {

		Roti roti1 = new Roti();
		roti1.name = "Chapati";
		roti1.price = 20;
		roti1.type = "Wheat";

		System.out.println(roti1.name);
		System.out.println(roti1.price);
		System.out.println(roti1.type);

		Roti roti2 = new Roti();
		roti2.name = "Butter Roti";
		roti2.price = 40;
		roti2.type = "Wheat";

		System.out.println(roti2.name);
		System.out.println(roti2.price);
		System.out.println(roti2.type);
	}
}