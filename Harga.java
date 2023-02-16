
/** *********************************************************************
 * Module:  Harga.java
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi
 * Purpose: Defines the Class Harga
 ********************************************************************** */
/**
 * @pdOid 56b2680f-76ed-4d06-8a25-d9a10fa5e657
 */
public class Harga extends Hotel {

    public String typeKamar;
    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */
    private int lama;
    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */
    public double diskon;

    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */

    public int getLama() {
        return lama;
    }

    public void setLama(int newLama) {
        lama = newLama;
    }

    public double getDiskon() {

        if (lama >= 4 && lama <= 7) {
            diskon = 0.1;
        } else if (lama > 7) {
            diskon = 0.2;
        }

        return diskon;
    }

    public void setDiskon(int newDiskon) {
        diskon = newDiskon;
    }
}
