class Student {
    // variables
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        // assigning values
        s1.name = "Rahul";
        s1.age = 20;

    
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
