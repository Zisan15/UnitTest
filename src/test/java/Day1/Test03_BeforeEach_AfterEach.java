package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    String str;

    @BeforeEach
    void beforeEach() {

        str = "JUnit5 is better than JUnit4";
        System.out.println("************* BeforeEach() çalıştı **********");

    }

    @AfterEach
    void afterEach() {
        str = null;
        System.out.println("************* AfterEach() çalıştı ***********");

    }

    @Test
    void testSplit(TestInfo info) { // çalışan testin ismini konsolda görmek için test info kullanıldı
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5", "is", "better", "than", "JUnit4"};
        System.out.println(info.getDisplayName() + " calıştı");//çalışan test methodunun ismi geliyor

        assertTrue(Arrays.equals(beklenenDizi, anlikDizi));


    }

    @Test
    void testStringLength() {
        int anlikDeger = str.length();
        int beklenenDeger = 28;

        assertEquals(beklenenDeger, anlikDeger);

    }


    // test methodlarını çalışma sırasını kendimiz belirtmek istiyorsak JUnit4 --> @FixMethodOrder
            //JUnit5 --> @TestMethodOrder



}
