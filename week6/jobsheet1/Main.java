public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(3);
        
        Dosen dosen1 = new Dosen("001", "Dr. Ahmad Wijaya", "Jl. Merdeka No. 10");
        dosen1.setSKS(12);
        
        Dosen dosen2 = new Dosen("002", "Prof. Sari Dewi", "Jl. Sudirman No. 25");
        dosen2.setSKS(15);
        
        Dosen dosen3 = new Dosen("003", "Dr. Budi Santoso", "Jl. Gatot Subroto No. 5");
        dosen3.setSKS(10);
        
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);
        daftarGaji.addPegawai(dosen3);
        
        daftarGaji.printSemuaGaji();
    }
}
