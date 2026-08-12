class PowerBank
{
    public static void main(String[] args)
    {
        String brand = "Mi";
        String model = "Power Bank 3i";
        String color = "Black";
        int capacity = 20000;
        String batteryType = "Lithium Polymer";
        int outputPower = 18;
        int inputPower = 18;
        int price = 1999;
        double weight = 0.43;
        boolean fastCharging = true;

        System.out.println("Brand          : " + brand);
        System.out.println("Model          : " + model);
        System.out.println("Color          : " + color);
        System.out.println("Capacity       : " + capacity + " mAh");
        System.out.println("Battery Type   : " + batteryType);
        System.out.println("Output Power   : " + outputPower + " W");
        System.out.println("Input Power    : " + inputPower + " W");
        System.out.println("Price          : " + price);
        System.out.println("Weight         : " + weight + " kg");
        System.out.println("Fast Charging  : " + fastCharging);
    }
}