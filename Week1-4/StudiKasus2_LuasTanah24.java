import java.util.Scanner;

public class StudiKasus2_LuasTanah24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    
        int l, p, d, s;

        System.out.print("Lebar tanah\t:");
            l = sc.nextInt();
        System.out.print("Panjang tanah\t:");
            p = sc.nextInt();
        System.out.print("Diameter kolam\t:");
            d = sc.nextInt();
        System.out.print("Sisi taman\t:");
            s = sc.nextInt();
        sc.close();

        double luasTanah = l * p;
        double rLingkaran = d / 2.0;
        double luasKolam = Math.PI * Math.pow(rLingkaran, 2);
        double luasTaman = Math.pow(s, 2);
        double sisaLTanah = luasTanah - (luasKolam + luasTaman);

        System.out.printf("Luas tanah yg tidak digunakan Pak Tono adala %.2fm².", sisaLTanah );

    } 
}
