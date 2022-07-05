package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
//        ApplicationContext applicationContext = SpringApplication.run(
//                MovieRecommenderSystemApplication.class
//        );

//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        System.out.println("\nBeans loaded:");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = applicationContext.getBean(
                "recommenderImpl",
                RecommenderImplementation.class
        );

        System.out.println("\nDependency: "+recommender.getFilter());

        //call method to get recommendations
//        String[] result = recommender.recommendMovies("Finding Dory");
//
//        //display results
//        System.out.println(Arrays.toString(result));

        applicationContext.close();
    }

}
