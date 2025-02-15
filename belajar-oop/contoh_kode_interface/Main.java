public class Main {
    public static void main(String[] args) {
        Gopay gopay = new Gopay();
        Dana dana = new Dana();

        Transaksi transaksi = new Transaksi();
        transaksi.lakukanPembayaran(gopay, 500.0000);
        transaksi.lakukanPembayaran(dana, 500.0000);
        
    }
}
