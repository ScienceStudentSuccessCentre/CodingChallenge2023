/*
 * Assume the customer always has enough cash on them to pay for their items (if they choose to pay with cash)
 */

public class Customer {
    private String address = "";
    public String name = "";
    public double bankBalance = 0;
    public int cardNumber = 0;
    public Customer(){

    }

    public Customer(String address, String name, double bankBalance, int cardNumber){
        this.address = address;
        this.name = name;
        this.bankBalance = bankBalance;
        this.cardNumber = cardNumber;
    }

    public boolean payWithCard(double totalPrice){
        if (bankBalance - totalPrice < 0){
            return false;
        }
        else{
            bankBalance -= totalPrice;
            return true;
        }
    }

}


