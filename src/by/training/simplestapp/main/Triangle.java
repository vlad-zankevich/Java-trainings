package by.training.simplestapp.main;

public class Triangle {
    public static void main(String[] args) {
        //setting the variables of the cathets (a, b) and hypotenuse (c) for a right triangle

        int a = 11;
        int b = 15;

        //calculate a hypotenuse
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        //rounding a hypotenuse to 2 decimal places
        String c_rounded = String.format("%.2f", c);

        //calculate the area of the triangle s
        float s = (a * b) / 2;

        //displaying results:
        System.out.println("Hypotenuse length = " + c_rounded);
        System.out.println("Triangle area = " + s);

    }


}
