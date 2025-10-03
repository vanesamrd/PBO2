public class TugasAnggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;
    
    public TugasAnggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }
    
    public String getNomorKTP() {
        return nomorKTP;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }
    
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPeminjaman) {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }
    
    public void angsur(int jumlah) {
        if (jumlah < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
            System.out.println("Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }
}
