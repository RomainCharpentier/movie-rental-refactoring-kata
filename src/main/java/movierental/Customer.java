package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        var totalAmount = new Amount();

        var resultBuilder = new StringBuilder("Rental Record for " + name + "\n");
        var frequentRenterPoints = new RenterPoints();
        for (var rent : rentals) {
            resultBuilder.append("\t").append(rent);
            resultBuilder.append("\n");

            var rentPrice = rent.getPriceAccordingToRentDuration();
            totalAmount = totalAmount.addAmount(rentPrice);
            frequentRenterPoints = frequentRenterPoints.addPoints(rent.getBonusOfPoints());
        }
        // add footer lines
        resultBuilder.append("Amount owed is ").append(totalAmount);
        resultBuilder.append("\n");
        resultBuilder.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return resultBuilder.toString();
    }
}
