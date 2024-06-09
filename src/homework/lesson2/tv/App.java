package homework.lesson2.tv;

public class App {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.turnOn();
        tv.fullCheck();

        Televisor tv2 = new Televisor(true, 5, 5);
        tv2.fullCheck();

        Televisor tv3 = new Televisor(true, 6);
        tv3.fullCheck();
    }
}
