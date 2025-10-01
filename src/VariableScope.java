public class VariableScope {

    int instanceVar = 5; // Instance variable
    static int staticVar = 15; // Static variable

    public static void main(String[] args) {
        int x = 10; // Local
        System.out.println("Value of x: " + x);

        exampleMethod();

        VariableScope obj = new VariableScope();
        System.out.println("Value of instanceVar: " + obj.instanceVar);
        System.out.println("Value of staticVar: " + VariableScope.staticVar);
    }

    static void exampleMethod() {
        int y = 20; // Local
        System.out.println("Value of y: " + y);
    }
}