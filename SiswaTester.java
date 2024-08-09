//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Siswa keyza = new Siswa();
        Siswa aveline =  new Siswa();
        Siswa nur = new Siswa();
        Siswa leni = new Siswa();
        Siswa azzahra = new Siswa();

        keyza.nama = "Keyza";
        keyza.ipk =  90.0;
        keyza.id = 14;
        
        aveline.nama = "Aveline";
        aveline.ipk = 90.0;
        aveline.id = 4;

        nur.nama = "Nur Azrina";
        nur.ipk = 90.0;
        nur.id = 31;

        leni.nama = "Leni";
        leni.ipk = 90.0;
        leni.id = 18;

        azzahra.nama = "Zea";
        azzahra.ipk = 90.0;
        azzahra.id = 6;

        System.out.println("Nama : "+ keyza.nama);
        System.out.println("Absen : "+ keyza.id);
        System.out.println("Nilai : "+ keyza.ipk);

        System.out.println("Nama : "+ aveline.nama);
        System.out.println("Absen : "+ aveline.id);
        System.out.println("Nilai : "+ aveline.ipk);
        
        System.out.println("Nama : "+ nur.nama);
        System.out.println("Abssen : "+ nur.id);
        System.out.println("Nilai : "+ nur.ipk);

        System.out.println("Nama : "+ leni.nama);
        System.out.println("Absen : "+ leni.id);
        System.out.println("Nilai : "+ leni.ipk);

        System.out.println("Nama : "+ azzahra.nama);
        System.out.println("Absen : "+ azzahra.id);
        System.out.println("Nilai : "+ azzahra.ipk);
    }
}
