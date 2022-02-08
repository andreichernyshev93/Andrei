package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    int magicAtt;
    static final int HEAL_HIMSELF = 50;
    static final int HEAL_TEAMMATE = 30;

    public Shaman () {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - attack < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
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
}
