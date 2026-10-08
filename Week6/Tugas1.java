package Week6;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kamus = 50000, novel = 100000, bukuLain = 30000;
        double diskonKamus = 0.1, diskonNovel = 0.07, diskonLain = 0.05, diskonNus = 0.02;
        double totalHarga = 0, totalDiskon = 0;
        int jmlhBuku;

        System.out.print("Masukkan jenis buku: ");
        String jenis = sc.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jmlhBuku = sc.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {

            if (jmlhBuku > 2) {
                diskonKamus += diskonNus;
            } 
            totalHarga = jmlhBuku * kamus * (1 - diskonKamus);
            totalDiskon = jmlhBuku * kamus * diskonKamus;

        } else if (jenis.equalsIgnoreCase("novel")) {

            if (jmlhBuku > 3) {
                diskonNovel += diskonNus;
            } else {
                diskonNovel += 0.01;
            }
            totalHarga = jmlhBuku * novel * (1 - diskonNovel);
            totalDiskon = jmlhBuku * novel * diskonNovel;

        } else {

            if (jmlhBuku > 3) {
                totalHarga = jmlhBuku * bukuLain * (1 - diskonLain);
                totalDiskon = jmlhBuku * bukuLain * diskonLain;
            } else {
                totalHarga = jmlhBuku * bukuLain;
                totalDiskon = 0;
            }
        }
        System.out.println("Jumlah diskon: Rp" + totalDiskon);
        System.out.println("Total harga yang perlu dibayar: Rp" + totalHarga);
        
        sc.close();
    }
}