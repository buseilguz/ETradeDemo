package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.RegisterService;
import business.abstracts.RuleService;
import business.abstracts.UserService;
import core.abstracts.JRegisterService;

import entities.concretes.User;


public class UserManager implements UserService {
	
	private RuleService ruleService;
	private RegisterService registerService;
	private JRegisterService jregisterService;

	public UserManager(RuleService ruleService, RegisterService registerService, JRegisterService jregisterService) {
		super();
		this.ruleService = ruleService;
		this.registerService = registerService;
		this.jregisterService = jregisterService;
	}



	public UserManager(RuleService ruleService, RegisterService registerService) {
		super();
		this.ruleService = ruleService;
		this.registerService = registerService;
	}

	

	@Override
	public void add(User user) {
		
		List<User> users=new ArrayList<User>();
		
		
		if(ruleService.emailIsOnlyOne(users, user)==true && ruleService.emailIsCorrect(user)==true && ruleService.mustBeEverything(user)==true && ruleService.minimumCharacter(user)==true && ruleService.passwordIsValid(user)==true ) {
			System.out.println("Bilgileri girilen kullan�c� sisteme eklendi");
			registerService.sendEmail(user);
			registerService.clickRegisterLink(user);
			
		}
		else {
			System.out.println("�zg�n�z! Girilen bilgiler hatal�. L�tfen tekrar deneyiniz");
			
		}
	}
	public void addWithGoogle(User user) {
		if(ruleService.emailIsCorrect(user)==true)
		{
		jregisterService.registerSystem(user.getEmail()+"Kullan�c� kayd� ba�ar�l� olmu�tur.L�tfen do�rulama postas� i�in gelen kutunuza bak�n�z.");
		registerService.sendEmail(user);
		registerService.clickRegisterLink(user);
		}
		else {
			System.out.println("Girdi�iniz Google hesab� hatal�d�r.L�tfen kontrol ediniz");
		}
	}
	
	
	

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
