class Mobile1 {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile1 mo1) {
        System.out.println(mo1.brand + " : " + mo1.price + " : " + name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        Mobile1 mo1 = new Mobile1();
        mo1.brand = "Apple";
        mo1.price = 1_50_000;
        Mobile.name = "SmartPhone";

        Mobile1 mo2 = new Mobile1();
        mo2.brand = "Samsung";
        mo2.price = 2_00_000;
        Mobile.name = "Fold";

        Mobile1.name = "Phone";

        mo1.show();
        mo2.show();

        Mobile1.show1(mo1);
    }
}