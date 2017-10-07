import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
	private static Scanner scanner = new Scanner(System.in);

	public void addContact(String name, String number) {
		
		Contacts newContact = this.createContact(name, number);
		this.contacts.add(newContact);
	}
	
	public void removeContact(int index) {
		
		if (index <= this.contacts.size()) {
			this.contacts.remove(contacts.get(index-1));
		} else {
			System.out.println("Contact does not exist!");
		}

	}
	
	public void searchContact(Contacts contact) {
		if (this.contacts.contains(contact)) {
			System.out.println("Contact exists in your phone book!");
		} else {
			System.out.println("Contact does not exist!");
		}
	}
	
	public void updateContact(int index) {
		
		if (index <= this.contacts.size()) {
			
			System.out.println("Enter a name ");
			String newName = scanner.nextLine();
			System.out.println("Enter a number ");
			String newNumber = scanner.nextLine();
			this.contacts.set(index-1, this.createContact(newName, newNumber));
			
		} else {
			System.out.println("Contact does not exist!");
		}

	}
	
	public Contacts createContact (String name, String number) {
		
		Contacts newContact = new Contacts();
		newContact.setName(name);
		newContact.setPhoneNumber(number);
		
		return newContact;
	}
	
	public void printAllContacts() {
		
		if (this.contacts.size() == 0) {
			System.out.println("You have no contacts in your phone book");
		} else {
			
			for (int i=0; i<this.contacts.size(); i++) {
				Contacts contactToPrint = this.contacts.get(i);
				System.out.println("****************************************");
				System.out.println("Name: " + contactToPrint.getName());
				System.out.println("Phone number: " + contactToPrint.getPhoneNumber());
				System.out.println("****************************************");

			}
		}		
	}
}
