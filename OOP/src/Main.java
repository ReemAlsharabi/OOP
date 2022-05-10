import java.time.*;

import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args)
	{
		try {
		Admin admin = new Admin("Admin", LocalDate.of(2022, Month.JANUARY, 16), "AdminAdmin", "adminadmin", "Admin@gmail.com", "0506321951");
		
		User user1 = new User("Aicha Sidiya", LocalDate.of(2022, Month.JANUARY, 16), "Alsharabi", "reeeeeem", "Reem@gmail.com", "0506321951");
		User user2 = new User("Reem Alahrabi", LocalDate.of(2022, Month.JANUARY, 16), "Reeeem", "reeeeeem", "Reem@gmail.com", "0506321951");
		
		System.out.println(user1);
		
		Director director1 = new Director("name", "Email", "0567890123", LocalDate.of(2022, Month.JANUARY, 16), "bPlace", "info");
		Movie movie = new Movie("Movie1", LocalDate.of(2022, Month.JANUARY, 16), "Movie in 2022", "Action",  "quote", "Award", director1);
		Movie movie2 = new Movie("Movie2", LocalDate.of(2022, Month.JANUARY, 16), "Movie in 2022", "Action", "quote", "Award", director1);
		
		 //Testing Acts
		Actor actor1 = new Actor("Luke", LocalDate.of(1980, Month.JANUARY, 1), "USA", "Actor");
		Actor actor2 = new Actor("Someone", LocalDate.of(1980, Month.JANUARY, 1), "USA", "Actor");
		
		Action acts1 = new Acts(movie, actor1, "something", "someone");
		Action acts2 = new Acts(movie, actor2, "something", "someone");
		Action acts3 = new Acts(movie2, actor1, "something", "someone");
		
		Acts.displayAllPersons(movie);
		System.out.println("---------------");
		
		Acts.displayAllMovies(actor1);
		System.out.println("---------------");
		
		Acts.displayAllCharacters(movie);
		System.out.println("---------------");
		
		
		System.out.println(Acts.getCharacterName(movie2, actor1) + "\n---------------");
		
		Acts.removeActs(movie2, actor1);
		
		Acts.setCharacterName(movie2, actor1, "should be not found");
		System.out.println("---------------");
		Acts.setCharacterName(movie, actor1, "Somebody");
		
		System.out.println(Acts.getCharacterName(movie, actor1) + "\n---------------");
		
		Acts.setRole(movie, actor1, "role");
		System.out.println(Acts.getRole(movie, actor1) + "\n---------------");
		
		Action review1 = new Reviews(movie, user1, "Amazing", 5);
		Action review2 = new Reviews(movie2, user1, "Good", 4.5);
		Action review3 = new Reviews(movie2, user2, "Bad", 2);
		
		System.out.println(Reviews.getNumOfReviews() + "\n---------------");
		Reviews.displayAllPersons(movie2);
		System.out.println("---------------");
		Reviews.displayAllMovies(user1);
		System.out.println("---------------");
		//Reviews.removeReview(movie2, user1);
		Reviews.displayAllMovies(user1);
		System.out.println("---------------");
		Reviews.setRating(3, movie2, user2);
		
		System.out.println(Reviews.getRatingAvg(movie2)+"\n---------------");
		
		Reviews.setComment("Fair", movie2, user2);
		Reviews.displayAllComments(movie2);
		System.out.println("---------------");
		Reviews.displayAllComments(user1);
		}
		
		catch(Exception e1)
		{
			JOptionPane.showMessageDialog(null,e1);
		}
		
}
}
