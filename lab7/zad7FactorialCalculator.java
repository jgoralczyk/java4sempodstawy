public class zad7FactorialCalculator {

    public static long calculateFactorial(int n) {

        assert n >= 0 : "argument musi być liczbą nieujemną";

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("5! = " + calculateFactorial(5));
        System.out.println("0! = " + calculateFactorial(0));

        System.out.println("-3! = " + calculateFactorial(-3));
    }
}