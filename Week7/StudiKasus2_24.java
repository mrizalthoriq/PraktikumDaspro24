package PraktikumDaspro24.Week7;
import java.util.Scanner;
public class StudiKasus2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jmlhDokumen, peringkat, statusPKM;
        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine().trim().toUpperCase();
        System.out.print("Jumlah jumlah dokumen: ");
        jmlhDokumen = sc.nextInt();
        
        if (jenisKegiatan.equals("BELMAWA")||jenisKegiatan.equals("BAKORAMA")||jenisKegiatan.equals("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            peringkat = sc.nextInt();
            
            if (jmlhDokumen >= 4) {
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Lolos dana penghargaan");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                };
            } else {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jmlhDokumen) + " dokumen). Dana penghargaan tidak diberikan");
            }
        } else if (jenisKegiatan.equals("PKM")) {
            System.out.print("Status pendanaan, 1 = lolos, 0 = tidak lolos (1/0) : ");
            statusPKM = sc.nextInt();
            
            if (statusPKM == 1) {
                System.out.println("Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
            } else {
                System.out.println("Tidak berhak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
        } else {
            System.out.println("Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
        sc.close();
    }
}