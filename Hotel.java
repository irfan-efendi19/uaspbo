
/** *********************************************************************
 * Module:  Hotel.java
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi
 * Purpose: Defines the Class Hotel
 ********************************************************************** */

/**
 * @pdOid b7ee4307-4fbc-4953-a410-f452fcf9dfec
 */
public class Hotel {

    /**
     * @pdOid fc47515b-d00a-45a8-af80-d8398b4649a9
     */
    public int idKamar;
    /**
     * @pdOid a3580ab0-0553-47c1-98f1-90842a5e4c02
     */
    public String noLantai;
    /**
     * @pdOid 3e2d1f37-e88c-4cf7-9b3c-b5feccb060cb
     */
    public String typeKamar;
    /**
     * @pdOid 5a560587-eb20-4b22-adbd-d7c38f797d75
     */
    public int tarif;

    /**
     * @pdOid 2691b834-1e0e-4a64-b672-95f3f34ffd4a
     */
    public int getIdKamar() {
        return idKamar;
    }

    /**
     * @param newIdKamar
     * @pdOid 42ffbd1c-1913-4d84-aaec-6cb66c86366d
     */
    public void setIdKamar(int newIdKamar) {
        idKamar = newIdKamar;
    }

    /**
     * @pdOid d8329bc8-9ae3-4a2f-a722-9fdd35434723
     */
    public String getNoLantai() {
        if (idKamar == 1) {
            noLantai = "Lantai 1";
        } else if (idKamar == 2) {
            noLantai = "Lantai 2";
        } else if (idKamar == 3) {
            noLantai = "Lantai 3";
        } else if (idKamar == 4) {
            noLantai = "Lantai 4";
        }
        return noLantai;
    }

    /**
     * @param newNoLantai
     * @pdOid 1ce59e40-d9cc-4cb0-aafc-c4810a203a77
     */
    public void setNoLantai(String newNoLantai) {

        noLantai = newNoLantai;
    }

    /**
     * @pdOid 5faea846-f2bb-4acc-b1ff-4f637d36a6d6
     */
    public String getTypeKamar() {
        if (idKamar == 1) {
            typeKamar = "Single Bed";
        } else if (idKamar == 2) {
            typeKamar = "Double Bed";
        } else if (idKamar == 3) {
            typeKamar = "VIP";
        } else if (idKamar == 4) {
            typeKamar = "VIP2";
        }
        return typeKamar;
    }

    /**
     * @param newTypeKamar
     * @pdOid 602c6cd4-55e0-4ca3-86a9-2530008d7c43
     */
    public void setTypeKamar(String newTypeKamar) {
        typeKamar = newTypeKamar;
    }

    public int getTarif() {
        if (getIdKamar() == 1) {
            // harga Single Bed
            tarif = 200000;
        } else if (getIdKamar() == 2) {
            // harga Double Bed
            tarif = 250000;
        } else if (getIdKamar() == 3) {
            // harga VIP
            tarif = 1000000;
        } else if (getIdKamar() == 4) {
            // harga VIP 2
            tarif = 1500000;
        }
        return tarif;
    }

    public void setTarif(int newTarif) {
        tarif = newTarif;
    }

}
