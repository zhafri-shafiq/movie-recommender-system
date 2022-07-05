package io.datajek.spring.basics.movierecommendersystem.lesson12;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[]{};
    }
}
