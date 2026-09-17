public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setDoors(4);
        car.setModel("Model Z");
        car.setColor("Pink");
        car.setConvertible(false);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("It is " + (car.isConvertible() ? "" : "not ") + "convertible");

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setDoors(2);
        targa.setModel("Targa");
        targa.setColor("Pink");
        targa.setConvertible(true);

        targa.describeCar();
    }
}