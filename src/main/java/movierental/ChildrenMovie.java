package movierental;

public class ChildrenMovie extends  Movie {
    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    Amount getPriceAccordingToRentDuration(int rentDuration) {
        var totalAmount = Amount.of(1.5);
        if (rentDuration > 3) {
            return totalAmount.addAmount(Amount.of((rentDuration - 3) * 1.5));
        }
        return totalAmount;
    }
}
