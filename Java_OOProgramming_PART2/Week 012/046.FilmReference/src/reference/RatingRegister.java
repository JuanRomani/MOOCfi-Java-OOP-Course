package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

    Map<Film, List<Rating>> filmRatings;
    Map<Person, Map<Film, Rating>> personFilmRating;

    public RatingRegister() {
        this.filmRatings = new HashMap<>();
        this.personFilmRating = new HashMap<>();
    }

    public void addRating(Film film, Rating rating) {
        if (!filmRatings.containsKey(film)) {
            filmRatings.put(film, new ArrayList<>());
        }

        List<Rating> ratings = filmRatings.get(film);
        ratings.add(rating);

        filmRatings.put(film, ratings);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personFilmRating.containsKey(person)) {
            personFilmRating.put(person, new HashMap<>());
        }

        Map<Film, Rating> thisFilmRating = personFilmRating.get(person);
        thisFilmRating.put(film, rating);

        personFilmRating.put(person, thisFilmRating);


        List<Rating> ratings = new ArrayList<>();
        ratings.add(rating);

        if (!filmRatings.containsKey(film)){
            filmRatings.put(film, ratings);
        } else {
            filmRatings.get(film).add(rating);
        }

    }

    public Rating getRating(Person person, Film film) {
        if (!personFilmRating.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        }

        return personFilmRating.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!personFilmRating.containsKey(person)) {
            personFilmRating.put(person, new HashMap<>());
        }

        return personFilmRating.get(person);
    }

    public List<Person> reviewers() {
        List<Person> reviewersList = new ArrayList<>();

        for (Person p : personFilmRating.keySet()) {
            reviewersList.add(p);
        }

        return reviewersList;
    }

    public List<Rating> getRatings(Film film) {
        List<Rating> allRatings = new ArrayList<>();

        for (Rating r : filmRatings.get(film)) {
            allRatings.add(r);
        }

        return allRatings;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

}
