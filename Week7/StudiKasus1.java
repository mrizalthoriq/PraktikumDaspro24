package PraktikumDaspro24.Week7;
import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        System.out.print("Jumlah cup\t: ");
        jumlahCup = sc.nextInt();
        System.out.print("Nominal bayar\t: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga\t:" + totalHarga);
        System.out.println("Diskon\t\t: " + diskon);
        System.out.println("Total bayar\t: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp." + kurang);
        }
        sc.close();
    }
}