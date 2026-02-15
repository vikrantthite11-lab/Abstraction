package abstraction.interfac;

public class PhonePay implements PaymentApp {

	@Override
	public void pay() {
		System.out.println("Payment is done through PhonePay");
		
	}
     public void checkBalence() {
    	 System.out.println("Remaining balence is phonepay is 1000");
     }
}
