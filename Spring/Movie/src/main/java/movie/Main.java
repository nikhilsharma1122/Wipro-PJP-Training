package movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("movieBean.xml");
		Movie movie = context.getBean(Movie.class);
		System.out.println("Movie ID: "+ movie.getMovieId());
		System.out.println("Movie Name: "+ movie.getMovieName());
		System.out.println("Movie Actor: "+ movie.getMovieActor());
		
	}

}
