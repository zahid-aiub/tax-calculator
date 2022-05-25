import com.zahid.tax.cart.Helper;
import com.zahid.tax.tax.Payment;

public class TaxCalculatorApplication {

    public static void main(String[] args) {

        System.out.println("::::::::::::::::: Tax Calculator Application Started :::::::::::::::::");
        Helper helper = new Helper();
        helper.start();
//        Payment payment = new Payment();
//        payment.generateBillsForAllItemsInCart();
        System.out.println("::::::::::::::::: Tax Calculator Application Stopped :::::::::::::::::");

    }
}
