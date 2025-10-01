public class StringMethod {

    public static void main(String[] args) {
        String name = "Ibnu Dev     ";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("e");
        int lastIndex = name.lastIndexOf("v");

        System.out.println("length: " + length);
        System.out.println("char: " + letter);
        System.out.println("index: " + index);
        System.out.println("last index: " + lastIndex);
        System.out.println("uppercase: " + name.toUpperCase());
        System.out.println("lowercase: " + name.toLowerCase());
        System.out.println("trim: " + name.trim());
        System.out.println("replace: " + name.replace('u', 'h'));
        System.out.println("empty: " + name.isEmpty());

        String password = "Ibnu";
        if (password.equals("ibnu")) {
            System.out.println("Password valid!");
        } else {
            System.err.println("Password invalid!");
        }

        if (password.equalsIgnoreCase("ibnu")) {
            System.out.println("Password valid!");
        } else {
            System.err.println("Password invalid!");
        }
    }
}