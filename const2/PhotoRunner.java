class PhotoRunner {
	public static void main(String[] args) {

		Photo photo1 = new Photo();
		photo1.name = "Nature";
		photo1.type = "Landscape";
		photo1.size = 500;

		System.out.println(photo1.name);
		System.out.println(photo1.type);
		System.out.println(photo1.size);

		Photo photo2 = new Photo();
		photo2.name = "Family";
		photo2.type = "Portrait";
		photo2.size = 800;

		System.out.println(photo2.name);
		System.out.println(photo2.type);
		System.out.println(photo2.size);
	}
}