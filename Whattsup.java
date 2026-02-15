package abstraction.interfac;

public class Whattsup implements MetaApp{

	@Override
	public void login(String username, String password) {
		if(username == "rohan12@gmail.com" && password == "rohan@12") {
		
		System.out.println("Entered succesfully in whattsup");
		
	}
	else {
		System.out.println("Invalid credentials for whattsup");
			
		}
	}

	@Override
	public void logout() {
		System.out.println("Logout sussecfully from whattsup");
		
	}

}
