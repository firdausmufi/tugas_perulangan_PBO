public class Looping {
    public static void main(String[] args) {
        System.out.println("Saya semangat belajar Java (sebanyak 10 baris)");

        // Looping deret angka 2 4 6 8 10 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Looping deret angka 9 6 3 0 -3 -6
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Looping perkalian dengan output
        for (int i = 5; i <= 10; i++) {
            System.out.println(i + " x " + i + " = " + (i * i));
        }

        // Looping deret angka 1 3 6 10 15 21 28 36
        for (int i = 1; i <= 8; i++) {
            System.out.print(i * 3 + " ");
        }
        System.out.println();
    }
}
