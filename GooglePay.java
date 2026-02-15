package abstraction.interfac;

public class GooglePay implements PaymentApp {

	@Override
	public void pay() {
		System.out.println("Payment is done throgh googlepay");
		
	}
    public void checkBalence() {
    	System.out.println("Reamining balence is googlepay is 700");
    }
}
