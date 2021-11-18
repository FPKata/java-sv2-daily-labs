package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> films = new ArrayList<>();

    public void addMovie(Movie movie){
        films.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time){
        List<String> result = new ArrayList<>();
        for (Movie actual : films){
            if (filmContainsTime(actual, time)){
                result.add(actual.getTitle());
            }
        }
        return result;
    }

    private boolean filmContainsTime(Movie movie, LocalDateTime time){
        for (LocalDateTime actual : movie.getTimesOfShow()){
            if (actual.equals(time)){
                return true;
            }
        }
        return false;
    }
}
