import java.util.Scanner;

public class ShoppingPizza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPizza = 15.99;

        System.out.print("Welcom to Domino's Pizza!\n");

        System.out.print("Enter the number of pizzas you want to order: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the delivery distance in kilometers: ");
        double distance = scanner.nextDouble();

        double totalPrice = pricePerPizza * quantity;
        double deliveryFee = 0;
        if (distance <= 3) {
            deliveryFee = 5.00;
        } else if (distance <= 6) {
            deliveryFee = 7.50;
        } else {
            deliveryFee = 10.00;
        }

        double finalAmount = totalPrice + deliveryFee;
        System.out.printf("Total Price: $%.2f\n", totalPrice);
        System.out.printf("Delivery Fee: $%.2f\n", deliveryFee);
        System.out.printf("Final Amount to Pay: $%.2f\n", finalAmount);

    }
}