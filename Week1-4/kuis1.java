import java.util.Scanner;

public class kuis1{
    public static void main(String[]args ){
        Scanner sc = new Scanner(System.in);

            String nama;
            int tarif = 1450, bebanTetap = 20000, jmlhPemakaian, biayaPemakaian;
            double ppj = 0.1, bsrPPJ, totalTagihan;

        System.out.print("Nama pelanggan: ");
        nama = sc.nextLine();
        System.out.print("Pemakaian listrik bulan lalu: ");
        int listrikBlnlalu = sc.nextInt();
        System.out.print("Pemakaian listrik bulan ini: ");
        int listriBlnini = sc.nextInt();

            jmlhPemakaian = listriBlnini - listrikBlnlalu;
            biayaPemakaian = jmlhPemakaian * tarif;
            bsrPPJ = biayaPemakaian * (double) ppj;
            totalTagihan =  biayaPemakaian + bsrPPJ + bebanTetap;

        System.out.println("Jumlah pemakaian(KWh): " + jmlhPemakaian);
        System.out.println("Biaya pemakaian: " + biayaPemakaian);
        System.out.println("Besar PPJ: " + bsrPPJ);  
        System.out.println("Total pemakaian: " + totalTagihan);  
        
        sc.close();
    }
}

// input nama pelanggan, pemakaian listri
// output jumlah pemakaian, biaya pemakaian, besar ppj, total pemakaian