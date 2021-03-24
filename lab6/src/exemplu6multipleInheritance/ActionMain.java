package exemplu6multipleInheritance;

public class ActionMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.canFly();
        hero.canFight("enemy1");
        hero.canSwim();

        CanSwim swim = new Hero();
        swim.canSwim();

        CanFight fight = new Hero();
        fight.canFight("enemy2");

        CanFly fly = new Hero();
        fly.canFly();

        ActionCharacter actionCharacter = new Hero();
        actionCharacter.canFight("enemy3");

    }
}
