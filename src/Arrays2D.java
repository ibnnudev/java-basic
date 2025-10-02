public class Arrays2D {

    public static void main(String[] args) {
        // String[][] members = {
        // { "Eko", "Kurniawan", "Khannedy" },
        // { "Budi", "Sukma", "Wijaya" },
        // { "Joko", "Susilo", "Santoso" }
        // };

        // for (String[] member : members) {
        // for (String name : member) {
        // System.out.print(name + " ");
        // }
        // System.out.println();
        // }

        char[][] telephone = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' }
        };

        for (int i = 0; i < telephone.length; i++) {
            for (int j = 0; j < telephone[i].length; j++) {
                System.out.print(telephone[i][j] + " ");
            }
            System.out.println();
        }
    }
}