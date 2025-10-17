package UTS;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println("=== Kondisi Awal ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(">> Serangan ke-" + i);
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            if (wz.isDead()) System.out.println("WalkingZombie kalah!");
            if (jz.isDead()) System.out.println("JumpingZombie kalah!");
            if (b.isDestroyed()) System.out.println("Barrier hancur!");

            System.out.println();
        }

        System.out.println("=== Kondisi Akhir ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
    }
}



