import java.util.Scanner;

public class TotalBiaya24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xlembar;
        double hargaLembaran = 500, hargaPenjilidan = 5000, totHarga, totLembaran;

        System.out.print("Banyak lembar: ");
            xlembar = sc.nextInt();

        totLembaran = xlembar * hargaLembaran;
        totHarga = totLembaran + hargaPenjilidan;

        System.out.printf("Total biaya yang harus dibayar Rp.%.2f", totHarga);

        sc.close();

    }
}
