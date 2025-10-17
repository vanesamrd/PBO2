package UTS;

public abstract class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}


