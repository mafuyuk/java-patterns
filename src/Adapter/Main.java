package Adapter;

/**
 * Created by mafuyuk on 2016/12/04.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
