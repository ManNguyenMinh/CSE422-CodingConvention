package M.chat;

import java.util.List;

public class PublicGroup extends Group {

	public PublicGroup() {
		super();
	}

	public PublicGroup(List<User> listOfUsers) {
		super(listOfUsers);
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
