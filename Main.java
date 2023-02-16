
/**
 * @author Ario Satria Wahyu Pratama
 * @author Moch. Surya Ramadhani
 * @author Moch. Irfan Efendi
 * @author Rachmad Fikri Dwi Prayogi
 */
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        Customer pelanggan = new Customer();
        CheckOut checkoutbaru = new CheckOut();
        CheckIn checkinbaru = new CheckIn();
        Transaksi transaksibaru = new Transaksi();
        Hotel hotelbaru = new Hotel();
        Harga hargabaru = new Harga();
        Pegawai pegawaibaru = new Pegawai();
        int pesanan;
        transaksibaru.setDeposit(100000);
        Random angkarandom = new Random();
        transaksibaru.setIdTransaksi(angkarandom.nextInt(1000000));
        boolean stt1 = true;
        while (stt1) {
            try {
                pegawaibaru.setNoPegawai(Integer.parseInt(JOptionPane.showInputDialog("Masukan Nomer Induk Pegawai")));
            } catch (Exception e) {
            }
            if (pegawaibaru.getNoPegawai() != 2021314202 && pegawaibaru.getNoPegawai() != 2021314203
                    && pegawaibaru.getNoPegawai() != 2021314206 && pegawaibaru.getNoPegawai() != 2021314218
                    && pegawaibaru.getNoPegawai() != 2020314204) {
                stt1 = true;
                JOptionPane.showMessageDialog(null, "Data Tidak Ada", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                stt1 = false;
            }
        }

        do {
            double total1 = 0, diskon1 = 0, bayar1 = 0;

            pelanggan.setNama(JOptionPane.showInputDialog("Masukkan Nama Pelanggan"));
            String msg_nama = "Selamat Datang " + pelanggan.getNama();
            JOptionPane.showMessageDialog(null, msg_nama);

            String nik;
            pelanggan.setNik(JOptionPane.showInputDialog("Masukan Nomer Induk Kependudukan"));

            String noTelepon;
            pelanggan.setNoTelepon(JOptionPane.showInputDialog("Masukan No telepon"));

            String jenisKelamin;
            String[] choices = { "Laki Laki", "Perempuan" };
            String input = (String) JOptionPane.showInputDialog(null, "Gender",
                    "Laki-laki/Perempuan", JOptionPane.QUESTION_MESSAGE, null,
                    choices,
                    choices[0]); // Initial choice
            pelanggan.setJenisKelamin(input);

            boolean stt = true;
            while (stt) {
                String menu = "\nPilih Jenis Kamar\n1. Single Bed Rp 200.000/hari\n2. Double Bed Rp 250.000/hari\n3. VIP Rp 1.000.000/hari\n4. VIP2 Rp 1.500.000/hari\nJenis kamar yang dipesan \t: ";
                try {
                    hotelbaru.setIdKamar(Integer.parseInt(JOptionPane.showInputDialog(menu)));
                } catch (Exception e) {
                }
                if (hotelbaru.getIdKamar() > 4 || hotelbaru.getIdKamar() < 1) {
                    stt = true;
                    JOptionPane.showMessageDialog(null, "Pilihan Anda Tidak Ada", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    stt = false;
                }
            }
            try {
                String tglbaru = JOptionPane.showInputDialog("Masukan Tanggal Checkin (dd-MM-yyyy)");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date tgl = sdf.parse(tglbaru);
                checkinbaru.setTglCheckin(tgl);
            } catch (Exception e) {

            }

            try {
                String tglbaru = JOptionPane.showInputDialog("Masukan Tanggal Check Out (dd-MM-yyyy)");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date tgl = sdf.parse(tglbaru);
                checkoutbaru.setTglCheckout(tgl);

            } catch (Exception e) {

            }

            try {
                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(checkinbaru.getTglCheckin());
                Calendar cal2 = Calendar.getInstance();
                cal2.setTime(checkoutbaru.getTglCheckout());
                long beda = Math.abs(cal2.getTimeInMillis() - cal1.getTimeInMillis());
                hargabaru.setLama((int) TimeUnit.MILLISECONDS.toDays(beda));
            } catch (Exception e) {

            }

            total1 = total1 + (hotelbaru.getTarif() * hargabaru.getLama());
            diskon1 = total1 * hargabaru.getDiskon();
            bayar1 = (total1 + transaksibaru.getDeposit()) - diskon1;
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            String format = sdf.format(checkinbaru.getTglCheckin());
            String format1 = sdf.format(checkoutbaru.getTglCheckout());
            String jam = (JOptionPane.showInputDialog("masukkan jam Checkin : (00:00)"));
            checkinbaru.setJamCheckin(jam);

            String outputHasil = "Nota Pembayaran \n\nNama                                     : " + pelanggan.getNama()
                    + "\nId Transaksi                         : " + transaksibaru.getIdTransaksi()
                    + "\nGender                                   : " + pelanggan.getJenisKelamin()
                    + "\nJenis Kamar                         : " + hotelbaru.getTypeKamar()
                    + "\nLama Menginap                   : " + hargabaru.getLama() + "hari"
                    + "\nTarif                                        : Rp." + total1
                    + "\nDiskon                                    : Rp." + diskon1
                    + "\nDeposit                                   : Rp." + transaksibaru.getDeposit()
                    + "\nTotal Bayar                            : Rp." + bayar1
                    + "\nTanggal Checkin                  : " + format + " pukul : " + checkinbaru.getJamCheckin()
                    + "\nTanggal Checkout                : " + format1 + " pukul : " + checkoutbaru.getJamCheckout()
                    + "\n\n\n Note: Checkout Melebihi Waktu Yang Ditentukan Akan Dikenakan Biaya Tambahan Rp.50.000 / Jam ";
            try {
                JOptionPane.showMessageDialog(null, outputHasil);
            } catch (Exception e) {
            }
            pesanan = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Memesan Kembali?", "Question",
                    JOptionPane.YES_NO_OPTION);
        } while (pesanan == JOptionPane.YES_OPTION);
    }

}
