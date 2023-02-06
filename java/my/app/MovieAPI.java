package my.app;

import services.MovieDBService;

public class MovieAPI {
	
	public static MovieDBService getMovieDBService() {
		return new MovieDBService("https://api.themoviedb.org/", "3598a6c5675de9969e2694550212bf88");
	}

}
