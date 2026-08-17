class Flipkart {

    public static void order(String product,int quantity)
	{
System.out.println("Running order in flipkart");
if (product == "perfume"){
Vendor.getOrderFromFlipkart(product,quantity,666);
}
if (product == "chips")
{
Vendor.getOrderFromFlipkart(product,quantity,25);


}
    }
}