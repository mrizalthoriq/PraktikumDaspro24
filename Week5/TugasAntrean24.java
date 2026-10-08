import java.util.Scanner;

public class TugasAntrean24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= Antrean digital ==========");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Suraat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");

        System.out.println("============================`========");
        
        System.out.print("Pilih layanan\t: ");
        int layanan = sc.nextInt();

        String tujuan = "";
        switch (layanan) {
            case 1:
                    tujuan = "Loket A";
                break;
            case 2:
                    tujuan = "Loket B";
                break;
            case 3:
                    tujuan = "Loket C";
                break;
            case 4:
                    tujuan = "Loket D";
                break;
            default:
                    tujuan = "Kode layanan tidak tersedia";
                break;
        }
        System.out.println("Tujuan\t\t: " + tujuan);

        sc.close();
    }
}