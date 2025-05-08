package package1;
import java.util.Date; 

public class Supir extends Entitas {
    private String NIP;

    public Supir(String id, String nama, String NIP) {
        super(id, nama);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String toString() {
        return "Supir{" +
                "NIP='" + NIP + '\'' +
                ", nama='" + getNama() + '\'' +
                '}';
    }
    
}

interface Rentable {
    void dipinjam(Date tanggal);
    void dikembalikan(Date tanggal);
}
