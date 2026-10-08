import java.util.Scanner;
public class TugasParkir24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarif = 0;
        System.out.println("=== Tarif parkir perjam ===");
        System.out.print("Lama parkir kendaraan(roda dua): ");
        int lamaParkir = sc.nextInt();

        if (lamaParkir > 2){
            tarif = (lamaParkir - 2) * 1000 + 2000;
        } else {
            tarif = 2000;
        }

        System.out.println("==================================");
        System.out.println("Tarif parkir: " + tarif);

        sc.close();
        
    }
}