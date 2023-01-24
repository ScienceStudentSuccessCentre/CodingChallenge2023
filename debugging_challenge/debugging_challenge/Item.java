package debugging_challenge;
public class Item {
    public String itemName;
    public int itemBarcode = 0;
    public double itemPrice = 0;
    public int itemQuantity = 0;
    public Item(String name, int barcode, double price, int quantity){
        itemName = name;
        itemBarcode = barcode;
        itemPrice = price;
        itemQuantity = quantity;
    }
}
