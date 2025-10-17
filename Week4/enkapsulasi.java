public class enkapsulasi {
    public class Mahasiswa {
    private String nama; // data disembunyikan

    // setter untuk mengisi data
    public void setNama(String namaBaru) {
        nama = namaBaru;
    }

    // getter untuk mengambil data
    public String getNama() {
        return nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNama("Vanesa");
        System.out.println("Nama Mahasiswa: " + m.getNama());
    }
}

}
