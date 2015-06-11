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

    
}
