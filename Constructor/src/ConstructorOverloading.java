class HumaN {

    private int age;
    private String name;

    public HumaN() {            // default Constructor
        age = 19;
        name = "Aarya";
    }

    public HumaN(int a, String n) {         //Parametrized Constructor
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        HumaN obj = new HumaN();
        HumaN obj1 = new HumaN(14, "Krishna");

//        obj.setAge(19);
//        obj.setName("Aarya");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}