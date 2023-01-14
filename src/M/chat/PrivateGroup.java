package M.chat;

import java.util.List;

public class PrivateGroup extends Group {

	private String admin;

	public PrivateGroup(List<User> listOfUsers) {
		super(listOfUsers);
	}

	public PrivateGroup() {
		
	}
	
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	@Override
	public List<User> getListOfUsers() {
		return super.getListOfUsers();
	}

	@Override
	public void setListOfUsers(List<User> listOfUsers) {
		super.setListOfUsers(listOfUsers);
	}
}
