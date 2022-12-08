package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Amount getPriceAccordingToRentDuration() {
        return movie.getPriceAccordingToRentDuration(daysRented);
    }

    public int getBonusOfPoints() {
        return movie.getBonusOfPoints(daysRented);
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    @Override
    public String toString() {
        return getMovieTitle() +
                "\t" +
                movie.getPriceAccordingToRentDuration(daysRented);
    }
}
