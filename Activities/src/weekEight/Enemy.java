package weekEight;

public class Enemy {private String name;
    private int health;
    private int strength;
    private static int enemyCount = 1;

    public Enemy(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        enemyCount++;
    }

    public static int getEnemyCount() {
        return enemyCount;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }
}
}
