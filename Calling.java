package abstraction.interfac;

public class Calling {

	public static void main(String[] args) {
		
		MetaApp m;
		m = new Facebook();
		m.login("sahil@gmail.com", "sahil@123");
		m.logout();
		System.out.println();
		
		MetaApp A;
		A = new Whattsup();
		A.login("rohan@12gmail.com", "rohan@12");
		A.logout();
		System.out.println();
		
		
		MetaApp a;
		a= new instagram();
		a.login("kunal123", "kunal@123");
		a.logout();
		System.out.println();
		
		
		PaymentApp py;
		py = new GooglePay();
		py.pay();
		GooglePay gp = new GooglePay();
		gp.checkBalence();
		System.out.println();
		
		PaymentApp pa;
		pa = new PhonePay();
		pa.pay();
		PhonePay pp = new PhonePay();
		pp.checkBalence();
		System.out.println();
		
		PaymentApp pm;
		pm = new Paytm();
		pm.pay();
		Paytm pt = new Paytm();
		pt.chechBalence();
		System.out.println();
		
		Father f;
		f = new Son();
		f.fatherInfo();
		f.age();
		System.out.println();
		
		Grandfather G;
		G = new Son();
		G.grandfatherInfo();
		G.age();
		System.out.println();
		
		Son S = new Son();
		S.sonInfo();
		System.out.println();
		
		
	}
}
