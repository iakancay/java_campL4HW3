package java_campD4_HW3;

public class UserManager implements DatabaseService{

	@Override
	public void update(Entity entity) {
		System.out.println("User updated.");
		
	}

	@Override
	public void delete(Entity entity) {
		System.out.println("User deleted.");
		
	}
	
	UserCheckManager userCheckManager= new UserCheckManager();
	public void add(User user) {
		if(userCheckManager.checkUser(user)) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" added Db successfully.");
		}
		else {
			System.out.println("Please enter correct information.");
		}
		
	}

}
