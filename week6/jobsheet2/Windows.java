package jobsheet2;

public class Windows extends Laptop {
    private String fitur;
    
    public Windows() {
    }
    
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindows() {
        tampilData();
        System.out.println("Jenis Baterai: " + jnsBatrei);
        System.out.println("Fitur: " + fitur);
        System.out.println("-------------------");
    }
}
