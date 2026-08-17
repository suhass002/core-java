class Vendor {

    public static void getOrderFromFlipkart(String product, int quantity, double price) {

        System.out.println("Running Order From Flipkart");
        System.out.println("Product : " + product);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);

        if (quantity > 0 && quantity <= 15) {
            System.out.println("Valid Quantity");
        } 
        else {
            System.out.println("Invalid Quantity");
            return;
        }

        if (price > 0) {
            System.out.println("Valid Price");
        } 
        else {
            System.out.println("Invalid Price");
            return;
        }

        if (product =="perfume") {

            double productPrice = price + 15;
            double totalPrice = quantity * productPrice;

            System.out.println("Total Price : " + totalPrice);
        }

        if (product == "chips") {

            double productPrice = price + 5;
            double totalPrice = quantity * productPrice;

            System.out.println("Total Price : " + totalPrice);

        }
    }
}