import java.util.ArrayList;
import java.util.List;

public class Number {

    public static int leastCommonMultiple(int first, int second) {
        //TODO improve performance
        if (first < 1 || second < 1) throw new RuntimeException();

        List<Integer> firstPrimes = primeFactors(first);
        List<Integer> secondPrimes = primeFactors(second);

        int i = 0;
        int j = 0;
        int lcm = 1;

        while (i < firstPrimes.size() && j < secondPrimes.size()) {
            int firstPrime = firstPrimes.get(i);
            int secondPrime = secondPrimes.get(j);

            if (firstPrime == secondPrime) {
                lcm *= firstPrime;
                i++;
                j++;
            } else if (firstPrime < secondPrime) {
                lcm *= firstPrime;
                i++;
            } else {
                lcm *= secondPrime;
                j++;
            }
        }

        while (i < firstPrimes.size()) {
            lcm *= firstPrimes.get(i);
            i++;
        }

        while (j < secondPrimes.size()) {
            lcm *= secondPrimes.get(j);
            j++;
        }
        return lcm;
    }

    /**
     * Euclidean Algorithm
     */
    public static int greatestCommonDivisor(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);

        //GCD(0, 0) = 0
        if (first == 0 || second == 0) {
            return Math.max(first, second);
        }
        int max = Math.max(first, second);
        int min = Math.min(first, second);

        int remainder = max % min;
        return greatestCommonDivisor(min, remainder);
    }

    public static List<Integer> primeFactors(int number) {
        //TODO improve performance
        List<Integer> primeFactors = new ArrayList<>();
        if (number < 0) throw new RuntimeException();
        if (number < 2) return primeFactors;

        int factor = 2;
        while (number > 1) {
            if (number % factor == 0) {
                primeFactors.add(factor);
                number = number / factor;
            } else {
                factor++;
            }
        }
        return primeFactors;
    }

    @Deprecated
    public static int depGreatestCommonDivisor(int first, int second) {
        if(first == 0 || second == 0) {
            return Math.max(first, second);
        }
        first = Math.abs(first);
        second = Math.abs(second);
        int max = Math.max(first, second);
        int min = Math.min(first, second);
        int limit = (int) Math.sqrt((double)min);

        for (int i = 1; i <= limit; i++) {
            if (min%i == 0 && max%(min/i) == 0) {
                return min/i;
            }
        }

        for (int i = limit; i > 1; i--) {
            if (min%i == 0 && max%(i) == 0) {
                return i;
            }
        }
        return 1;
    }

    public static long factorial(int number) {
        if (number < 2) {
            return 1;
        }
        return factorial(number-1) * number;
    }
}
