// 12S23014 - Mikhael ValenTino Gultom

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String judul, matkul, dosen, deadline, format, status, kode, rekomendasitugas;
        int tingkatkesulitan, harihinggadeadline;
        double prioritas;

        judul = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        deadline = input.nextLine();
        format = input.nextLine();
        status = input.nextLine();
        kode = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        if (prioritas > 3.0) {
            rekomendasitugas = "Penting!Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas < 3.0 && prioritas > 1.5) {
                rekomendasitugas = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas :" + toFixed(prioritas,2));
        System.out.println(judul + "|" + kode + "|" + matkul + "|" + dosen + "|" + deadline + "|" + format + "|" + status + "|" + rekomendasitugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
