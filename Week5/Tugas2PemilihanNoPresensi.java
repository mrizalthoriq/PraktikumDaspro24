import java.util.Scanner;

public class Tugas2PemilihanNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlhSKS = 0;
        System.out.print("Masukkan jumlah SKS yang diambil: ");
        jmlhSKS = sc.nextInt();

        if (jmlhSKS > 24) {
            System.out.println("Melebihi batas");
        }else {
            System.out.println("KRS Valid");
        }

        sc.close();
    }
}
