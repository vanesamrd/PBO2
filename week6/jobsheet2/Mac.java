package jobsheet2;

public class Mac extends Laptop {
    private String security;
    
    public Mac() {
    }
    
    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    
    public void tampilMac() {
        tampilData();
        System.out.println("Jenis Baterai: " + jnsBatrei);
        System.out.println("Security: " + security);
        System.out.println("-------------------");
    }
}
