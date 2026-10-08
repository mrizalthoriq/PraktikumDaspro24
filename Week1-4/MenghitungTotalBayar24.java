import java.util.Scanner;

public class MenghitungTotalBayar24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double  harga, potongan, jmlh_bayar, diskon = 0.15;

            System.out.print("Masukkan Harga: ");
            harga = sc.nextInt();

            potongan = harga * diskon;
            jmlh_bayar = harga - potongan;

            System.out.print("Jumlah yg harus di bayar " + jmlh_bayar);

        sc.close();
    }
}
