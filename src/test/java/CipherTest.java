import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void encrypt() {
        Cipher newCipher = new Cipher();
        assertEquals("cde", newCipher.encrypt("abc", 2));
    }

    @Test
    public void decrypt() {
        Cipher newCipher = new Cipher();
        assertEquals("abc", newCipher.decrypt("cde", 2));
    }
}