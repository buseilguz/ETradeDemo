package business.concretes;

import entities.concretes.User;

public class LoginManager {
public void loginManager(User user) {
	
	if(!(user.getEmail()==null)|| !(user.getPassword()==null)) {
		
		System.out.println("Kullan�c� ad� ve �ifre do�ruland�: "+ user.getName() +" "+ user.getSurname());
	}else {
		System.out.println("Kullan�c� ad� veya �ifresi hatal�! L�tfen Tekrar deneyiniz");
	}
}
}
