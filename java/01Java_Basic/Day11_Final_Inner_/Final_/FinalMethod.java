public class FinalMethod {

    private final String name/* = "Han Lu"*/;

    public Person() {
        name = "XiaoTong Guan";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}