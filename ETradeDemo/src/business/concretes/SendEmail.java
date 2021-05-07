package business.concretes;

import business.abstracts.RegisterService;
import entities.concretes.User;

public class SendEmail implements RegisterService {
	
	public void sendEmail(User user) {
		
		System.out.println("Doðrulama e-maili "+user.getEmail()+" adresine gönderilmiþtir.Lütfen posta kutunuzu kontrol ediniz ve doðrulama linkini týklayýnýz ");
		
		
	}
	public void clickRegisterLink(User user) {
		System.out.println(user.getName()+" isimli kullanýcýnýn hesabý doðrulanmýþtýr.");
	}

}
