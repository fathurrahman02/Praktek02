package praktek02;

public class PenjualanRumahAksi {
    public static void main(String[] args) {
        PenjualanRumah r1 = new PenjualanRumah();
        r1.harga_rumah = 100000000;
        r1.jumlah_unit = 7;
        
        r1.tampildata();
        System.out.println("total   =   "+r1.hitungPembelian());
        r1.cetaktotal();
    }
}
