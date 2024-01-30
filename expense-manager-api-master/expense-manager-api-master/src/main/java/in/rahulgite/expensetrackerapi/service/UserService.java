package in.rahulgite.expensetrackerapi.service;

import in.rahulgite.expensetrackerapi.entity.User;
import in.rahulgite.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}
