class SatelliteRunner {
	public static void main(String[] args) {

		Satellite satellite1 = new Satellite();
		satellite1.name = "INSAT";
		satellite1.country = "India";
		satellite1.weight = 2000;

		System.out.println(satellite1.name);
		System.out.println(satellite1.country);
		System.out.println(satellite1.weight);

		Satellite satellite2 = new Satellite();
		satellite2.name = "GSAT";
		satellite2.country = "India";
		satellite2.weight = 2500;

		System.out.println(satellite2.name);
		System.out.println(satellite2.country);
		System.out.println(satellite2.weight);
	}
}