
/** *********************************************************************
 * Module:  CheckOut.java
 *
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi Purpose: Defines the Class CheckOut
 * *********************************************************************
 */
public class Person {
    /**
     * @pdOid 3db315f2-8e83-493d-8d14-ce4c42e27990
     */
    private String nama;
    /**
     * @pdOid c3c3b3b6-4a6c-4162-a4c6-8b235822d818
     */
    private String jenisKelamin;
    /**
     * @pdOid dd5dd54b-a5e0-4724-bea0-b4bb15cab073
     */
    private String alamat;



    public String getNama() {
        return nama;
    }

    /**
     * @param newNama
     * @pdOid 995b395d-ed3b-4485-88f8-9a88f15aba22
     */
    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param newJenisKelamin
     * @pdOid 0109a240-0c7f-4228-9e05-0c1708c52d73
     */
    public void setJenisKelamin(String newJenisKelamin) {
        jenisKelamin = newJenisKelamin;
    }

    /**
     * @pdOid 6d5ec807-9400-4bed-bb34-97deb7becf88
     */
    public String getAlamat() {
  
        return alamat;
    }

    /**
     * @param newAlamat
     * @pdOid a623ec5f-9c69-4be4-928c-3bb31ad01c0e
     */
    public void setAlamat(String newAlamat) {
        alamat = newAlamat;
    }
}
