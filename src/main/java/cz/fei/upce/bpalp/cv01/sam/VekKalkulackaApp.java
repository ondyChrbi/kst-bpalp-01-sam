package cz.fei.upce.bpalp.cv01.sam;

import java.util.Scanner;

/**
 * Kalkulacka vypoctu veku podle pisne Paula McCartneyho
 *
 */
public class VekKalkulackaApp {
    public static void main(String[] args) {
        // Vytvorime si scanner, ktery nam umozni cist z konzole
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte svuj vek: ");
        int vekUzivatele = scanner.nextInt();

        // vypocty
        int vekDo64 = 64 - vekUzivatele;
        int vekOd14 = vekUzivatele - 14;

        // vypiseme vysledky
        System.out.println("64 let Vam bude za " + vekDo64 + " roků.");
        System.out.println("14 let Vam bylo pred" + vekOd14 + " roky.");
    }
}
