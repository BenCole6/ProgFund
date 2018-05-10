/* COSC2531 Programming Fundamentals, Sem 2, 2018
 *
    !!!!!!!!!!!!!!!
    !!!IMPORTANT!!!
    !!!!!!!!!!!!!!!
 This is a sample main method that checks the funtionalities required in the assignment 2.
    This file will NOT compile unless you write all the required java classes, along with their attributes and the methods.
 */

import java.util.*;


abstract class Content{
String ID;
String applicationName;
int numberOfdowns;
double appPrice;
 ArrayList<Comment> review = new ArrayList<Comment>();
     public Content(String id, String Cname, int dwonloads, double CappPrice ,ArrayList<Comment> Creview ) 
			{
			ID = id;
			applicationName = Cname;
			numberOfdowns =  dwonloads;
			appPrice = CappPrice;
			review = Creview;
			
			}	
     public Content(String id, String Cname, int dwonloads, double CappPrice  ) 
		{
		ID = id;
		applicationName = Cname;
		numberOfdowns =  dwonloads;
		appPrice = CappPrice;
	
		}	
  
      /*
       * constructor without  ArrayList<Comment>
       *  public Content(String id, String name, int dwonloads, double CappPrice  ) 
			{
			ID = id;
			applicationName = name;
			numberOfdowns =  dwonloads;
			price = CappPrice;
			
			}*/	
     public Content(String id, String cname,  double CappPrice  ) 
		{
		ID = id;
		applicationName = cname;
		numberOfdowns =  0;
		appPrice = CappPrice;
		
		}	
     
     public Content(String id, String cname  ) 
		{
		ID = id;
		applicationName = cname;
		numberOfdowns =  0;
		appPrice = 0;// the price 
		
		}
     
    
}
/////////////////////////////////////////////////////////////
class Game extends Content {
	boolean isMultiPlayer;
	private OS os;
	public Game(String id, String cname, int dwonloads, double CappPrice,  boolean isMultiPl ,OS cos) {
		super(id, cname,dwonloads,CappPrice);
		isMultiPlayer = isMultiPl;
		os = cos;
	}
	
	public Game(String id, String cname,  double CappPrice,  boolean isMultiPl ,OS cos ) {
		super(id, cname,CappPrice);
		isMultiPlayer = isMultiPl;
		os = cos;
		//Game g1 = new Game (“G101”, “Pokemon”, 10, false, os1);
	}
	
	public Game(String id, String name,  boolean isMultiPl ,OS cos) {
		super(id, name);
		isMultiPlayer = isMultiPl;
		os = cos;
		// Game g1 = new Game (“G101”, “Pokemon”, false, os1);
	}
	
	
	
}
////////////////////////////////////////////////////////////////////////////////////////
abstract class Reading extends Content {
	String publisher;
	String genre;
	int  numberOfpages;
	
	public Reading (String id, String name, int dwonloads, double AppPrice, String Cpublisher,String Cgenre, int CnumberOfpages ) {
		super(id, name,dwonloads,AppPrice);
		publisher = Cpublisher;
		genre = Cgenre; 
		numberOfpages = CnumberOfpages;
			
	}
	
	public Reading (String id, String name, double AppPrice, String Cpublisher,String Cgenre, int CnumberOfpages ) {
		super(id, name,AppPrice);
		publisher = Cpublisher;
		genre = Cgenre; 
		numberOfpages = CnumberOfpages;
			
	}
	public Reading (String id, String name, String Cpublisher,String Cgenre, int CnumberOfpages ) {
		super(id, name);
		publisher = Cpublisher;
		genre = Cgenre; 
		numberOfpages = CnumberOfpages;
			
	}
}
////////////////////////////////////////////////////////////////////////////////////
class Book extends Reading {
	String[] author;
public 	Book(String id, String name, int dwonloads, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String[] Cauthor) {
	super ( id,  name,  dwonloads,  AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	author = Cauthor;
	
}
	
public 	Book(String id, String name, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String[] Cauthor) {
	super ( id,  name,   AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	author = Cauthor;
	
}	

public 	Book(String id, String name,  String Cpublisher,String Cgenre, int numberOfpages, String[] Cauthor) {
	super ( id,  name,  Cpublisher, Cgenre,  numberOfpages);
	author = Cauthor;
	
}
	
}	
	
/////////////////////////////////////////////////////////////////////////////////
class Magazine extends Reading {
	String title;
public 	Magazine(String id, String name, int dwonloads, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String Ctitle) {
	super ( id,  name,  dwonloads,  AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	title = Ctitle;
	
}
	
public 	Magazine(String id, String name, double AppPrice, String Cpublisher,String Cgenre, int numberOfpages, String Ctitle) {
	super ( id,  name,   AppPrice,  Cpublisher, Cgenre,  numberOfpages);
	title = Ctitle;
	//Magazine(“M21”, “Forbes”, 8, “Forbes Media”, “Business”, 50,“World’s richest under 30”);
}	

public 	Magazine(String id, String name,  String Cpublisher,String Cgenre, int numberOfpages, String Ctitle) {
	super ( id,  name,  Cpublisher, Cgenre,  numberOfpages);
	title = Ctitle;
	//Magazine(“M21”, “Forbes”,  “Forbes Media”, “Business”, 50,“World’s richest under 30”);	
}
	
}	

/////////////////////////////////////////////////////////////////////////////////

class Comment{
	private User user;
	String comment;
	Object [] commentArray;
	Comment(User u, String comm){
	user = u;
	comment = comm;
	//Comment cmnt = new Comment(u1, “This is a fantastic game!”);
	}
	
}
/////////////////////////////////////////////////////////////////////////////////
class OS{
	
String TypeOfOS;
int versionNumber;

public OS(String OStype, int versionNum) {
	TypeOfOS = 	OStype;
	versionNumber = versionNum;
	
	//OS os1 = new OS(“Android”, 4);
	
}
	
}
/////////////////////////////////////////////////////////////////////////////////
class User{
	
String ID;
String name;
String phonNumber;
double balance;
private OS os;
private Content content;
ArrayList<String> premium = new ArrayList<String>();
public User (String id, String Cname, String CphoneNum, double Cbalance, OS Cos) {
	
ID = id;
name = Cname;
phonNumber = CphoneNum;
balance = Cbalance;
os = Cos;
}

public User (String id, String Cname, String CphoneNum, OS Cos) {
	
ID = id;
name = Cname;
phonNumber = CphoneNum;
os = Cos;

}
public void becomePremium(User usr) {
	// misunderstanding 
	if ( balance < 0 )
	{
		System.out.println("insufficient balance.");
	}
	else if (content.appPrice > 100)
	{
		
		premium.add(name);
		
	}
}
public String getuser() {
return 	name;
}

public void buyContent(Content con)
  {
	
		balance -= content.appPrice;
		for (String var : premium) 
		{ 
		 if(var == name)   
		 {
			content.appPrice=content.appPrice * (20/100); 
		 }
		}
       content.numberOfdowns +=1;
       
       if (con instanceof Game )   
       {
    	   
    	   
       }
  }

}
/////////////////////////////////////////////////////////////////////////////////
public class PlayStore {

	public static void main(String[] args) {
		
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



// hi reham
