import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {

        double jamKerja, tarif, pajak, gajiKaryawan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jam kerja karyawan: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan tarif per jam karyawan: ");
        tarif = input.nextDouble();
        System.out.println("Masukkan pajak: ");
        pajak = input.nextDouble();

        gajiKaryawan=jamKerja*tarif;
        pajak=(pajak/100)*gajiKaryawan;
        gajiKaryawan=gajiKaryawan-pajak;

        System.out.println("Total Gaji: "+ gajiKaryawan);

    }
}
