class DroneRunner {
	public static void main(String[] args) {

		Drone drone1 = new Drone();
		drone1.brand = "DJI";
		drone1.price = 50000;
		drone1.type = "Camera";

		System.out.println(drone1.brand);
		System.out.println(drone1.price);
		System.out.println(drone1.type);

		Drone drone2 = new Drone();
		drone2.brand = "Autel";
		drone2.price = 60000;
		drone2.type = "Professional";

		System.out.println(drone2.brand);
		System.out.println(drone2.price);
		System.out.println(drone2.type);
	}
}