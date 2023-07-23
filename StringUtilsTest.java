import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testIsPalindrome() {
        String s1 = "salma123";
        String s2 = "321amlas";
        
        assertTrue(StringUtils.isPalindrome(s1, s2));        
    }

    @Test
    public void testIsPalindrome_false() {
        String s1 = "salma123";
        String s2 = "diego";
        
        assertFalse(StringUtils.isPalindrome(s1, s2));        
    }
}
