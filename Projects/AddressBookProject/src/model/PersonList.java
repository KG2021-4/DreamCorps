package model;

import java.util.ArrayList;

public class PersonList {

	private ArrayList<PersonObject> listOfPeople = new ArrayList<PersonObject>();

	public Boolean addPerson(PersonObject possiblePerson) {
		return getListOfPeople().add(possiblePerson);
	}

	public String toString() {

		String title = String.format("%-20s %-20s %-20s\n", "First_Name", "Last_Name", "phoneNumber");

		for (int index = 0; index < listOfPeople.size(); index++) {
			PersonObject person = listOfPeople.get(index);
			title += String.format("%-20s %-20s %-20s\n", person.getFirstName(), person.getLastName(),
					person.getPhone());
		}
		return title;
	}

	public ArrayList<PersonObject> getListOfPeople() {
		return listOfPeople;
	}

	public void setListOfPeople(ArrayList<PersonObject> listOfPeople) {
		this.listOfPeople = listOfPeople;
	}

}
