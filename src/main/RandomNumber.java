import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumber {

    private Random rand = new Random();

    public String random() {
        String number = "";
        for (int i = 0; i < 4; i++) {
            number = number + r();
        }
        return number;
    }

    private String r() {
        return rand.nextInt(10) + "";
    }
}
