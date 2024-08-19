public class Karyawan {
    
        int id;
        String nama, alamat, unit;

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

 