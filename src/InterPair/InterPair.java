package InterPair;

    public interface InterPair {
        InterPair add(InterPair other);
        InterPair subtract(InterPair other);
        InterPair multiply(int n);
        InterPair divide(int n);

        int getFirst();
        int getSecond();
    }

