package movierental;

public class RenterPoints {
    private final int value;

    public RenterPoints() {
        this(0);
    }

    public RenterPoints(int value) {
        this.value = value;
    }

    public RenterPoints addPoints(int pointsToAdd) {
        return new RenterPoints(this.value + pointsToAdd);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
