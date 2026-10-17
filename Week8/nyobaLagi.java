package PraktikumDaspro24.Week8;
import java.util.Scanner;
import java.text.DecimalFormat;

public class nyobaLagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");
        String nama;
        int jmlhPorsi, biayaAntar, hargaSeporsi = 25000;
        double diskon, sblmDiskon, nilaiDiskon, stlhDiskon, totalBayar;
        boolean status, statusPembayaran, statusLokasi;

        System.out.print("Nama pemesanan\t\t\t\t\t    : ");
        nama = sc.nextLine();
        System.out.print("Jumlah pemesanan\t\t\t\t    : ");
        jmlhPorsi = sc.nextInt();
        System.out.print("Lokasi pemesanan, didalam/diluar kampus (true/false): ");
        statusLokasi = sc.nextBoolean();
        System.out.println("========================================================");

        if (jmlhPorsi >= 1) {
            
            System.out.print("Berapa hari sebelum acara            : ");
            int hari = sc.nextInt();
            
            if (hari >= 3 && hari <= 30) {
                System.out.print("Status proposal/kegiatan (true/false): ");
                status = sc.nextBoolean();
                System.out.print("Status pembayaran (true/false)       : ");
                statusPembayaran = sc.nextBoolean();

                if (status == true || statusPembayaran == true) {
                    System.out.println("========================================================");
                    System.out.println("Pemesanan berhasil");
                    
                    sblmDiskon = jmlhPorsi * hargaSeporsi;

                    if (jmlhPorsi >= 1 && jmlhPorsi <= 49) {
                        diskon = 0;
                        nilaiDiskon =  sblmDiskon * diskon;
                    } else if (jmlhPorsi >= 50 && jmlhPorsi <= 100) {
                        diskon = 0.05;
                        nilaiDiskon =  sblmDiskon * diskon;
                    } else {
                        diskon = 0.1;
                        nilaiDiskon =  sblmDiskon * diskon;
                    }

                    stlhDiskon = sblmDiskon - nilaiDiskon;

                    if (statusLokasi == true || jmlhPorsi > 150) {
                        biayaAntar = 0;
                    } else {
                        biayaAntar = 30000;
                    }

                    totalBayar = stlhDiskon + biayaAntar;
                    
                    System.out.println("Nama pemesanan      : " + nama);
                    System.out.println("Jumlah pesanan      : " + jmlhPorsi);
                    System.out.println("Harga sebelum diskon: Rp." + df.format(sblmDiskon));
                    System.out.println("Persentase diskon   : " + diskon);
                    System.out.println("Diskon diperoleh    : Rp." + df.format(nilaiDiskon));
                    System.out.println("Harga setelah diskon: Rp." + df.format(stlhDiskon));
                    System.out.println("Biaya antar         : RP." + df.format(biayaAntar));
                    System.out.println("Total harga pesanan : Rp." + df.format(totalBayar));
                } else {
                    System.out.println("Pemesanan gagal: belum ada persetujuan proposal maupun pelunasan ");
                }
            } else {
                System.out.println("Pemesanan gagal: pemesanan harus dilakukan H-3 sampai H-30.");
            }
            
        } else {
            System.out.println("Pemesanan galgal: Jumlah porsi tidak valid");
        }
        sc.close();
    }
}