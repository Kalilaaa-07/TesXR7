public class Karyawan {
    
    int id;
   String nama;
   String alamat;
   String unit;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNama() {
      return this.nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getAlamat() {
      return this.alamat;
   }

   public void setAlamat(String alamat) {
      this.alamat = alamat;
   }

   public String getUnit() {
      return this.unit;
   }

   public void setUnit(String unit) {
      this.unit = unit;
   }


     public Karyawan (int id, String nama,String alamat, String unit){
        this.id = id;
        this.nama = nama; 
        this.alamat = alamat;
        this.unit = unit;

     }
     public void print() {
        System.out.println("ID = "+ id);
        System.out.println("Nama = "+ nama);
        System.out.println("Alamat = "+ alamat);
        System.out.println("Unit = "+ unit);
     }
    }

 