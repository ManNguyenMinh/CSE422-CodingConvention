package M.chat;

import java.util.*;

public abstract class Group {
	private List<User> listOfUsers;
	
	public Group(List<User> listOfUsers) {
		super();
		this.listOfUsers = listOfUsers;
	}
	
	public Group() {
		
	}

	public List<User> getListOfUsers() {
		return listOfUsers;
	}

	public void setListOfUsers(List<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
}
