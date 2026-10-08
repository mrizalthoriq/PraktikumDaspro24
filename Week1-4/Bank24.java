import java.util.Scanner;

public class Bank24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, prosentasse_bunga = 0.02;

        System.out.print("Masukkan tabungan awal\t:");
        jml_tabungan_awal = sc.nextInt();
        System.out.print("Lama menabung\t\t:");
        lama_menabung = sc.nextInt();

        sc.close();

        bunga = lama_menabung * prosentasse_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Jumlah bungat\t\t:" + (bunga));
        System.out.println("Jumlah tabungan akhir\t:" + (jml_tabungan_akhir));

    }
}
