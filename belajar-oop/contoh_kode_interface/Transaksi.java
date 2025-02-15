public class Transaksi {

    public void lakukanPembayaran(InterfaceTransaksi methodInteface, double jumlah) {
        methodInteface.prosesPembayaran(jumlah);
    }    

}
