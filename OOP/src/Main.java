import java.time.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin = new Admin("AdminAdmin", "adminadmin", "Admin@gmail.com", "0506321951");
		
		User user1 = new User("Alsharabi", "reeeeeem", "Reem@gmail.com", "0506321951");
		User user2 = new User("Reeeem", "reeeeeem", "Reem@gmail.com", "0506321951");
		
		Movie movie = new Movie("Movie1", LocalDate.of(2022, Month.JANUARY, 16), "Movie in 2022", "Action");
		Movie movie2 = new Movie("Movie2", LocalDate.of(2022, Month.JANUARY, 16), "Movie in 2022", "Action");
		
		Actor actor1 = new Actor("Luke", LocalDate.of(1980, Month.JANUARY, 1), "USA", "Actor");
		Actor actor2 = new Actor("Someone", LocalDate.of(1980, Month.JANUARY, 1), "USA", "Actor");
		
		actor1.addMovie(movie, "Lead", "Someone");
		actor1.addMovie(movie2, "Lead", "Someone");
		
		actor2.addMovie(movie, "something", "Someone2");
		
		movie2.addActor(actor2, "something2", "Someone22");
		
		Director director = new Director("Director", "director@gmail.com", "0512345678", LocalDate.of(1990, Month.APRIL, 1), "Canada", "Director");
		
		
		MovieEcosystem producer = new Producer("Producer", LocalDate.of(1990, Month.APRIL, 15), "KSA", "Producer");
		MovieEcosystem writer = new Writer("Writer",  LocalDate.of(1970, Month.JULY, 25), "UAE", "Writer");
	
		
		Reviews review1 = new Reviews(movie, user1, "Amazing", 4.5);
		Reviews review2 = new Reviews(movie2, user1, "Amazing", 4.5);
		Reviews review3 = new Reviews(movie, user2, "bad", 4.5);
		
		for (int i = 0; i < actor1.getMoviesArrList().size(); i++)
			actor1.getMoviesArrList().get(i).displayAllMovies(actor1);
		System.out.println("----------");
		for (int i = 0; i < actor2.getMoviesArrList().size(); i++)
			actor2.getMoviesArrList().get(i).displayCharacter(movie);
	}

}
