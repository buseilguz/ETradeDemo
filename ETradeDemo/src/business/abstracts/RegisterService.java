package business.abstracts;

import entities.concretes.User;

public interface RegisterService {
	public void sendEmail(User user);
	public void clickRegisterLink(User user);
}
