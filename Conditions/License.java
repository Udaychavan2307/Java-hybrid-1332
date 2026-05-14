import java.util.Scanner;

class Licence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 75) {
            System.out.println("You are age bar and not eligible for licence.");
        }
        else if (age >= 18) {
            System.out.println("You are eligible for licence.");
        }
        else {
            int years = 18 - age;
            System.out.println("You are not eligible for licence.");
            System.out.println("Wait for " + years + " years for licence.");
        }
    }
}
