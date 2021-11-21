import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void should_create_game_object_with_number() {
        new Game(100);
    }

    @Test
    public void should_has_size_100_when_input_100() {
        Game game = new Game(100);
        assertEquals(100, game.size());
    }

    @Test
    public void should_has_game_number_list_to_be_spoken() {
        Game game = new Game(100);
        List<String> numbersToBeSpoken = game.list();
        assertEquals("1", numbersToBeSpoken.get(0));
        assertEquals("Fizz", numbersToBeSpoken.get(2));
        assertEquals("Buzz", numbersToBeSpoken.get(4));
        assertEquals("FizzBuzz", numbersToBeSpoken.get(14));

        System.out.println(numbersToBeSpoken);
    }
}
