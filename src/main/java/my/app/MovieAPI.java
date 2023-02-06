package my.app;

import services.MovieDBService;

public class MovieAPI {
	
	public static MovieDBService getMovieDBService() {
		return new MovieDBService("https://api.themoviedb.org/", "your-key-goes-here");
	}

}
