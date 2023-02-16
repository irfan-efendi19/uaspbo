
/** *********************************************************************
 * Module:  CheckOut.java
 *
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi Purpose: Defines the Class CheckOut
 * *********************************************************************
 */
import java.util.Date;

public class CheckIn extends Transaksi {

    /**
     * @pdOid 5b5c57c3-a264-4e3a-b80f-f9c38b358499
     */
    private Date tglCheckin;
    /**
     * @pdOid 5b5c57c3-a264-4e3a-b80f-f9c38b358499
     */
    public String jamCheckin;

    public Date getTglCheckin() {
        return tglCheckin;
    }

    public void setTglCheckin(Date newTglCheckin) {
        tglCheckin = newTglCheckin;
    }

    public String getJamCheckin() {
        jamCheckin = "14:00 WIB";
        return jamCheckin;
    }

    public void setJamCheckin(String newJamCheckin) {
        jamCheckin = newJamCheckin;
    }
}
