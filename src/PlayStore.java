/* COSC2531 Programming Fundamentals, Sem 2, 2018
 *
    !!!!!!!!!!!!!!!
    !!!IMPORTANT!!!
    !!!!!!!!!!!!!!!
 This is a sample main method that checks the funtionalities required in the assignment 2.
    This file will NOT compile unless you write all the required java classes, along with their attributes and the methods.
 */

import java.util.*;

public class PlayStore {
	//Student to do: Add the necessary attributes and methods

	// Class A.1
	class Content extends PlayStore
	{
		int ID;
		String contentName;
		int downCount;
		double price;
		String review;

		Scanner userIn = new Scanner(System.in);

		int getID(int ID, String contentName, int downCount, double price)
		{
			System.out.println("Please type the ID number of the content");
			ID = userIn.nextInt();
			System.out.println();

			return ID;
		}

		String getName(String contentName)
		{
			System.out.println("Please type the name of the content");
			contentName = userIn.next();
			System.out.println();

			return contentName;
		}


		double getPrice(double price)
		{
			System.out.println("Please type the price of the content");
			price = userIn.nextDouble();
			System.out.println();

			return price;
		}
	}


	// Class A.2
	class Reading extends Content
	{
		String publisher;
		String genre;
		int pageNo;
		
		String getPub(String publisher)
		{
			System.out.println("Please type the publisher name");
			publisher = userIn.next();
			System.out.println();
			
			return publisher;
		}
		
		String getGenre(String genre)
		{
			System.out.println("Please type the genre name");
			genre = userIn.next();
			System.out.println();
			
			return genre;
		}
		
		int getPage(int pageNo)
		{
			System.out.println("Please type the number of pages");
			pageNo = userIn.nextInt();
			System.out.println();
			
			return pageNo;
		}
	}

	// Class A.3
	class Book extends Reading
	{
		String authorName;
		
		String getAuthor(String authorName)
		{
			System.out.println("Please type the name of the author");
			publisher = userIn.next();
			System.out.println();
			
			return authorName;
		}
	}

	// Class A.4
	class Magazine extends Reading
	{
		String title;
		
		String getTitle(String title)
		{
			System.out.println("Please type the title of the magazine");
			title = userIn.next();
			System.out.println();
			
			return title;
		}
	}


	// Class B
	class Comment
	{
		String u1 = new UserName; //link to class D
		Comment cmnt = new Comment(u1, "This is a fantastic game"); // pulled from assignment task sheet
	}


	// Class C
	class OS
	{
		String OS;
		int version;

		OS os1 = new OS("Android", 4); // pulled from assignment task sheet
	}

	// Class D
	public class user(OS, version)
	{
		int ID;
		String UserName;
		String phoneNo;
		double balance;

	}

	// Class E	
	public static void main(String[] args)
	{   
		PlayStore admin = new PlayStore();
		//adding new readings
		String[] authors ={"L. Tolstoy"};
		Book b1 = new Book("R1", "War and Peace", 12, "The Russian Messenger‎", "Novel", 1225, authors);
		String[] authors2 ={"F. Scott Fitzgerald"};
		Book b2 = new Book("R2", "The great gatsby", 10, "Charles Scribner's Sons", "Novel", 180, authors2);
		String[] authors3 ={"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
		Book b3 = new Book("R3", "Introduction to algorithms", 100, "MIT Press", "Computer Science", 1312, authors3);
		Magazine m1 = new Magazine("R4", "Forbes", 8, "Forbes Media‎", "Business", 50, "World’s richest under 30");

		admin.addContents(b1);
		admin.addContents(b2);
		admin.addContents(b3);
		admin.addContents(m1);

		//adding new games
		OS os1 = new OS("Android", 4);
		OS os2 = new OS("iOS", 10);
		OS os3 = new OS("Android", 3);
		Game g1 = new Game("g1", "Pokemon", 5, false, os1);
		Game g2 = new Game("g2", "Pokemon", 5, false, os2);
		Game g3 = new Game("g3", "MineCraft", 2, true, os1);

		admin.addContents(g1);
		admin.addContents(g2);
		admin.addContents(g3);

		//adding new users
		User u1 = new User("u1", "John Doe", "0412000", 20, os1);
		User u2 = new User("u2", "Jane Doe", "0412001", 120, os1);
		User u3 = new User("u3", "Dave Roe", "0412002", 100, os2);
		User u4 = new User("u4", "Diane Roe", "0412003", 50, os3);
		admin.addUsers(u1);
		admin.addUsers(u1);
		admin.addUsers(u1);
		admin.addUsers(u1);


		//Users are buying contents
		u1.buyContent(b1);
		u1.buyContent(b3);
		u4.buyContent(g1);
		u1.buyContent(m1);


		//some users becoming premium and then buying contents
		u4.becomePremium();
		u4.buyContent(m1);
		u2.becomePremium();
		u2.buyContent(g2);
		u2.buyContent(g1);

		//showing contents bought by the user u2
		u2.showContentsBought();

		//showing all contents in the PlayStore
		admin.showAllContents();


		//showing all reading type of objects with the genre
		admin.showReadingOfGenre("Novel");

		//Student to do: call a method to show all games. What should be the parameters of that //method?   See Section 2, functionality 7


		Comment cmnt = new Comment(u1, "This is a fantastic game!");
		g1.addReviews(cmnt);
		Comment r1 = new Comment(u2, "I never liked this game!");
		cmnt.addReply(r1);
		Comment r2 = new Comment(u1, "Really??");
		r1.addReply(r2);

		Comment cmnt2 = new Comment(u3, "The game crashes frequently.");
		g1.addReviews(cmnt2);

		//showing all reviews including the replies on object g1
		g1.printAllReview();


	}
}