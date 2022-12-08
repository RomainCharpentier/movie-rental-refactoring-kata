package movierental;

public class Amount {
    private final double value;

    public Amount() {
        this.value = 0;
    }

    public Amount(double value) {
        this.value = value;
    }

    public static Amount of(double value) {
        return new Amount(value);
    }

    public Amount addAmount(Amount amountToAdd) {
        return new Amount(value + amountToAdd.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
