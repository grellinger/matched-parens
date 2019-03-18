import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MatchedParensTest {

    @Test
    public void alwaysPasses() {
        assertTrue(true);
    }

    @Test
    public void matchedParensGetsTrue() {
        assertTrue(parensAreMatched("()"));
    }

    @Test
    public void unMatchedParensGetsFalse() {
        assertFalse(parensAreMatched("("));
    }

    @Test
    public void nestedMatchedParensGetsTrue() {
        assertTrue(parensAreMatched("(())"));
    }

    private boolean parensAreMatched(String arg) {

        Stack<Character> stack = new Stack<>();
        char[] chars = arg.toCharArray();

        for(char c : chars) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                stack.pop();
            } else {
                // ignore for now...
            }
        }

        return stack.isEmpty();
    }

}
