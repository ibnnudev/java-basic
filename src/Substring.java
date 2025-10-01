import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email, username, domain;

        System.out.print("Enter ur email: ");
        email = scanner.nextLine();

        if (!email.contains("@")) {
            System.out.println("Email isn't valid!");
        } else {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));

            System.err.println(username);
            System.err.println(domain);
        }

        scanner.close();
    }
}