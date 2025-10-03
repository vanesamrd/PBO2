public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;
    private int kecepatanMaksimal = 100;

    
      public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    //public void tambahKecepatan() {
      //  if (kontakOn == true) {
        //    kecepatan += 5;
       // } else {
       //     System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
        //}
    //}
    //modifikasi
     public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < kecepatanMaksimal) {
                kecepatan += 5;
                if (kecepatan > kecepatanMaksimal) {
                    kecepatan = kecepatanMaksimal; 
                }
            } else {
                System.out.println("Kecepatan sudah maksimal! Tidak bisa ditambah\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");
        }
    }


    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
            if (kecepatan < 0) {
                kecepatan = 0; 
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
        }
    }

     public int getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }

    public void setKecepatanMaksimal(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
    
}