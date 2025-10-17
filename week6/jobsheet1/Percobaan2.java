public class Percobaan2 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        ClassA jumlah = new ClassA();
        jumlah.setX (20);
        jumlah.setY(30);
        hitung.setZ(5);
        jumlah.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}
