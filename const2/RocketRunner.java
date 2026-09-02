class RocketRunner {
	public static void main(String[] args) {

		Rocket rocket1 = new Rocket();
		rocket1.name = "PSLV";
		rocket1.country = "India";
		rocket1.height = 44;

		System.out.println(rocket1.name);
		System.out.println(rocket1.country);
		System.out.println(rocket1.height);

		Rocket rocket2 = new Rocket();
		rocket2.name = "GSLV";
		rocket2.country = "India";
		rocket2.height = 50;

		System.out.println(rocket2.name);
		System.out.println(rocket2.country);
		System.out.println(rocket2.height);
	}
}