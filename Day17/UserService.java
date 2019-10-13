package UserDetails;

public class UserService {
	public static void main(String[] args) throws Exception {

		Address address = new Address();
		address.setCity("Bang");
		address.setStreet("M.G Road");
		address.setPinCode(526488);

		Address address1 = new Address();
		address1.setCity("Mum");
		address1.setStreet("AZAD Road");
		address1.setPinCode(25455);
		


		User user=new User();
		user.setUid(1);

		user.setUserName("test data");


		user.setOfficeaddress(address);
		user.setHomeaddress(address1);

		user.setUserName("tests data");
		UserDao dao = new UserDao();
		dao.saveUser(user);

	 
		System.out.println("done");
	}

}
