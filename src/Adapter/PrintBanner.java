package Adapter;

/**
 * Created by mafuyuk on 2016/12/04.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        super.showWithParen();
    }

    public void printStrong() {
        super.showWithAster();
    }
}
