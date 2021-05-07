package business.abstracts;



import java.util.List;

import entities.concretes.User;

public interface RuleService {
	public boolean  mustBeEverything(User user);
	public boolean passwordIsValid(User user);
	public boolean minimumCharacter(User user);
	public boolean emailIsCorrect(User user) ;
	public boolean emailIsOnlyOne(List<User> users,User user);
	
	
	
}
