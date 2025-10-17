package UTS;

public class Barrier extends Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isDestroyed() {
        return strength <= 0;
    }

    @Override
    public void destroyed() {
        strength -= 9;
        if (strength < 9) strength = 0;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}

