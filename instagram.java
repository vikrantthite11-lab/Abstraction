package abstraction.interfac;

public class instagram implements MetaApp {

	@Override
	public void login(String username, String password) {
		if(username == "kunal123" && password == "kunal@123") {
			System.out.println("Intered is succesfully instagram");
		}
		else {
			System.out.println("Invalid creadited..");
			
		}
		
	}

	@Override
	public void logout() {
		System.out.println("Logout done is .. from instagram");
		
	}

	
}
