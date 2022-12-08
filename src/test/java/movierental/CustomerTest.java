package movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void test() {
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(Movie.of("Jaws", 2), 2));
        customer.addRental(new Rental(Movie.of("Golden Eye", 2), 3));
        customer.addRental(new Rental(Movie.of("Short New", 1), 1));
        customer.addRental(new Rental(Movie.of("Long New", 1), 2));
        customer.addRental(new Rental(Movie.of("Bambi", 3), 3));
        customer.addRental(new Rental(Movie.of("Toy Story", 3), 4));

        String expected = "" +
                "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";

        Assert.assertEquals(expected, customer.statement());
    }
}