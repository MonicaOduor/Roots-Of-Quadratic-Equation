import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        System.out.println("\nWrite your quadratic function below in the format of ax^2 + bx + c where \n \t a is the coefficient of x^2 \n \t b is the coefficient of x \n \t c is the constant ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // QUADRATIC FORMULA
        // x = -b ± √(b² - 4ac) 
        //      -----------------
        //           2a
        double root = (((-b)+Math.sqrt((b*b - 4 * a * c)))/(2*a));

        System.out.println(root);


    }
}
