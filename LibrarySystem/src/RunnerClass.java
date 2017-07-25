import java.util.ArrayList;
import java.util.Scanner;

public class RunnerClass {

	boolean exit;

	ArrayList<Customers> UserList = new ArrayList<Customers>();
	ArrayList<Store> StoreList = new ArrayList<Store>();

	/*
	 * ArrayList<String> MagazineList = new ArrayList<String>(); ArrayList<String>
	 * BookList = new ArrayList<String>(); ArrayList<String> CameraList = new
	 * ArrayList<String>();
	 */

	public static void main(String[] args) {
		RunnerClass run = new RunnerClass();
		run.runMenu();
	}

	private void menuHeader() {
		System.out.println("\t------------------------------------");
		System.out.println("\t              Welcome               ");
		System.out.println("\t          to GOAT Library!!         ");
		System.out.println("\t------------------------------------");
	}

	private void printMenu() {
		System.out.println("Please select an option below");
		System.out.println("1. \tAdd a new member.");
		System.out.println("2. \tAdd a new item.");
		System.out.println("3. \tRemove an item.");
		System.out.println("4. \tDisplay all members.");
		System.out.println("5. \tExit");
	}

	public void runMenu() {
		menuHeader();
		while (!exit) {
			printMenu();
			int selection = getInput();
		}
	}

	private int getInput() {
		Scanner scan = new Scanner(System.in);
		int selection = 0;
		while (selection < 1 || selection > 5) {
			try {
				System.out.print("Here: ");
				selection = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrongggg, try again. ");
			}
		}
		return selection;
	}

	private void Perform(int selection) {
		Scanner input = new Scanner(System.in);
		Customers c1 = new Customers();
		Store s1 = new Store();
		selection = input.nextInt();

		switch (selection) {
		case 1:
			/*System.out.print("Enter the new members Name: ");
			String name = input.nextLine();
			c1.setName(name);
			
			System.out.print("Enter the Age of the member: ");
			int age = input.nextInt();
			c1.setAge(age);
			UserList.add(new Customers(name,age));*/

			addMember();
			
		case 2:
			
			addItem();

		case 3:
			
			removeItem();

		case 4:
			displayAll();

		case 5:
			exit = true;
			System.out.println("Jog on. ");
		}
	}
}
