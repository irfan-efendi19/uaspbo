
/** *********************************************************************
 * Module:  Pegawai.java
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi
 * Purpose: Defines the Class Pegawai
 ********************************************************************** */

/**
 * @pdOid a57e6760-d2fc-4bb3-b5c4-7a83ff470f61
 */
public class Pegawai extends Person {

    /**
     * @pdOid 6793ac77-4b4f-4ed7-b14a-09f6c0831eba
     */
    private int noPegawai;

    /**
     * @pdOid 8f9c39c9-5962-49ad-9406-4bc971884663
     */
    public int getNoPegawai() {
        
        return noPegawai;
    }
    /**
     * @param newNoPegawai
     * @pdOid b984a50a-87fd-4223-9df0-e24b598d2a60
     */
    public void setNoPegawai(int newNoPegawai) {
        noPegawai = newNoPegawai;
    }

    
    public static void DataPegawai(){
    Pegawai Pgw=new Pegawai();
        if (Pgw.getNoPegawai() == 2021314202) {
            Pgw.setNama("Moch. Surya Ramadhoni");
            System.out.println(Pgw.getNama());
        } else if (Pgw.getNoPegawai() == 2021314206) {
            Pgw.setNama("Ario Satria Wahyu Pratama");
            System.out.println(Pgw.getNama());
        } else if (Pgw.getNoPegawai() == 2021314203) {
            Pgw.setNama("Rachmad Fikri Dwi Prajogi");
            System.out.println(Pgw.getNama());
        } else if (Pgw.getNoPegawai() == 2021314218) {
            Pgw.setNama("Irfan Efendi");
            System.out.println(Pgw.getNama());
        }    else if (Pgw.getNoPegawai() == 2020314204) {
            Pgw.setNama("Jalu Wira Aditama");
            System.out.println(Pgw.getNama());
        }
    }
    }
