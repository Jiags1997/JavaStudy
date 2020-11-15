package demo09;

public class Demo09Test {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("鸣人");
        hero.setAge(16);
        Weapon weapon=new Weapon("螺旋丸");
        hero.setWeapon(weapon);
        hero.attack();

    }
}

