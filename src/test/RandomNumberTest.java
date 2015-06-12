import org.junit.Test;

import static java.util.regex.Pattern.matches;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RandomNumberTest {
    @Test
    public void testGeneratedStringIs4Numbers() throws Exception {
        RandomNumber randomNumber = new RandomNumber();
        String random = randomNumber.random();

        assertThat(matches("[0-9]{4}", random), is(true));
    }
}
