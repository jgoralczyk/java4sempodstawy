package zad4;

class TooFarException extends Exception {
    public TooFarException(int distance) {
        super("Jesteś za daleko (podano: " + distance + ")");
    }
}
