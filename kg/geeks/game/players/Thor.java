package kg.geeks.game.players;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN_DAMAGE, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {

        }
        return 0;
    }
}
