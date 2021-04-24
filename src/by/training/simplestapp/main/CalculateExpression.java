package by.training.simplestapp.main;

public class CalculateExpression {
    public static void main(String[] args) {
    //calculate the value of an expression a^2-(b-c)^2
        double a = 4;
        double b = 7;
        double c = 12;

    //value in parentheses
        double p = b - c;

    //displaying result to console

        System.out.println("Result = " + (Math.pow(a, 2) - Math.pow(p, 2)));

    }
}
