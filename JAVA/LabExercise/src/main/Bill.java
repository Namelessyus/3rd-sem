package main;

public class Bill {
    //attributes
    public double discount_amount;
    public double vat_amount;
    public double grand_total;
    
    //method
    public double calculateBill(double price){
        this.discount_amount = price * 0.05;
        this.vat_amount = price * 0.13;
        this.grand_total = price - this.discount_amount + this.vat_amount;
        return this.grand_total;
    }
    
}
