

public class Game {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Xi Ai"); 

    
//        hero.setSkill(new SkillImpl()); 

        //or
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero.setSkill(skill);

        // 
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu~Pia~");
            }
        });

        hero.attack();
    }

}
