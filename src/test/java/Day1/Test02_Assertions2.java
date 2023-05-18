package Day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_Assertions2 {

    //!!! bazen yapacağım testlerde "Bu doğru değil mi" şeklinde kontroller yapmam gerekirse

    @Test
    public void testToFindMin() {

        assertTrue(Math.min(4,10)==4);
        assertFalse(Math.min(4,10)==10);

    }


    @Test
    public void testSplit(){

        String str = "Test işlemi çok kolay";
        String[] anlikDizi = str.split(" "); // {"Test", "işlemi", "çok", "kolay"}
        String[] beklenenDizi = {"Test", "işlemi", "çok", "kolay"};

        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));

    }

}
