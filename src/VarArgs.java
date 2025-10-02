public class VarArgs {

    public static void main(String[] args) {
        sayHello("Eko", "Kurniawan", "Khannedy");
        sayHello("Eko", "Kurniawan");
        sayHello("Eko");
        sayHello();

        var result = add(1, 2, 3, 4, 5);
        System.out.println(result);
    }

    static int add(int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }

    static void sayHello(String... names) {
        if (names.length == 0) {
            System.out.println("Hello Bro!");
        } else {
            System.out.print("Hello ");
            for (var i = 0; i < names.length; i++) {
                System.out.print(names[i]);
                if (i < names.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}