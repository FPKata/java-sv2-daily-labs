package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> timesOfShow;

    public Movie(String title, List<LocalDateTime> timesOfShow) {
        this.title = title;
        this.timesOfShow = timesOfShow;
    }

    public String getTitle(){
        return title;
    }


    public List<LocalDateTime> getTimesOfShow() {
        return timesOfShow;
    }
}
