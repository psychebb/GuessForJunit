import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    private Game game;

    @Mock
    private Guess guess;

    @Mock
    private RandomNumber randomNumber;

    @Test
    public void testPlayGame() throws Exception {
        game = new Game(guess, randomNumber);
        when(randomNumber.random()).thenReturn("1234");
        when(guess.guess("1234", "1234")).thenReturn("4A0B");

        game.play("1234");

        verify(randomNumber, times(1)).random();
        verify(guess, times(1)).guess("1234", "1234");
    }
}
