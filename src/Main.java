import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;
		printInstructions();
		MobilePhone myMobile = new MobilePhone();

		while(!quit) {
			System.out.println("Enter you choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 0: printInstructions();
					break;
				case 1: 
					myMobile.printAllContacts();
					break;
				case 2:
					System.out.println("Enter a name ");
					String name = scanner.nextLine();

					System.out.println("Enter a number ");
					String number = scanner.nextLine();
					
					myMobile.addContact(name, number);

					break;
					
				case 3: 

					System.out.println("Select the contact to update ");
					int contactToUpdate = scanner.nextInt();
					myMobile.updateContact(contactToUpdate);

					break;
				case 4: 
					System.out.println("Select the contact to remove ");
					int contactToRemove = scanner.nextInt();
					myMobile.removeContact(contactToRemove);
					
					break;
				case 5: 
					quit = true;
					break;
			
			}
		}


		
		
		
		
	}
	
	public static void printInstructions() {
		System.out.println("Choose one of the following options:");
		System.out.println("1 - Print the list of contacts");
		System.out.println("2 - Add a new contact");
		System.out.println("3 - Update an existing contact");
		System.out.println("4 - Remove a contact");
		System.out.println("5 - Quit");
	}

}
