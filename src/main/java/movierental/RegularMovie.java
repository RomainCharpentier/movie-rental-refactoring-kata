package movierental;

public class RegularMovie extends  Movie {
    public RegularMovie(String title) {
        super(title);
    }

    @Override
    Amount getPriceAccordingToRentDuration(int rentDuration) {
        var totalAmount = Amount.of(2);
        if (rentDuration > 2) {
            return totalAmount.addAmount(Amount.of((rentDuration - 2) * 1.5));
        }
        return totalAmount;
    }
}
