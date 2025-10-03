public class Koperasidemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar"); //modif no.4
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan()); //modif percobaan 4
        anggota1.setNama("Iwan setiawan");
        anggota1.setAlamat("Jalan SuSkarno Hatta no 10");
        anggota1.setor(100000);
        
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}