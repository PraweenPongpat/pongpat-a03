package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @Test
    void determinePromptTest() {
        GuessingGame game = new GuessingGame();
        String tooHigh = game.determinePrompt(174,200);
        assertEquals("Too High! guess again: ",tooHigh);
    }
    @Test
    void determinePromptTest1() {
        GuessingGame game = new GuessingGame();
        String tooLow = game.determinePrompt(174, 150);
        assertEquals("Too Low! guess again: ", tooLow);
    }
}