package com.TKA.OnlineEducationService.OnlineEducationService.Controller;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TKA.OnlineEducationService.OnlineEducationService.Model.Contact;
import com.TKA.OnlineEducationService.OnlineEducationService.Model.Login;

@Controller
public class LoginController {

	@Autowired
	SessionFactory sf;

	@RequestMapping("login")
	public String loginPage() {
		return "login";
	}
	@RequestMapping("validlogin")
	public String validlogin(Login login) throws IOException {
		Session s = sf.openSession();
		Login dblogin = s.get(Login.class, login.getUsername());
		String page = "error";
		if (dblogin != null && dblogin.getPassword().equals(login.getPassword())) {
			if (dblogin.equals(dblogin)) {
				page = "homepage";
			}
		}
		return page;
	}

	@RequestMapping("createaccount")
	public String registerPage() {
		return "createaccount";
	}// show

	@RequestMapping("createaccountdata")
	public String createaccountdata(Login login) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(login);
		t.commit();
		return "login";
	}// save data

	@RequestMapping("homepage")
	public String homePage() {
		return "homepage";
	}

	@RequestMapping("about")
	public String aboutPage() {
		return "about";
	}

	@RequestMapping("servicepage")
	public String servicePage() {
		return "servicepage";
	}

	@RequestMapping("contactpage")
	public String contactPage() {
		return "contactpage";
	}// show

	@RequestMapping("contactdata")
	public String contactdata(Contact contact) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(contact);
		t.commit();
		return "contactpage";
	}// save data

	@RequestMapping("logout")
	public String logout() {
		return "logout";
	}
}
