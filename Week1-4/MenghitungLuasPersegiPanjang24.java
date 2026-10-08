import java.util.Scanner;

public class MenghitungLuasPersegiPanjang24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int p, l, L;

        System.out.println("Menghitung luas persegi panjang");
        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();
        
        L = p * l;

        System.out.print(String.format("Luas persegi panjangnya: %d", L));
        sc.close();
    }
}
