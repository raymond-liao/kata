public class GameNumber {
    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedBy(3) && isRelatedBy(5)) {
            return "FizzBuzz";
        }
        if (isRelatedBy(3)) {
            return "Fizz";
        }

        if (isRelatedBy(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isRelatedBy(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
