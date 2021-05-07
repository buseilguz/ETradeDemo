package business.concretes;

import entities.concretes.User;

public class LoginManager {
public void loginManager(User user) {
	
	if(!(user.getEmail()==null)|| !(user.getPassword()==null)) {
		
		System.out.println("Kullanýcý adý ve þifre doðrulandý: "+ user.getName() +" "+ user.getSurname());
	}else {
		System.out.println("Kullanýcý adý veya þifresi hatalý! Lütfen Tekrar deneyiniz");
	}
}
}
