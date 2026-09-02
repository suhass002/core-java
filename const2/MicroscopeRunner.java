class MicroscopeRunner {
	public static void main(String[] args) {

		Microscope microscope1 = new Microscope();

		microscope1.brand = "Gopro";
		microscope1.price = 5600;
		microscope1.type = "Digital";
		microscope1.magnificance = 1000;

		System.out.println(microscope1.brand);
		System.out.println(microscope1.price);
		System.out.println(microscope1.type);
		System.out.println(microscope1.magnificance);

		Microscope microscope2 = new Microscope();

		microscope2.brand = "Leica";
		microscope2.price = 35000;
		microscope2.type = "Compound";
		microscope2.magnificance = 800;

		System.out.println(microscope2.brand);
		System.out.println(microscope2.price);
		System.out.println(microscope2.type);
		System.out.println(microscope2.magnificance);
	}
}