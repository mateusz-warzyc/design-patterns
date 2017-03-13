package pl.mateuszwarzyc.creational.prototype;

import pl.mateuszwarzyc.creational.prototype.impl.Movie;
import pl.mateuszwarzyc.creational.prototype.impl.Registry;

/**
 * Created by Coffee13.
 */
public class Main {


    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns in java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }

}
