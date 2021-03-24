package exemplu6multipleInheritance;

public class Hero extends ActionCharacter implements CanFly, CanSwim, CanFight {

//    @Override
//    public void canFight(String enemy) {
//        System.out.println("fight with " + enemy);
//    }

    @Override
    public void canFly() {
        System.out.println("fly");
    }

    @Override
    public void canSwim() {
        System.out.println("swim");
    }
}
