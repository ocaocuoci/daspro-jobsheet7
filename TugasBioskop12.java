import java.util.Scanner;
public class TugasBioskop12{
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);

        double totalTiket =0, totalHarga = 0, diskon;
        int tiket = 0, pelanggan, i = 0;
        
        System.out.println("--- REKAP TOTAL PENJUALAN TIKET BIOSKOP ---");
        System.out.println("Masukkan jumlah pelanggan dalam sehari: ");
        pelanggan = input12.nextInt();
        while (i < pelanggan) {
            System.out.print("Masukkan jumlah pembelian tiket pelanggan ke-" + i + ": ");
            tiket = input12.nextInt();
            if (tiket > 4) {
                 diskon = 0.9;
            } else if (tiket > 10) {
                 diskon = 0.85;
            } else {
                System.out.println("Tiket tidak valid");
                continue;
            }
            totalTiket += tiket;
            System.out.print("Jumlah tiket: " + totalTiket);
            totalHarga = totalTiket * 50000 * diskon;
            System.out.print("Total pemasukan: " + totalHarga);
        i++;
        } 
    }
}