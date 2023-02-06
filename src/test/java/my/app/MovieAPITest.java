package my.app;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import exception.MovieAPIException;
import model.MovieInfo;
import services.MovieDBService;

public class MovieAPITest {

	@Test
	public void testSearchAPI() throws MovieAPIException {
		System.out.println("Starting testSearchAPI Test...");
		
		final MovieDBService movieSearchService = MovieAPI.getMovieDBService();
		final List<MovieInfo> results = movieSearchService.searchForMovies("Star Wars");
		Assert.assertFalse(results.isEmpty());
		
		// Changed in order to work for all versions
        for( MovieInfo result : results) {
        	System.out.println(result);
        }
        // results.forEach(System.out::println);
	}
	
	@Test
    public void testDiscoverAPI() throws MovieAPIException {
		System.out.println("Starting testDiscoverAPI Test...");
		
		final MovieDBService movieSearchService = MovieAPI.getMovieDBService();
        final List<MovieInfo> results = movieSearchService.getPopularMovies();
        Assert.assertFalse(results.isEmpty());
        
        // Changed in order to work for all versions
        for( MovieInfo result : results) {
        	System.out.println(result);
        }
        // results.forEach(System.out::println);
    }
	
	@Test
    public void testDiscoverAPIwithYear() throws MovieAPIException {
		System.out.println("Starting testDiscoverAPIwithYear Test...");
		
        final MovieDBService movieSearchService = MovieAPI.getMovieDBService();
        final List<MovieInfo> results = movieSearchService.getPopularMoviesForYear(2020);
        Assert.assertFalse(results.isEmpty());

        // Changed in order to work for all versions
        for( MovieInfo result : results) {
        	System.out.println(result);
        }
        // results.forEach(System.out::println);
    }

    @Test
    public void testDiscoverAPIInvalidYear() throws MovieAPIException {
    	System.out.println("Starting testDiscoverAPIInvalidYear Test...");
    	
        final MovieDBService movieSearchService = MovieAPI.getMovieDBService();
        final List<MovieInfo> results = movieSearchService.getPopularMoviesForYear(5555);
        Assert.assertTrue(results.isEmpty());
    }

}
