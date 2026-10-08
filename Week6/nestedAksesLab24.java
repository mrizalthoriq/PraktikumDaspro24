package Week6;
import java.util.Scanner;

public class nestedAksesLab24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean mahasiswaAktif;
        boolean sedangDisanki;
        boolean punyaIzinDosen;
        boolean asistenLab;
        
        System.out.print("Status mahasiswa aktif (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Status mahasiswa sedang disanksi (true/false): ");
        sedangDisanki = sc.nextBoolean();
        System.out.print("Memiliki izin dosen (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Status mahasiswa asisten lab (true/false): ");
        asistenLab = sc.nextBoolean();
        
        if (mahasiswaAktif || !sedangDisanki) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi sayarat");
        }
    }
}