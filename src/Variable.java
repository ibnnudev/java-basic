public class Variable {

    public static void main(String[] args) {
        // Primitive vs Reference
        // ---------    ----------------
        // int          string
        // float        class
        // double       array
        // boolean      interface

        // declaration
        String hero = "Deadpool";
        int power = 100;

        System.out.println("My hero is " + hero);
        System.out.println("My hero power is " + power);

        // assignment
        hero = "Spiderman";
        power = 80;

        System.out.println("My hero is " + hero);
        System.out.println("My hero power is " + power);

        // array
        String [] heroes = {"Deadpool", "Spiderman", "Wolverine"};
        System.out.println("My hero is " + heroes[0]);
        System.out.println("My hero is " + heroes[1]);
        System.out.println("My hero is " + heroes[2]);

    }
}