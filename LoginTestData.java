package week3day2;

public class LoginTestData extends TestData
     {

	public void enterUsername(String username) {
		System.out.println("Enter the Username -----> sub class");
		System.out.println("Username is:" + " "+ username);
	}
	
       public void enterPassword(String password) {
			System.out.println("Enter the Password -----> sub class");
			System.out.println("Password is:" + " "+ password);
		}
	
	public static void main(String[] args) {
		
		LoginTestData L = new LoginTestData();
		L.enterCredentials();
		L.enterUsername("Andrew_martin");
		L.enterPassword("Password@2025");
		
	}

}
