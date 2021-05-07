package business.rules;


import java.util.List;

import business.abstracts.RuleService;
import entities.concretes.User;

public class RuleManager implements RuleService{
public boolean  mustBeEverything(User user){

	
		
		boolean result=true;
		
		if(user.getEmail()==null || user.getPassword()==null || user.getName()==null || user.getSurname()==null) {

			System.out.println("Kullan�c� bilgileri zorunludur!!! L�tfen t�m alanlar� eksiksiz doldurunuz!!!");
			result=false;
			
			}return result;
	}

public boolean passwordIsValid(User user) {
	if(user.getPassword().length()<6) {
		System.out.println(user.getName()+",  �zg�n�z! Parolan�z ge�ersiz!");
		return false;
	} else return true;
			
	}

	public boolean minimumCharacter(User user) {
		

		if(user.getName().length() < 2 || user.getSurname().length()<=2) {

			System.out.println("Kullan�c� ad� ve parola minimum 2 harften olu�mal�d�r!!! �u an girmi� oldu�unuz isim: " + user.getName() + " soyisim: " + user.getSurname());
			return false;
			
			}else return true;
		
	}
	
	public  boolean emailValidate(User user) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(user.getEmail());
        return m.matches();
       
 }
	
	public boolean emailIsCorrect(User user) {
	 if(emailValidate(user)==false) {

			System.out.println("L�tfen ge�erli bir email adresi giriniz!!! �u anki girmi� oldu�unuz mail adresi: " + user.getEmail());
			return false;
			
	 }
	 else return true;}
	
	
	public boolean emailIsOnlyOne(List<User> users,User user) {
		boolean result=true;
		for(User userx:users) {
			if(user.getEmail()==userx.getEmail()) {
				System.out.println("Girilen e-mail ba�ka bir kullan�c�ya aittir");
				result=false;
				
			}
		}
		
		return result;
		
	}
	
		
	}

