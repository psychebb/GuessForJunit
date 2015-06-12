public class Game {
    private Guess guess;
    private RandomNumber randomNumber;

    public Game(Guess guess, RandomNumber randomNumber) {
        this.guess = guess;
        this.randomNumber = randomNumber;
    }

    public String play(String s) {

        return guess.guess(randomNumber.random(), s);
    }
}
