class Computer {

    public void playMusic() {

        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {

        return (cost < 10) ? "Minimum Cost is 10Rs" : "Pen";
    }
}
public class demo {

    public static void main(String[] args) {

        Computer obj = new Computer();

        obj.playMusic();
        System.out.println(obj.getMeAPen(9));

    }
}
