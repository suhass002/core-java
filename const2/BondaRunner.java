class BondaRunner {
	public static void main(String[] args) {

		Bonda bonda1 = new Bonda();
		bonda1.name = "Mangalore Bonda";
		bonda1.price = 30;
		bonda1.type = "Snack";

		System.out.println(bonda1.name);
		System.out.println(bonda1.price);
		System.out.println(bonda1.type);

		Bonda bonda2 = new Bonda();
		bonda2.name = "Potato Bonda";
		bonda2.price = 40;
		bonda2.type = "Snack";

		System.out.println(bonda2.name);
		System.out.println(bonda2.price);
		System.out.println(bonda2.type);
	}
}