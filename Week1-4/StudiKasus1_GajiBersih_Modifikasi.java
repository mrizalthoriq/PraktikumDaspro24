import java.util.Scanner;

public class StudiKasus1_GajiBersih_Modifikasi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int gajiPokokPerBulan, tunjanganAnak, jumlahAnak ;
        double potonganDanaPensiun = 0.1;

        System.out.print("Gaji pokok:");
        gajiPokokPerBulan = sc.nextInt();
        System.out.print("Tunjan anak perbulan:");
        tunjanganAnak = sc.nextInt();
        System.out.print("Jumlah anak:");
        jumlahAnak = sc.nextInt();
        
        sc.close();

        double potonganGaji = gajiPokokPerBulan * potonganDanaPensiun;
        double totalTunjanganAnak = jumlahAnak * tunjanganAnak;
        double gajiBersih = totalTunjanganAnak + gajiPokokPerBulan - potonganGaji;

        System.out.print("Gaji bersih yang diterima Pak Danur adalah sebesar Rp." + 
        (gajiBersih));

    }
}
