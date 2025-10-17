public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;
    
    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
        jumlahPegawai = 0;
    }
    
    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Kapasitas daftar gaji penuh!");
        }
    }
    
    public void printSemuaGaji() {
        System.out.println("DAFTAR GAJI PEGAWAI");
        System.out.println("====================");
        for (int i = 0; i < jumlahPegawai; i++) {
            Pegawai p = listPegawai[i];
            System.out.println("Nama: " + p.getNama());
            System.out.println("Gaji: Rp " + p.getGaji());
            System.out.println("-------------------");
        }
    }
}
