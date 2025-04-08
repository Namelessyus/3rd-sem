package main;
/**
 *
 * @author anush
 */
public class CreditCard implements PaymentMethod{
    public String card_no;
    public int CVV;
    
    @Override
    public void processPayment(double amount){
        if((this.card_no.equals("123234543212345")) && this.CVV==123){
            System.out.println("Payment sucessfull of :"+amount);
        }else{
            System.out.println("Payment unsucessfull");
        }
    }
}
