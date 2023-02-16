
/** *********************************************************************
 * Module:  Transaksi.java
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi
 * Purpose: Defines the Class Transaksi
 ********************************************************************** */
import java.util.*;

/**
 * @pdOid 715976af-0aad-4ed1-b8a1-bce9e4a40d5f
 */
public class Transaksi extends Person {

    /**
     * @pdOid bf5fab23-5f0a-4c20-a61a-95cca2d04cb8
     */
    private int idTransaksi;
    /**
     * @pdOid 95a5434f-7ac9-471f-96b0-356b6e87aca8
     */
    private String nik;
    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */
    private String noPegawai;
    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */
    private int pesanan;
    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */
    public int deposit;

    /**
     * @pdOid 006db2f5-1887-4b2e-be25-d379a0f37617
     */

    public int getIdTransaksi() {
        return idTransaksi;
    }

    /**
     * @param newIdTransaksi
     * @pdOid bb6c1e83-3610-4158-b0eb-439ed5a760a4
     */
    public void setIdTransaksi(int newidTransaksi) {
        idTransaksi = newidTransaksi;
    }

    public int getPesanan() {
        return pesanan;
    }

    /**
     * @param newTglCheckin
     * @pdOid db98132b-6820-4219-a9ce-a4c7c411c400
     */
    public void setPesanan(int newPesanan) {
        pesanan = newPesanan;
    }

    public int getDeposit() {
        return deposit;
    }

    /**
     * @param newIdTransaksi
     * @pdOid bb6c1e83-3610-4158-b0eb-439ed5a760a4
     */
    public void setDeposit(int newDeposit) {
        deposit = newDeposit;
    }
}
