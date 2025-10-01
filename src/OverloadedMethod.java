public class OverloadedMethod {

    // public static void main(String[] args) {
    // System.out.println(add(5, 10));
    // System.out.println(add(5.5, 10.2, 3.3));
    // }

    // static double add(double a, double b) {
    // return a + b;
    // }

    // static double add(double a, double b, double c) {
    // return a + b + c;
    // }

    public static void main(String[] args) {
        String pizza = bakePizza("Flat Bread");
        System.out.println(pizza);

        pizza = bakePizza("Flat Bread", "Mushrooms");
        System.out.println(pizza);

        pizza = bakePizza("Flat Bread", "Mushrooms", "Mozzarella");
        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + " Pizza";
    }

    static String bakePizza(String bread, String topping) {
        return bread + " Pizza with " + topping;
    }

    static String bakePizza(String bread, String topping, String cheese) {
        return bread + " Pizza with " + topping + " and " + cheese;
    }
}