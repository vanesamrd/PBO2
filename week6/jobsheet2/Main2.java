package jobsheet2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("DATA MAC");
        System.out.println("=========");
        Mac mac1 = new Mac("Apple MacBook Pro", 32, 16, "M2 Pro", "Lithium Polymer", "Touch ID");
        mac1.tampilMac();
        
        Mac mac2 = new Mac("Apple MacBook Air", 24, 8, "M1", "Lithium Polymer", "Face ID");
        mac2.tampilMac();
        
        System.out.println("DATA WINDOWS");
        System.out.println("============");
        Windows win1 = new Windows("Dell XPS 13", 28, 16, "Intel Core i7", "Lithium Ion", "Windows Hello");
        win1.tampilWindows();
        
        Windows win2 = new Windows("Lenovo ThinkPad", 26, 32, "Intel Core i9", "Lithium Polymer", "Cortana");
        win2.tampilWindows();
        
        System.out.println("DATA PC");
        System.out.println("=======");
        pc pc1 = new pc("ASUS ROG", 42, 32, "AMD Ryzen 9", 27);
        pc1.tampilPC();
        
        pc pc2 = new pc("HP Pavilion", 35, 16, "Intel Core i7", 24);
        pc2.tampilPC();
    }
}
