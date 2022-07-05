package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class
        );

        RecommenderImplementation recommender = applicationContext.getBean(
                RecommenderImplementation.class
        );

        String favoriteMovie = recommender.getFavoriteMovie();
        System.out.println(favoriteMovie);
    }

}
