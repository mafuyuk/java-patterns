package Adapter2;

import Adapter.PrintBanner;

/**
 * Created by mafuyuk on 2016/12/04.
 */
public class Main {
    public static void main(String[] args) {
        Adapter.Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

}
