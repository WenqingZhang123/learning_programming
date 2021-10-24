package Class_Interface_Part_.Demo01;
public class Test {
    public static void main(String[] args) {
        
        Hero hero = new Hero();
        
        hero.setName("Garen");
        hero.setAge(20);

        
        Weapon weapon = new Weapon("AK-47");
        
        hero.setWeapon(weapon);

        
        hero.attack();
    }
}
