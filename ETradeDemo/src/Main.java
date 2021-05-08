


import business.abstracts.UserService;
import business.concretes.LoginManager;
import business.concretes.SendEmail;
import business.concretes.UserManager;
import business.rules.RuleManager;

import core.concretes.RegisterWithGoogleAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.setUserId(1);
		user1.setName("Deniz");
		user1.setSurname("Ata");
		user1.setEmail("denizata@gmail.com");
		user1.setPassword("123456");
		
		
		
		User user2 =new User();
		user2.setUserId(2);
		user2.setName("Buse");
		user2.setSurname("Ýlgüz");
		user2.setEmail("buse.ilguz@gmail.com");
		user2.setPassword("1234567");
		
		
		UserService userService=new UserManager(new HibernateUserDao(),new RuleManager(), new SendEmail(), new RegisterWithGoogleAdapter());
		LoginManager loginManager =new LoginManager();
		
	
		userService.add(user1);
		
		userService.addWithGoogle(user2);
		
		loginManager.loginManager(user2);
		
		
		

	}

}
