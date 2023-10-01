// 12S23014 - Mikhael ValenTino Gultom

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, ac, lantai, ketersediaanteknologi, status;
        int kapasitasgudang, jumlahbuku, skor;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbuku = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbuku / kapasitasgudang * 100);
        if (skor >= 40) {
            status = "Gudang Elit";
        } else {
            if (skor >= 25) {
                status = "Gudang Standar";
            } else {
                if (skor < 25) {
                    status = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang");
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbuku + "|" + ac + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + status);
    }
}
