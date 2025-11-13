package laskin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;

class LaskinTest {

    @Test
    void main() {
        String[] args = {};
        String mockData = "2\n2\n";
        ByteArrayInputStream mockInput = new ByteArrayInputStream(mockData.getBytes());
        System.setIn(mockInput);
        Laskin.main(args);
        assertEquals(5.0, Laskin.add(2.0, 3.0));
    }

    @Test
    void add() {
        assertEquals(5.0, Laskin.add(2.0, 3.0));
    }

    @Test
    void subtract() {
        assertEquals(-1.0, Laskin.subtract(2.0, 3.0));
    }

    @Test
    void multiply() {
        assertEquals(6.0, Laskin.multiply(2.0, 3.0));
    }

    @Test
    void divide() {
        assertEquals(2.0, Laskin.divide(6.0, 3.0));
    }

    @Test
    void divideByZero() {
        try {
            Laskin.divide(6.0, 0.0);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }
}