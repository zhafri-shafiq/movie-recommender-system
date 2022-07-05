package io.datajek.spring.basics.movierecommendersystem.lesson8;

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

        //Retrieve singleton bean from application context thrice
        ContentBasedFilter cbf1 = applicationContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf2 = applicationContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf3 = applicationContext.getBean(ContentBasedFilter.class);

        System.out.println(cbf1);
        System.out.println(cbf2);
        System.out.println(cbf3);

        CollaborativeFilter cf1 = applicationContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter cf2 = applicationContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter cf3 = applicationContext.getBean(CollaborativeFilter.class);

        System.out.println(cf1);
        System.out.println(cf2);
        System.out.println(cf3);

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
