class TelescopeRunner {
	public static void main(String[] args) {

		Telescope telescope1 = new Telescope();
		telescope1.brand = "Celestron";
		telescope1.price = 25000;
		telescope1.type = "Reflector";

		System.out.println(telescope1.brand);
		System.out.println(telescope1.price);
		System.out.println(telescope1.type);

		Telescope telescope2 = new Telescope();
		telescope2.brand = "Meade";
		telescope2.price = 35000;
		telescope2.type = "Refractor";

		System.out.println(telescope2.brand);
		System.out.println(telescope2.price);
		System.out.println(telescope2.type);
	}
}