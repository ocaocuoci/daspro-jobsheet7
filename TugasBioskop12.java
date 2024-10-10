import java.util.Scanner;
public class TugasBioskop12{
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);

        double totalTiket = 0, totalHarga = 0, diskon, totalPenjualan = 0.0;
        int tiket = 0, pelanggan, i = 1;
        
        System.out.println("--- REKAP TOTAL PENJUALAN TIKET BIOSKOP ---/n");
        System.out.println("Masukkan jumlah pelanggan dalam sehari: ");
        pelanggan = input12.nextInt();

        while (i <= pelanggan) {
            System.out.print("Masukkan jumlah pembelian tiket pelanggan ke-" + i + ": ");
            tiket = input12.nextInt(); 

            if (tiket < 0){
                System.out.print("Tidak valid. Masukkan jumlah tiket dengan benar");
                continue;
            }
            totalHarga = tiket * 50000;

            if (tiket > 4 && tiket <= 10){
                diskon = (1.0 - 0.1);
                totalHarga *= diskon;
            } else if (tiket > 10){
                diskon = (1.0 - 0.15);
                totalHarga *= diskon;
            } else {
                diskon = (1.0 - 0.0);
                totalHarga *= diskon;
            }
            i++;
            System.out.println("Harga tiket yang dibayar: " + totalHarga );
            totalTiket += tiket;
            totalPenjualan += totalHarga;

        }  
        System.out.println("--- REKAP TOTAL PENJUALAN TIKET BIOSKOP ---/n");
        System.out.println("Jumlah tiket (dalam sehari): " + totalTiket);
        System.out.println("Total pemasukan (dalam sehaari): " + totalPenjualan);
        System.out.println("---------------------------------------------");
    }
}