import java.util.Scanner;

public class Tugas1Pemilihan24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? true/false");
        boolean uktLunas = sc.nextBoolean();
        
        String pesan = uktLunas ? "Pembayaran UKT terverifikasi" : "Anak-anakRegistrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        
        sc.close();
    }
}
// System.out.println("--- Cetak KRS SIAKAD ---");
//         System.out.println("Apakah UKT sudah lunas? true/false");
//         boolean uktLunas = sc.nextBoolean();

//         if (uktLunas) {
//             System.out.println("Pembayaran UKT terverifikasi");
//             System.out.println("Silakan cetak KRS dan mint atanda tangan DPA");
//         }else {
//             System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
//         }
