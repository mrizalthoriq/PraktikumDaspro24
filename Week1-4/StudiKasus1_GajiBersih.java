public class StudiKasus1_GajiBersih {
    public static void main(String[] args) {

        int gajiPokokPerBulan = 5000000;
        int jumlahAnak = 4;
        int tunjanganAnak = 100000;
        double potonganDanaPensiun = 0.1;

        double potonganGaji = gajiPokokPerBulan * potonganDanaPensiun;
        double totalTunjanganAnak = jumlahAnak * tunjanganAnak;
        double gajiBersih = totalTunjanganAnak + gajiPokokPerBulan - potonganGaji;

        System.out.print("Gaji bersih yang diterima Pak Danur adalah sebesar Rp." + 
        (gajiBersih));

    }
}