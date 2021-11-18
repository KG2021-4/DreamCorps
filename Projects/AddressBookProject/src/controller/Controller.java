package controller;


import view.VisualPhoneBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.PersonList;
import model.PersonObject;

public class Controller implements ActionListener {
	
	private VisualPhoneBook v;
	private PersonList p;
	
	public Controller() {
		
		this.v = new VisualPhoneBook(this);
		this.p = new PersonList();
		
		this.v.setVisible(true);
	}


	public VisualPhoneBook getV() {
		return v;
	}

	public void setV(VisualPhoneBook v) {
		this.v = v;
	}

	public PersonList getP() {
		return p;
	}

	public void setP(PersonList p) {
		this.p = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(getV().getBtnNewButton())) {
		
		String name = getV().getTxtFirstName().getText();
		String lastname = getV().getTxtLastName().getText();
		String phone = getV().getTxtPhoneNumber().getText();
		
		getP().addPerson(new PersonObject(name,lastname,phone));
		
		System.out.print(getP());
	}
		
	}




	
}
