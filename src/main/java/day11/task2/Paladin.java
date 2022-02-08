package day11.task2;

public class Paladin extends Hero implements Healer {
    static final int HEAL_HIMSELF = 25;
    static final int HEAL_TEAMMATE = 10;


    public Paladin () {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {

        if (health + HEAL_HIMSELF > MAX_HEALTH){
            health = MAX_HEALTH;
        } else {
            health += HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {

        if (hero.health + HEAL_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
