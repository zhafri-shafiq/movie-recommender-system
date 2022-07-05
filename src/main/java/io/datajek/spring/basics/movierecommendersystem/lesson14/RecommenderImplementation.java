package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class RecommenderImplementation {

    @Autowired
    //use filter interface to select filter
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " +filter + "\n");

        //use content based filter to find similar movies
        String[] results = filter.getRecommendations(movie);
        //return the results
        return results;
    }
}
