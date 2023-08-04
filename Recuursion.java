package Handson;

public class Recuursion  {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        double base = 2.5;
        int exponent = 3;
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
