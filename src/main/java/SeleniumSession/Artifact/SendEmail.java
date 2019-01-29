package SeleniumSession.Artifact;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args)  throws EmailException{
		System.out.println("================");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(468);
		email.setAuthenticator(new DefaultAuthenticator("sk", "123"));
		email.setSSLOnConnect(true);
		email.setFrom("surajkolekar222r@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("surajkolekar7@gmail.com");
		email.send();
		System.out.println("++++++++Email send +++++++++++++");
		
	}

}
