package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No20_ValidParenthesesTest {

    No20_ValidParentheses no20;

    @BeforeEach
    public void initialize() {
        no20 = new No20_ValidParentheses();
    }

    @Test
    public void validParenthesesTest() {
        boolean actual = no20.isValid("()");
        assertEquals(true, actual);
    }

    @Test
    public void validParenthesesTest1() {
        boolean actual = no20.isValid("()[]{}");
        assertEquals(true, actual);
    }

    @Test
    public void validParenthesesTest2() {
        boolean actual = no20.isValid("(}");
        assertEquals(false, actual);
    }

    @Test
    public void validParenthesesTest3() {
        boolean actual = no20.isValid("({})");
        assertEquals(true, actual);
    }
}
