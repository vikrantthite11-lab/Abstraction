package abstraction.interfac;

public class Paytm implements PaymentApp {

	@Override
	public void pay() {
		System.out.println("Payment is done through paytm");
		
	}
     public void chechBalence() {
    	 System.out.println("Remaining balence is paytm is 500");
     }
}
