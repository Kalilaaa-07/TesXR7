import java.util.Scanner;

public class TarifParkir {
   public static void main(String[] args) {
    
        String platNomor;
        int JumlahJam;
        double harga;

        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nomor Plat: ");
        platNomor = s.nextLine();
        System.out.print("Jumlah jam: ");
        JumlahJam = s.nextInt();

        if(JumlahJam >0 && JumlahJam <=1){
            harga=3000;
        }else if (JumlahJam >1 && JumlahJam<=4) {
            harga=7000;
        }else if (JumlahJam > 4) {
            harga = 10000;
        }else {
            harga = 0;
            System.out.println("Sytem Eror");
        }
        System.out.println(platNomor);
        System.out.println("Tarif Parkir: "+ harga);
    }
}
