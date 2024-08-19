public class KaryawanTester{
    public static void main(String[] args) {
        
        Karyawan keyza = new Karyawan(10, "Keyza", "Tulungagung", "BK");
        Karyawan aveline =  new Karyawan(15, "Aveline", "Tulungagung", "TU");
        Karyawan nur = new Karyawan(20, "Memey", "Banyuwangi", "Kesiswaan");
        Karyawan leni = new Karyawan(25, "Leni", "Malang", "UKS");
        Karyawan ninmas = new Karyawan(30, "Nimas", "Malang", "Perpus");
    
        keyza.print();
        System.out.println();
        aveline.print();
        System.out.println();
        nur.print();
        System.out.println();
        leni.print();
        System.out.println();
        ninmas.print();
        System.out.println();
}
}