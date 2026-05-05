class Calculator {

    // METHOD DEFINITION
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}

public class Main {

    public static void main(String[] args) {

       
        Calculator c1 = new Calculator();

        // METHOD CALLING
        c1.add(10, 20);
    }
}
