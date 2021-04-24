package by.training.simplestapp.main;

public class CalculateTwoExpressions {
    public static void main(String[] args){
    //set variables a, b, c, d

        double a = 5;
        double b = 7;
        double c = 9;
        double d = 2;

    //calculate (b+sqrt(b^2+4a*c)2a-a^3*c+b
        if (a != 0) {
            double sqrtValue = Math.pow(b, 2) + 4 * a * c;
            if (sqrtValue < 0) {
                System.out.println("The root expression is less than zero");
            } else {
                double fractionValue = (b + Math.sqrt(sqrtValue)) / (2 * a);
                //System.out.println(sqrtValue);
                //System.out.println(fractionValue);
                System.out.println("The first expression Result is: " + ((fractionValue - ((Math.pow(a, 3) * c)) + b)));
            }
        } else {
            System.out.println("Denominator equals zero");
        }

    //calculate a/c * b/d - (a*b - c)/c*d
        if (c != 0) {
            if (d != 0) {
                double firstPart = (a / c) * (b / d);
                double secondPart = ((a * b) - c) / (c * d);
                //System.out.println(firstPart);
                //System.out.println(secondPart);
                System.out.println("The second expression Result is: " + (firstPart - secondPart));
            } else {
                System.out.println("Denominator equals zero");
            }
        } else {
            System.out.println("Denominator equals zero");
        }

    }
}
