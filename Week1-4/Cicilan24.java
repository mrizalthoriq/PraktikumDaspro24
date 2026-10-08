import java.util.Scanner;

public class Cicilan24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, z ;
        double bunga = 0.02, cicilanBulanan, sisa, hargaBunga;

        System.out.print("Masukkan Harga Laptop: ");
            x = sc.nextInt(); 
        System.out.print("Masukkan Jumlah Uang Muka: ");
            y = sc.nextInt(); 
        System.out.print("Masukkan Jangka Waktu Cicilan (Bulan): ");
            z = sc.nextInt(); 

        sisa = x - y;
        hargaBunga = sisa * bunga;
        cicilanBulanan = (sisa / z) + hargaBunga;


        System.out.printf("Cicilan yang harus Rina bayar sebesar Rp.%,.3f", cicilanBulanan);

        sc.close();

    }
}
