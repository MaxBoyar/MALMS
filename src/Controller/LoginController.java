package Controller;
import Model.LoginModel;
import View.Login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener{
	LoginModel model;
	Login view;//Login (view) class
	
	//Constractor gets login object(view == login object)
	public LoginController(Login view) {
		this.model = new LoginModel();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent caller) {
		
		
		switch(caller.getActionCommand())
				{
				case("Login"):
					model.LoginFunc(view);
					break;
				}
	}

	
	
	
}
