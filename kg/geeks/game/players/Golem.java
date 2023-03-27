package kg.geeks.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.TAKING_DAMAGE, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {

            }
        }
        return 0;
    }
}
