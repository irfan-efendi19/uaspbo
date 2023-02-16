
import javax.swing.JOptionPane;


/** *********************************************************************
 * Module:  Kamar.java
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi
 * Purpose: Defines the Class Kamar
 ********************************************************************** */
/**
 * @pdOid 893234f2-dc22-418b-9f9f-76e1eecfc527
 */
public class Kamar extends Hotel {

    /**
     * @pdOid d76af73d-301c-4f68-9ed6-39da0f49a920
     */
    public int noKamar;
    /**
     * @pdOid d76af73d-301c-4f68-9ed6-39da0f49a920
     */
    public String fasilitas;

    /**
     * @pdOid 5fe24717-3c46-4f41-b645-8847f2274bda
     */
    public int getNoKamar() {
        return noKamar;
    }

    /**
     * @param newNoKamar
     * @pdOid c167a362-7fb6-4de0-bf28-68d1c408382e
     */
    public void setNoKamar(int newNoKamar) {
        noKamar = newNoKamar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    /**
     * @param newNoKamar
     * @pdOid c167a362-7fb6-4de0-bf28-68d1c408382e
     */
    public void setFasilitas(String newFasilitas) {
        fasilitas = newFasilitas;
    }
    
    public static void DaftarKamar(){
    Kamar kamar=new Kamar();
    String nokamar,lantai;
    nokamar= JOptionPane.showInputDialog("Masukkan No Kamar");
    lantai= JOptionPane.showInputDialog("Masukkan Lantai");
    System.out.println(nokamar + lantai);        
}
}