package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select filter
    @Autowired
    private Filter contentBasedFilter;

    //use a filter to find recommendations
    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " +contentBasedFilter + "\n");

        //use content based filter to find similar movies
        String[] results = contentBasedFilter.getRecommendations(movie);
        //return the results
        return results;
    }
}
