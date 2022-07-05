package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class
        );

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = applicationContext.getBean(
                RecommenderImplementation.class
        );

        System.out.println(recommender);

        //Retrieving prototype bean from application context twice
        Movie m1 = applicationContext.getBean(Movie.class);
        System.out.println(m1);

        Movie m2 = applicationContext.getBean(Movie.class);
        System.out.println(m2);

        String[] result = recommender.recommendMovies("Finding Dory");

        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

}
