package Week6;
import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean status, sanksi;
        int nilaiDasPro = 0, nilaiWawancara = 0;

        System.out.println("=== Seleksi Asisten Dosen ===");

        System.out.print("Apakah status mahasiswa aktif? (Y/N)\t\t\t: ");   
        String inputStatus = sc.nextLine();
        status = inputStatus.equalsIgnoreCase("y");

        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (Y/N) : ");
        String inputSanksi = sc.nextLine();
        sanksi = inputSanksi.equalsIgnoreCase("y");
        System.out.println("==============================");

        if (status && !sanksi) {
            System.out.println("Tahap 2");
            System.out.print("Masukkan nilai Dasar Pemrograman\t\t\t : ");
            nilaiDasPro = sc.nextInt();
            sc.nextLine();

            System.out.print("Isi jika memiliki sertifikat kompetensi pemrograman (Y/N): ");
            String inputsertifikat = sc.nextLine();
            boolean sertifikat = inputsertifikat.equalsIgnoreCase("y");
            System.out.println("==============================");

            if (nilaiDasPro >= 80 || sertifikat) {
                System.out.println("Tahap 3");
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextInt();
                System.out.println("==============================");

                if (nilaiWawancara >= 75) {
                    System.out.println("Kamu Diterima Sebagai Asisten Praktikum");
                } else {
                    System.out.println("Kamu tidak memenuhi syarat wawancara");
                }
            } else {
                System.out.println("Kamu tidak memenuhi syarat nilai atau sertif dasar pemrograman");
            }

        } else {
            System.out.println("Mahasiswa tidak memenuhi syarat: \nMahasiswa Tidak Aktif atau Sedang Mendapat Sanksi Akademik");
        }
        sc.close();
    }
}