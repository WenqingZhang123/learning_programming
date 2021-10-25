

public class Hero {
    private String name; // Hero's name
    private Skill skill; // Hero's skill

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("My name is: " + name + " Begin to release my skill: ");
        skill.use(); 
        System.out.println("Skill has been released! ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
    
}
