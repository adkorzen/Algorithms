public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        int commonDivisor = Number.greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / commonDivisor;
        this.denominator = denominator / commonDivisor;
    }

    public Rational plus(Rational other) {
        int commonDenominator = Number.leastCommonMultiple(this.denominator, other.denominator);
        int numeratorSum = commonDenominator * (this.numerator / this.denominator + other.numerator / other.denominator);

        return new Rational(numeratorSum, commonDenominator);
    }

    public Rational minus(Rational other) {
        int negativeNumerator = - other.numerator;
        return plus(new Rational(negativeNumerator, other.denominator));
    }

    public Rational times(Rational other) {
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new Rational(numerator, denominator);
    }

    public Rational divides(Rational other) {
        return times(new Rational(other.denominator, other.numerator));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass()) return false;
        Rational that = (Rational) other;
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;

    }
}
