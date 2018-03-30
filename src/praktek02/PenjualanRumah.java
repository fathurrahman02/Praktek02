package praktek02;
public class PenjualanRumah {
    int harga_rumah;
    int jumlah_unit;

    public PenjualanRumah(int harga_rumah, int jumlah_unit) {
        this.harga_rumah = harga_rumah;
        this.jumlah_unit = jumlah_unit;
    }
    
     void tampildata(){
    System.out.println("================================");
    System.out.println("harga_rumah     :"+harga_rumah);
    System.out.println("jumlah_unit     :"+jumlah_unit);
    System.out.println("================================");
 }
     Integer hitungPembelian(){
            int total;
            total=harga_rumah*jumlah_unit;
            return total;
    }
         void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPembelian());
    }
}
