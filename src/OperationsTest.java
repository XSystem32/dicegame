
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @org.junit.jupiter.api.Test
    void createPLayer() {
        Player player = new Player("Jon", new Balance(1000));
        assertEquals(player.getName(), "Jon");
    }

    @org.junit.jupiter.api.Test
    void createBalance() {
        Balance balance = new Balance(1000);
        assertEquals(balance.getBalance(), 1000);
    }

    @org.junit.jupiter.api.Test
    void rollDice() {
        int a = Operations.rollDice();
        assertTrue(a < 12 && a > 2);
    }
}