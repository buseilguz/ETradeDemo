package business.concretes;

import business.abstracts.RegisterService;
import entities.concretes.User;

public class SendEmail implements RegisterService {
	
	public void sendEmail(User user) {
		
		System.out.println("Do�rulama e-maili "+user.getEmail()+" adresine g�nderilmi�tir.L�tfen posta kutunuzu kontrol ediniz ve do�rulama linkini t�klay�n�z ");
		
		
	}
	public void clickRegisterLink(User user) {
		System.out.println(user.getName()+" isimli kullan�c�n�n hesab� do�rulanm��t�r.");
	}

}
