package package1;

import java.util.Date;

public class Rental {
    private Mobil mobil;
    private Supir supir;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Rental(Mobil mobil, Supir supir, Date tanggalPinjam) {
        this.mobil = mobil;
        this.supir = supir;
        this.tanggalPinjam = tanggalPinjam;
        this.mobil.dipinjam(tanggalPinjam);
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Supir getSupir() {
        return supir;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
        this.mobil.dikembalikan(tanggalKembali);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "mobil=" + mobil +
                ", supir=" + supir +
                ", tanggalPinjam=" + tanggalPinjam +
                ", tanggalKembali=" + tanggalKembali +
                '}';
    }

}
