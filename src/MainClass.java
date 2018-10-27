import java.util.Scanner;

public class MainClass {

    private static int x = 3, a, b;

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("set [a,b]");
        System.out.println("set a");
        a = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("set b");
        b = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("set u");
        calc.setU(reader.nextInt());  // Scans the next token of the input as an int.
        reader.close();


        //checking
        if (x < a) {
           System.out.println( calc.calculateF1());
        }
        else
        if (x >= a && x <= b) {
            System.out.println(  calc.calculateF2());
        } else {
            System.out.println( calc.calculateF3());
        }
    }
}
