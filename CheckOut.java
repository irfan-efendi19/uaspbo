
/** *********************************************************************
 * Module:  CheckOut.java
 *
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi Purpose: Defines the Class CheckOut
 * *********************************************************************
 */
import java.util.*;

/**
 * @pdOid 5b5c57c3-a264-4e3a-b80f-f9c38b358499
 */
public class CheckOut extends Transaksi{

    /**
     * @pdOid 5b5c57c3-a264-4e3a-b80f-f9c38b358499
     */
    private Date tglCheckout;
    /**
     * @pdOid 5b5c57c3-a264-4e3a-b80f-f9c38b358499
     */
    public String jamCheckout;

    public Date getTglCheckout() {
        return tglCheckout;
    }

    public void setTglCheckout(Date newTglCheckout) {
        tglCheckout = newTglCheckout;
    }

    public String getJamCheckout() {
        jamCheckout = "12:00 WIB";
        return jamCheckout;
    }

    public void setJamCheckout(String newJamCheckout) {
        jamCheckout = newJamCheckout;
    }
}
