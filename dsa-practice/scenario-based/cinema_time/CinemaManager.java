package cinema_time;

import java.util.ArrayList;
import java.util.List;

public class CinemaManager {

	List<String> movieTitles = new ArrayList<>();
	List<String> showTimes  = new ArrayList<>();

	public void addMovie(String title,String time) throws InvalidTimeFormatException {
		if(!isValidTime(time)) {
			throw new InvalidTimeFormatException("Invalid Time Format : " + time);
		}
		movieTitles.add(title);
		showTimes.add(time);
	}

	public void searchMovie(String keyword) {
		try {
			boolean found = false;

			for(int i = 0;i < movieTitles.size();i++) {
				if(movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
					System.out.println(movieTitles.get(i) + " at " + showTimes.get(i));
					found = true;
				}
			}

			if(!found) {
				System.out.println("Movie not found");
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid search index");
		}
	}

	public void displayAllMovies() {
		for(int i = 0;i < movieTitles.size();i++) {
			System.out.println(
				String.format("Movie : %s | Time : %s",
				movieTitles.get(i),showTimes.get(i))
			);
		}
	}

	public void generateReport() {
		String[] reportArray = movieTitles.toArray(new String[0]);

		System.out.println("----- Movie Report -----");
		for(int i = 0;i < reportArray.length;i++) {
			System.out.println(reportArray[i]);
		}
	}

	private boolean isValidTime(String time) {
		if(time.length() != 5 || time.charAt(2) != ':') {
			return false;
		}
		int hour = Integer.parseInt(time.substring(0,2));
		int min  = Integer.parseInt(time.substring(3,5));
		if(hour<0||hour>23||min<0|| min > 59) {
			return false;
		}
		return true;
	}
}
