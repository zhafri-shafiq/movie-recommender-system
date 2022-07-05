package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args
        );

        //RecommenderImplementation injects dependency using constructor
        System.out.println("Calling getBean() on RecommenderImplementation");
        RecommenderImplementation recommender = applicationContext.getBean(
                RecommenderImplementation.class
        );

        //RecommenderImplementation2 injects dependency using setter method
        System.out.println("Calling getBean() on RecommenderImplementation2");
        RecommenderImplementation2 recommender2 = applicationContext.getBean(
                RecommenderImplementation2.class
        );

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        result = recommender2.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
