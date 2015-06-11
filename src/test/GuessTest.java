import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GuessTest {

    private Guess guess;

    @Before
    public void setUp() throws Exception {
        guess = new Guess();
    }

    @Test
    public void shouldReturn4A0BWhenAllMatch() throws Exception {
        assertThat(guess.guess("1234", "1234"), is("4A0B"));
    }

    @Test
    public void shouldReturn3A1BWhenOnlyOneNotAllMatch() throws Exception {
        assertThat(guess.guess("1234", "1244"), is("3A0B"));
    }

    @Test
    public void shouldReturn4B0AWhenAllOnlyOne() throws Exception {
        assertThat(guess.guess("1234", "4321"), is("0A4B"));
    }

    @Test
    public void shouldReturn0B0AWhenAllNotMatch() throws Exception {
        assertThat(guess.guess("1234", "6789"), is("0A0B"));
    }
}
