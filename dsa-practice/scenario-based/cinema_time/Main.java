package cinema_time;

public class Main {
	public static void main(String[] args) {

		CinemaManager manager = new CinemaManager();

		try {
			manager.addMovie("Avengers","18:30");
			manager.addMovie("Inception","21:00");
			//manager.addMovie("Batman","25:99");

			System.out.println("All Movies:");
			manager.displayAllMovies();

			System.out.println("\nSearch Result:");
			manager.searchMovie("Ave");

			manager.generateReport();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
