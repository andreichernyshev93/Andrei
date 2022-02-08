package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt;
    public Magician () {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
