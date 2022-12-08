package movierental;

public class NewReleaseMovie extends  Movie {
    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public Amount getPriceAccordingToRentDuration(int rentDuration) {
        return Amount.of(rentDuration * 3);
    }

    @Override
    public int getBonusOfPoints(int rentDuration) {
        var bonusIfOver2Days = rentDuration > 1;
        if (bonusIfOver2Days) {
            return 2;
        }
        return 1;
    }
}
