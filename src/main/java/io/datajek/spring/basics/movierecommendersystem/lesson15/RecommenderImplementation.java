package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {

    @Autowired
    //use filter interface to select filter
    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie: Finding Dory}")
    String favoriteMovie;

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

    public String getFavoriteMovie() {
        return favoriteMovie;
    }
}
