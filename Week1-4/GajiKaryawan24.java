import java.util.Scanner;

public class GajiKaryawan24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji, tunjTransp = 600000, tunjMkn = 400000;
        
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;

        totGaji= gajiPokok + tunjTransp + tunjMkn + bonus - (0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int)totGaji);
        sc.close();
    }
}
