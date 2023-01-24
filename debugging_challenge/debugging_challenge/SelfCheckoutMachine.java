package debugging_challenge;
/*
 * 1. Find and fix any syntax errors throughout the classes
 * 2. Add missing lines of code, remove unnecessary code
 * 2. Make the classes follow OOP principles
 * 3. Make any changes to the classes and individual functions that would make them more efficient/more secure
 * 4. Comment out any line you want to remove (you'll tell us why you removed it and why it makes the function more efficient)
 */
public class SelfCheckoutMachine{
    public static int orderID = 0;
    //class attributes
    public int totalCashStored = 0;
    public ArrayList<Integer> checkoutHistory = new ArrayList<>();
    public ArrayList<Item> currentCheckout = new ArrayList<>();
    public Customer currentCustomer = new Customer("", "", 0, 0);
    //constructors
    public SelfCheckoutMachine(){}
    public SelfCheckoutMachine(SelfCheckoutMachine s){}

    public void addItemToCheckout(Item i){
        System.out.println("scanned item: " + i.itemName + ", price: " + i.itemPrice);
    }
    public boolean payWithCard(Customer c){
        double totalCheckoutPrice = 0;
        for (int i = 0; i < currentCheckout.size(); i++){
            totalCheckoutPrice += currentCheckout.get(i).itemPrice;
        }
        totalCheckoutPrice = totalCheckoutPrice * 1.14;
        if(currentCustomer.payWithCard()){
           //if payed successfully
            printReceipt();
            return true;
        }
        else{
            System.out.println("Card Declined");
            return false;
        }
    }

    //should be able to remove an item from the checkout given a barcode OR an item object
    public void removeItemFromCheckout(Item item){
        for(int i = 0; i < currentCheckout.size(); i++){
            currentCheckout.remove(i);
        }
    }
    //assume the customer always has enough cash on hand when paying with cash
    public boolean payWithCash(){
        double totalCheckoutPrice = 0;
        for (int i = 0; i < currentCheckout.size(); i++){
            totalCheckoutPrice += currentCheckout.get(i).itemPrice;
        }
        totalCheckoutPrice = totalCheckoutPrice * 1.14;
        totalCashStored += totalCheckoutPrice;
        printReceipt();
        return true;
    }
    public void printReceipt(){
        System.out.println("Items Purchased: ");
        for(int i = 0; i < currentCheckout.size(); i++){
            System.out.println(currentCheckout.get(i).itemName);
        }
        double totalCheckoutPrice = 0;
        for (int i = 0; i < currentCheckout.size(); i++){
            totalCheckoutPrice += currentCheckout.get(i).itemPrice;
        }
        System.out.println("Subtotal: " + totalCheckoutPrice);
        totalCheckoutPrice = totalCheckoutPrice * 1.14;
        System.out.println("Total: " + totalCheckoutPrice);
        System.out.println("Order ID: " + orderID);
        System.out.println(currentCustomer.cardNumber);
        System.out.println("Thank you for shopping at Carleton coding challenge");
        //currentCheckout = new ArrayList<>();  -- may or may not keep this but it is neeeded to work properly
    }
    public void cancelOrder(){
        System.out.println("Thank you for shopping at Carleton coding challenge");
    }
}

