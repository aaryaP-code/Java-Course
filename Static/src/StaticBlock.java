class Mobile2 {
    String brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
        System.out.println("This is Static Block");
    }

    public Mobile2() {
        brand = "";
        price = 20_000;
        System.out.println("This is Constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile2");
//        Mobile2 mob1 = new Mobile2();
//        mob1.brand = "Apple";
//        mob1.price = 1_50_000;
//        Mobile2.name = "SmartPhone";
//
//        Mobile2 mob2 = new Mobile2();
    }
}