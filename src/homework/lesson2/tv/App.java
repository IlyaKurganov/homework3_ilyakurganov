package homework.lesson2.tv;

public class App {
    public static void main(String[] args) {

        Televisor tv = new Televisor();
        tv.turnOn();
        tv.setRandomChannel();
        tv.setVolume(10);

        System.out.println(tv.toString());


    }
}
