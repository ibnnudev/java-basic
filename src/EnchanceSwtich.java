import java.util.Scanner;

public class EnchanceSwtich {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan hari (contoh: Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu): ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "senin", "selasa", "rabu", "kamis", "jumat" -> System.out.println("Hari kerja");
            case "sabtu", "minggu" -> System.out.println("Hari libur");
            default -> System.out.println("Bukan hari yang valid");
        }

        scanner.close();
    }
}