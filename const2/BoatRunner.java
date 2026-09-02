class BoatRunner {
	public static void main(String[] args) {

		Boat boat1 = new Boat();
		boat1.name = "Speed Boat";
		boat1.price = 500000;
		boat1.type = "Motor";

		System.out.println(boat1.name);
		System.out.println(boat1.price);
		System.out.println(boat1.type);

		Boat boat2 = new Boat();
		boat2.name = "Fishing Boat";
		boat2.price = 300000;
		boat2.type = "Fishing";

		System.out.println(boat2.name);
		System.out.println(boat2.price);
		System.out.println(boat2.type);
	}
}