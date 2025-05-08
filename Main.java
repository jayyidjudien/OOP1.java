package package1;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Supir supir1 = new Supir("S001", "Joko", "12345");
        Mobil mobil1 = new Mobil("M001", "Avanza", "B 123 ABC", "Toyota");

        Date sekarang = new Date();
        Rental rental1 = new Rental(mobil1, supir1, sekarang);

        System.out.println("Data Rental Awal:");
        System.out.println(rental1);

        Date besok = new Date(sekarang.getTime() + (24 * 60 * 60 * 1000)); // Tambah 1 hari
        rental1.setTanggalKembali(besok);

        System.out.println("\nData Rental Setelah Pengembalian:");
        System.out.println(rental1);
        System.out.println("\nStatus Mobil Setelah Pengembalian:");
        System.out.println(mobil1);
    }
}
