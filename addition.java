import java.util.Scanner;

public class OnlineTeaching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to Online Teaching Platform ===");
        System.out.println("Choose your subject:");

        System.out.println("1. Math");
        System.out.println("2. Physics");
        System.out.println("3. Chemistry");
        System.out.println("4. Biology");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                showMathCourses();
                break;
            case 2:
                showPhysicsCourses();
                break;
            case 3:
                showChemistryCourses();
                break;
            case 4:
                showBiologyCourses();
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 4.");
        }

        System.out.println("\nThank you for using the Online Teaching Platform.");
        input.close();
    }

    static void showMathCourses() {
        System.out.println("\n-- Math Courses --");
        System.out.println("1. Algebra Basics");
        System.out.println("2. Geometry Fundamentals");
        System.out.println("3. Trigonometry");
        System.out.println("4. Calculus Introduction");
    }

    static void showPhysicsCourses() {
        System.out.println("\n-- Physics Courses --");
        System.out.println("1. Mechanics");
        System.out.println("2. Thermodynamics");
        System.out.println("3. Waves and Oscillations");
        System.out.println("4. Electricity and Magnetism");
    }

    static void showChemistryCourses() {
        System.out.println("\n-- Chemistry Courses --");
        System.out.println("1. Atomic Structure");
        System.out.println("2. Chemical Bonding");
        System.out.println("3. Organic Chemistry Basics");
        System.out.println("4. Thermochemistry");
    }

    static void showBiologyCourses() {
        System.out.println("\n-- Biology Courses --");
        System.out.println("1. Cell Biology");
        System.out.println("2. Genetics");
        System.out.println("3. Human Anatomy");
        System.out.println("4. Ecology and Environment");
    }
}
