package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        if (ratingRegister.getPersonalRatings(person).values().isEmpty()) {
            List<Film> filmList = new ArrayList<>();

            for (Film f : ratingRegister.filmRatings().keySet()) {
                filmList.add(f);
            }

            Collections.sort(filmList, new FilmComparator(ratingRegister.filmRatings()));

            return filmList.get(0);

        } else {
            List<Film> filmList = new ArrayList<>();
            Map<Film, Integer> filmSimilarity = new HashMap<>();

            for (Film f : ratingRegister.filmRatings().keySet()) {
                filmList.add(f);
            }

            for (Film f : filmList) {
                for (Person p : ratingRegister.reviewers()) {
                    for (Rating r : ratingRegister.getPersonalRatings(person).values()) {
                        if (ratingRegister.getRating(person, f).equals(Rating.NOT_WATCHED)){
                            filmSimilarity.put(f, r.getValue() * ratingRegister.getRating(p, f).getValue());
                        }
                    }
                }
            }

            return result(filmSimilarity);
        }
    }

    public Film result(Map<Film, Integer> filmSimilarity) {
        int temp = 0;

        for (Film f : filmSimilarity.keySet()) {
            if (filmSimilarity.size() <= 2) {
                temp = filmSimilarity.get(f);
            }
            temp = Math.max(filmSimilarity.get(f), temp);
        }

        for (Film f : filmSimilarity.keySet()) {
            if (filmSimilarity.get(f).equals(temp)){
                return f;
            }
        }

        return null;
    }

} //Optimizable.
