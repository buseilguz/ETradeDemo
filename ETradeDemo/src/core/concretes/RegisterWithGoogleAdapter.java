package core.concretes;

import core.abstracts.JRegisterService;
import registerWithGoogle.RegisterWithGoogle;

public class RegisterWithGoogleAdapter implements JRegisterService{

	@Override
	public void registerSystem(String message) {
		RegisterWithGoogle registerWithGoogle= new RegisterWithGoogle();
		registerWithGoogle.registerWithGoogle(message);
		
	}

}
