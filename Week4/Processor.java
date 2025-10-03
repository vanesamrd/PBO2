public class Processor {
    private String merk;
    private double cache;

    Processor() {
    }

    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merek) {
        merk = merek;
    }

    public String getMerk() {
        return merk;
    }

    public void setCache(double chc) {
        cache = chc;
    }

    public double getCache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %s\n", cache);
    }
}
