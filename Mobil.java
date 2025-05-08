package package1;

import java.util.Date;

public class Mobil extends Entitas implements Rentable {
    private String nomorPolisi;
    private String merkMobil;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Mobil(String id, String nama, String nomorPolisi, String merkMobil) {
        super(id, nama);
        this.nomorPolisi = nomorPolisi;
        this.merkMobil = merkMobil;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    @Override
    public void dipinjam(Date tanggal) {
        this.tanggalPinjam = tanggal;
    }

    @Override
    public void dikembalikan(Date tanggal) {
        this.tanggalKembali = tanggal;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "nomorPolisi='" + nomorPolisi + '\'' +
                ", merkMobil='" + merkMobil + '\'' +
                ", nama='" + getNama() + '\'' +
                '}';
    }
}
