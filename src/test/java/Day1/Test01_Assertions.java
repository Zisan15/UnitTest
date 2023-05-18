package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test() {
        //main methodu yokken nasıl çalıştırıyorum ??
        //Junit içinde gömülü olarak gelen main methodu çağırılıyor...
        // Junit5 (Jupiter) methodların erişim belirleyicisini public yapmak zorunda değiliz

    }

    @Test
    public void testLength() {
        String cumle = "Merhaba Dunyam"; // 14 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;

        assertEquals(beklenenDeger, anlikDeger);//assertEquals --> aldığı parametrelerin değerlerini karşılaştırır, birbirine
        //eşit ise test geçer
    }

    //!!! farklı bir örnek (toUpperCase)
    @Test
    public void toUpperCase() {
        String anlikDeger = "Merhaba".toUpperCase(); //MERHABA
        String beklenenDeger = "MERHABA";

        // testim hata verirse mesaj vermek istiyorsam :
        assertEquals(beklenenDeger, anlikDeger, "Uppercase methodu düzgün çalışmadı");

    }

    @Test
    public void testToplama() {

        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1, sayi2); //15
        int beklenenDeger = 15;
        assertEquals(beklenenDeger, anlikDeger);

    }

    @Test
    public void testContains() {

        assertEquals(false, "Mirac".contains("z"));

    }


}
