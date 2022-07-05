package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {
        "io.datajek.spring.basics.movierecommendersystem.lesson10"
})
@ComponentScan(includeFilters = @ComponentScan.Filter(
        type = FilterType.REGEX,
        pattern ="io.datajek.spring.basics.movierecommendersystem.lesson9"
))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext applicationContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args
        );

        System.out.println("ContentBasedFilter bean found = "+
                applicationContext.containsBean("contentBasedFilter"));
        System.out.println("CollaborativeFilter bean found = "+
                applicationContext.containsBean("collaborativeFilter"));
    }

}
