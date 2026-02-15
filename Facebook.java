package abstraction.interfac;

public class Facebook implements MetaApp {

	@Override
	public void login(String username, String password) {
		
		if(username == "sahil@gmail.com" && password == "sahil@123") {
		System.out.println("Intered succesfully in facebook");
		
	}
	else {
		System.out.println("Invalid credentials");
	}
	}

	@Override
	public void logout() {
	  System.out.println("Logout succesfully done.. from Facebook");
		
	}

	
}
