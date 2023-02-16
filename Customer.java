
/** *********************************************************************
 * Module:  Customer.java
 *
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi Purpose: Defines the Class Customer
 * *********************************************************************
 */

/**
 * @pdOid 5b246ed1-1c2d-4229-8ef5-14aed38fb167
 */
public class Customer extends Person {

    /**
     * @pdOid 9204cf8d-e215-4887-8e3f-08a943ef09e7
     */
    private String nik;
    /**
     * @pdOid c2551259-b55c-42c5-8780-2d3247bde880
     */
    private String noTelepon;

    /**
     * @pdOid 581cf264-77ea-4b66-9ba5-daf90329ab36
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param newNik
     * @pdOid 545f11bd-7882-4bdf-bd0b-0406ae0737c1
     */
    public void setNik(String newNik) {
        nik = newNik;
    }

    /**
     * @pdOid df930e1e-60a9-4b49-8caf-870bdf3558d5
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * @param newNoTelepon
     * @pdOid a5175f64-ad7f-4c82-b355-85d154fbdb7c
     */
    public void setNoTelepon(String newNoTelepon) {
        noTelepon = newNoTelepon;
    }

}
