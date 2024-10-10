import java.util.Scanner;
public class TempatParkir12{
    public static void main(String [] args) {
        Scanner sc12 =new Scanner(System.in);

        int jeniskendaraan, durasi, total = 0;

        do {
            System.out.println("Jenis Kendaraan");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. 0 (keluar )");
            System.out.println("Masukkan angar dari jenis kendaraan yang dipilih = ");
            jeniskendaraan = sc12.nextInt();
            System.out.print("Masukkan durasi parkir");
            durasi = sc12.nextInt();
            
            if (jeniskendaraan == 1 && jeniskendaraan == 2){
                System.out.print("Durasi parkir: " + durasi);
            } if (durasi >5){
                total += 12500;
                System.out.println("Total: " + total);
            } else if (jeniskendaraan == 1){
                total += durasi * 3000;
                System.out.println("Total: " + total);
            } else if (jeniskendaraan == 2){
                total += durasi * 2000;
                System.out.println("Total: " + total);
            } else if (jeniskendaraan == 3){
                System.out.print("Anda keluar dari parkiran");
            }
        } while (jeniskendaraan !=0);
        System.out.println("Total keseluruhan: " + total);
    }
}