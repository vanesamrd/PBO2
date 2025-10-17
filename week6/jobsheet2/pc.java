package jobsheet2;

public class pc extends Komputer{
    private int ukuranMonitor;
    
    public pc() {
    }
    
    public pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPC() {
        tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
        System.out.println("-------------------");
    }
}
