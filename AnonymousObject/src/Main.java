class A {

    public A() {
        System.out.println("Object Created");
    }

    public void show() {
        System.out.println("This is A show");
    }
}

public class Main {
    public static void main(String[] args) {

//        A obj = new A();
//        obj.show();

        new A().show();     // Anonymous Object
    }
}