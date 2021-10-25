package Inner_.Demo01;
public class Body { //outside class

    public class Heart { // inner class

        // methods in inner class
        public void beat() {
            System.out.println("My heart is beating---BoomBoomBoom");
            System.out.println("My name is: " + name); 
        }

    }

    //class in outside class
    private String name;

    // methods in outside class
    public void methodBody() {
        System.out.println("methods in outside class");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
