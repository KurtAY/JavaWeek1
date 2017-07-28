package game;

import java.util.Scanner;

public class RunnerClass {

	Scanner scan = new Scanner(System.in);
	boolean exit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnerClass game = new RunnerClass();
		game.printHeader();
		game.openingStory();
		game.directionMenu();
	}

	public void runMenu() {
		printHeader();
		openingStory();
		while (!exit) {
			directionMenu();
			int choose = getInputMenu();
			chooseDirection(choose);
			/* int direction = getInputPath(); */

		}
	}

	private void printHeader() {
		System.out.println("------------------------------------");
		System.out.println("                                    ");
		System.out.println("        The Adventures of the       ");
		System.out.println("             BARREN MOOR            ");
		System.out.println("by Fred Johnson                     ");
		System.out.println("                                    ");
		System.out.println("------------------------------------");
	}

	private void openingStory() {
		System.out.println("\nYou open your eyes after what feels like a decade long slumber, and "
				+ "\nwitness a brightness that can only be described as the equivalence on the Sun. "
				+ "\nYou realise you must have been asleep for a good while, and you start getting "
				+ "\nused to your surroundings. It is in fact a grey murky afternoon...");
		System.out.print("\nEnter your first name: ");
		String firstName = scan.next();
		System.out.println("\n...you get up and turn around to see bodies that aren't moving, \nwhilst"
				+ " also getting a glimpse of what looks like an airplane seat. \n\nThat is when it hits" + " you..."
				+ "\n...You, " + firstName + ", are the only survivor of a plane crash in the middle "
				+ "\nof the BARREN MOOR!");
	}

	private void directionMenu() {
		System.out.println("\n\nYou take a minute to gather yourself and find a compass and a sword on the ground."
				+ "\nYou look at it and see you are facing north. Decide whether you should...");
		System.out.println("(1) continue NORTH ");
		System.out.println("(2) take a right and head EAST ");
		System.out.println("(3) turn around and have a look SOUTH ");
		System.out.println("(4) look for Kanye and venture WEST ");
		System.out.println("(5) STAY AND DIE ");
	}

	private int getInputMenu() {
		int choice = 0;
		do {
			System.out.print("Enter the option you want here: ");
			try {
				choice = Integer.parseInt(scan.nextLine());
			}

			catch (NumberFormatException e) {
				System.out.println("\nYou have entered an invalid selection! Please try again. ");
			}

			if (choice < 1 || choice > 5) {
				System.out.println("\nYour choice is not an option. Please select a valid choice. ");
			}
		} while (choice < 1 || choice > 5);
		return choice;
	}

	private int getInputPath() {
		int choice = 0;
		do {
			System.out.print("Enter the option you want here: ");
			try {
				choice = Integer.parseInt(scan.nextLine());
			}

			catch (NumberFormatException e) {
				System.out.println("\nYou have entered an invalid selection! Please try again. ");
			}

			if (choice < 1 || choice > 2) {
				System.out.println("\nYour choice is not an option. Please select a valid choice. ");
			}
		} while (choice < 1 || choice > 2);
		return choice;
	}

	private void chooseDirection(int choose) {
		switch (choose) {
		case 1:
			northPath();
			break;

		case 2:
			eastPath();
			break;

		case 3:
			southPath();
			break;

		case 4:
			westPath();
			break;

		case 5:
			System.out.println("Yeah you died because you wanted to. ");
			System.exit(0);
			break;
		}
	}

	private void northPath() {
		System.out.println("\n\nAfter continuing north for a bit, you approach "
				+ "a small hill. Halfway up the hill trek you spot a small sillouette flying and hear \n"
				+ "a strong accumulation of 'ribbit ribbit'. ");
		System.out.println("\n(1)Get a closer look. ");
		System.out.println("(2)Go no further, turn back. ");
		String choice = scan.nextLine();

		if (choice == "1") {
			System.out.println("\nGET A CLOSER LOOK. ");
			System.out.println("\nYou walk a bit further and the silloutte continues to hop towards you.\n"
					+ "As you get closer you can't believe your eyes. It is a HUMAN-SIZED FROG!. ");

			System.out.println("\n(1)Fight it ");
			System.out.println("(2)Try to speak to it ");
			String choice1 = scan.nextLine();
			
			if (choice1 == "1") {
				System.out.println("\nFIGHT IT");
				System.out.println("\nYou use your sword, channel your inner King Arthur"
						+ "\nand kill the frog in 4 swift slashes. ");
				System.out.println("\n+1 CONFIDENCE");
				
				System.out.println("\nNow you are a bit gassed and confident so you continue onwards "
						+ "\non your search for human activity. \n\nYou approach a swampy area.");
				
				System.out.println("\n(1)Walk through the Swamp.");
				System.out.println("(2)Look for a route around it.");
				String choice2 = scan.nextLine();
				if (choice2 == "1") {
					System.out.println("\nWALK THROUGH THE SWAMP.");
					System.out.println("\nYou enter the swamp and instantly regret it, this is in fact an"
							+ "\nalligator swamp and your legs get bitten off. You die.");
				}
				else if (choice == "2") {
					System.out.println("LOOK FOR A ROUTE AROUND IT. ");
					System.out.println("\n You take the smart option, anyhting could have been in that swamp\n"
							+ "that you could not see. \n\n ");
					System.out.println("\n+1 SMARTS");
					
					//CONTINUES STORY HERE-------------------------------------------------------------------
					
				}
			} 
			else if (choice1 == "2")
				System.out.println("TRY TO SPEAK TO IT");
			System.out.println("\nYou approach it with nonchalance and for some reason"
					+ "\nattempt to ask a frog questions in english. The frog has no idea"
					+ "\nwhat you are asking and eats you. ");
		}

		else if (choice == "2") {
			System.out.println("GO NO FURTHER, TURN BACK. ");
			System.out.println("\nYou chicken out, turn around and run frantically, dropping "
					+ "\nyour compass and leaving your sword in the process. You now have no"
					+ "\nidea where you are with no weapons and get killed by a wasp. ");
		}

	}

	private void eastPath() {
		System.out.println("You proceed to head East. ");

	}

	private void southPath() {
		System.out.println(
				"You pick yourself up, taking food from suitcases with you \n" + "and you proceed to head South. ");

	}

	private void westPath() {
		System.out.println(
				"You pick yourself up, taking food from suitcases with you \n" + "and you proceed to head West. ");

	}
}
