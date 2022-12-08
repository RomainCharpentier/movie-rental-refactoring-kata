package movierental;

public abstract class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie of(String title, int priceCode) {
        return switch (priceCode) {
            case 1 -> new NewReleaseMovie(title);
            case 2 -> new RegularMovie(title);
            default -> new ChildrenMovie(title);
        };
    }

    abstract Amount getPriceAccordingToRentDuration(int rentDuration);

    public int getBonusOfPoints(int rentDuration) {
        return 1;
    }

    public String getTitle() {
        return title;
    }
}
