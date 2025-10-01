public class Method {

    static void greet() {
        System.out.println("Hello, World!");
    }

    static void saySomething(String message) {
        System.out.println(message);
    }

    static void calculateRectangleArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static String getStudentInfo(String name, int grade) {
        return "Name: " + name + ", Grade: " + grade;
    }

    static boolean ageCheck(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        greet();

        System.out.println("Main method executed.");

        saySomething("Halo selamat datang di Java!");
        saySomething("Saya suka belajar Java.");

        calculateRectangleArea(12, 8);

        double result = calculateCircleArea(0.5);
        System.out.printf("Area of circle: %.2f%n", result);

        String studentInfo = getStudentInfo("Alice", 10);
        System.out.println(studentInfo);

        boolean isAdult = ageCheck(20);
        System.out.println("Is adult: " + isAdult);
    }

}