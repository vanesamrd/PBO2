public class Mobil {
    private String merk;
    private int biaya;

    Mobil() {

    }

    public void setMerk(String nama) {
        merk =  nama;
    }

    public String getNama() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
