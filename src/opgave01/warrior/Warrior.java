package opgave01.warrior;
import opgave01.models.Character;
import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons;

    public Warrior(int level, String name) {
        super(level, name);
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }
}
