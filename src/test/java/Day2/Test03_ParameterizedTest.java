package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {


    @Test
    void testLength() {

        assertTrue("Mirac".length() > 0);
        assertTrue("Ebubekir".length() > 0);
        assertTrue("Bilal".length() > 0);
        assertTrue("Ahmet".length() > 0);


    }

    // !!! yukardaki methodda 4 defa assertTrue yazdık ama bunu daha clean şekilde
    //     yapmak için
    @ParameterizedTest
    @ValueSource(strings = {"Mirac", "Bilal", "Ebubekir", "Ahmet"})
    //alacağı değerlerin kaynağı
    void testLength2(String str) {

        assertTrue(str.length() > 0);


    }

    // !!! 2. örnek:
    @Test
    void testUpperCase() {

        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }


    //!!! yukarıdaki örneği parametreli olarak yazalım
    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA, merhaba",
            "JAVA, java",
            "TEST, test"
    })
    void testUpperCase2(String str1, String str2) {

        assertEquals(str1, str2.toUpperCase());

    }


    //!!! 3. örnek:
    @ParameterizedTest
    @CsvSource(value = {"true,java,a", "true,junit,u", "false,hello,a"})
    void testContains(boolean b1, String str1, String str2) {

        assertEquals(b1, str1.contains(str2));

    }


}
