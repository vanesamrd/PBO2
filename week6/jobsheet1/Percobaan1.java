public class Percobaan1 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        ClassA jumlah = new ClassA();
        jumlah.x = 20;
        jumlah.y = 30;
        hitung.z= 5;
        jumlah.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}
