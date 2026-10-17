package PraktikumDaspro24.Week8;
import java.util.Scanner;

public class UTS_24_Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama;
        int jmlhPorsi, hargaSblmDiskon, hargaNasi = 25000, biayaAntar;
        double diskon, hargaSetelahDiskon, totalBayar, hargaDiskon;
        Boolean status;
        
        System.out.print("Nama pemesan: ");
        nama = sc.nextLine();
        System.out.print("Jumlah pesanan: ");
        jmlhPorsi = sc.nextInt();
        System.out.print("Lokasi didalam kampus(true/false): ");
        status = sc.nextBoolean();


        if (jmlhPorsi >= 1) {

            hargaSblmDiskon = jmlhPorsi * hargaNasi;

            if (jmlhPorsi >= 1 && jmlhPorsi <= 49) {
                diskon = 0;
                hargaDiskon = 0;
            } else if (jmlhPorsi >=50 && jmlhPorsi <= 100) {
                diskon = 0.05;
                hargaDiskon = hargaSblmDiskon * diskon;
            } else {
                diskon = 0.1;
                hargaDiskon = hargaSblmDiskon * diskon;
            };

            hargaSetelahDiskon = hargaSblmDiskon - hargaDiskon;

            if (jmlhPorsi > 150 || status == true) {
                biayaAntar = 0;
            } else {
                biayaAntar = 30000;
            }

            totalBayar = hargaSetelahDiskon + biayaAntar;

                System.out.println("Nama panitia pemesannama: " + nama );
                System.out.println("Jumlah pesanan: " + jmlhPorsi);
                System.out.println("Total sebelum  diskon: " + hargaSblmDiskon);
                System.out.println("Persentase diskon: " + diskon);
                System.out.println("Diskon diperoleh: " + hargaDiskon);
                System.out.println("Nilai diskon: " + hargaSetelahDiskon);
                System.out.println("Biaya antar: " + biayaAntar);
                System.out.println("Total yang harus dibayar: " + totalBayar);
        
        } else {
            System.out.println("Jumlah porsi tidak valid");
        } 
        sc.close();
    }
}