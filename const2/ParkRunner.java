class ParkRunner {
	public static void main(String[] args) {

		Park park1 = new Park();
		park1.name = "Cubbon Park";
		park1.location = "Bangalore";
		park1.area = 300;

		System.out.println(park1.name);
		System.out.println(park1.location);
		System.out.println(park1.area);

		Park park2 = new Park();
		park2.name = "Lalbagh";
		park2.location = "Bangalore";
		park2.area = 240;

		System.out.println(park2.name);
		System.out.println(park2.location);
		System.out.println(park2.area);
	}
}