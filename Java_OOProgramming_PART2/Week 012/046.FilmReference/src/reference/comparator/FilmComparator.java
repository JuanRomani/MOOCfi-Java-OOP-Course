package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public int average(List<Rating> ratings){
        int average = 0;
        int flag = 0;

        for (Rating r : ratings) {
            average += r.getValue();
            flag++;
        }

        return average / flag;
    }

    @Override
    public int compare(Film f1, Film f2) {
        return average(ratings.get(f2)) - average(ratings.get(f1));
    }
}
