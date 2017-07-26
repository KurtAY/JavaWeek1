import java.util.ArrayList;
import java.util.Scanner;

public class RunnerClass {

	boolean exit;

	static ArrayList<customer> UserList = new ArrayList<customer>();

	static ArrayList<Books> BookList = new ArrayList<Books>();
	static ArrayList<Object> MagazineList = new ArrayList<Object>();
	static ArrayList<Object> CameraList = new ArrayList<Object>();

	static ArrayList<store> StoreList = new ArrayList<store>();

	public static void main(String[] args) {
		MenuHeader();
		ConsoleMenu();
	}

	public static void MenuHeader() {
		System.out.println("\t-------------------------------");
		System.out.println("\t|           Welcome           |");
		System.out.println("\t|     To Kurts Libraries      |");
		System.out.println("\t-------------------------------");
	}

	public static void ConsoleMenu() {
		int selection = 0;

		Scanner input = new Scanner(System.in);

		customer c1 = new customer();

		store s1 = new store();

		Books b1 = new Books();

		magazine m1 = new magazine();

		camera cam = new camera();

		{
			System.out.println("1. Add a new Member. ");
			System.out.println("2. Add a new item. ");
			System.out.println("3. Remove an item. ");
			System.out.println("4. Display all Members. ");
			System.out.println("5. Exit. ");
			selection = input.nextInt();
		}

		switch (selection) {
		case 1: // Add a new Member
			System.out.print("Enter the new Members Full Name: ");
			// some shit here linking customer name from customer class
			String name = input.next();
			c1.setName(name);

			System.out.print("\nEnter their age: ");
			String age = input.next();
			c1.setAge(age);

			// create some data, add object to that data and add the object to
			// the list
			UserList.add(new customer(name, age));
			System.out.println(name + ", " + age + " is now a officially a member.");

			break;

		case 2: // Add a new item.
			System.out.println("Item to be added. \n\t(1) for Book (2) Magazines (3) Cameras");
			int item = input.nextInt();
			s1.setProduct(item);
			// add getters and setters

			// Instead of if statement around the if statements here, use do
			// while loop - with possibly try/catch
			// if (item > 3) {

			/*
			 * if user types 1 for book blah blah blah.........
			 */
			boolean badInput = false;

			do {
				if (item == 1) {
					System.out.println("Please type the name of the book to add: ");
					String bookName = input.next();
					b1.setBookAuthor(bookName);

					System.out.println("Please type the name of the author of the book: ");
					String bookAuthor = input.next();
					b1.setBookAuthor(bookAuthor);

					BookList.add(new Books(bookName, bookAuthor));
					System.out.println("The book has now been added to the Library. ");

				}

				/*
				 * else if 2 for magazines blah blah blah.........
				 */
				else if (item == 2) {
					System.out.println("Please type the name of the magazine to add: ");
					String magazineName = input.next();
					m1.setMagazineName(magazineName);

					System.out.println("Please type the Issue Number: ");
					int issueNo = input.nextInt();
					m1.setIssueNo(issueNo);

					MagazineList.add(new magazine(magazineName, issueNo));
					System.out.println(magazineName + " Issue No. " + issueNo + ", has been added to the library.");

				}

				/*
				 * else if 3 for camera blah blah blah..........
				 */
				else if (item == 3) {
					System.out.println("Please type the brand of the Camera to add: ");
					String cameraName = input.next();
					cam.setCameraName(cameraName);

					System.out.println("Does the camera have recording capabilities: ");
					String isItRecorder = input.next();
					cam.setIsRecorder(isItRecorder);

					/*
					 * if (isItRecorder == "Y") { System.out.println("The " +
					 * cameraName +
					 * " with recording capabilities has been added to the library. "
					 * ); }
					 * 
					 * else if (isItRecorder == "N") { System.out.println("The "
					 * + cameraName +
					 * " with recording capabilities has been added to the library. "
					 * ); }
					 */

					CameraList.add(new camera(cameraName, isItRecorder));

				}

				else if (item > 3) {
					badInput = true;
				}

				/*
				 * else { System.out.println(
				 * "Please enter the number 1,2 or 3 to add a BOOK, MAGAZINE or a CAMERA respectively"
				 * ); }
				 */

			} while (item > 3);
			break;

		case 3: // Remove an Item.
			System.out.println("What item do you want to remove. ");
			System.out.println("\n\t(1) for Book (2) Magazines (3) Cameras");
			int itm = input.nextInt();
			s1.setProduct(itm);
			if (itm == 1) {
				// Access book Clear BookList
				System.out.println("Enter book name to remove: ");
				String bookName = input.next();
				BookList.removeIf(Books -> Books.getBookName().equals(bookName));
			}

			else if (itm == 2) {
				// access magazine list and remove input via name
				System.out.println("Enter magazine name to remove: ");
				String magazineName = input.next();
				MagazineList.removeIf(magazine -> ((magazine) magazine).getMagazineName().equals(magazineName));
			}

			else if (itm == 3) {
				// access camera list and remove input via name
				System.out.println("Enter camera name to remove: ");
				String cameraName = input.next();
				CameraList.removeIf(camera -> ((camera) camera).getCameraName().equals(cameraName));
			}
			break;

		case 4:
			System.out.println();

		}
	}
}
