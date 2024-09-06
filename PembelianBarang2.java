import java.util.Scanner;

public class PembelianBarang2 {
    public static void main(String[] args) {
        double total, diskon, pothar;

        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan total pembelian: ");
        total = input.nextDouble();
        if (total > 150000 ) {
            pothar =0;
            diskon =0.1;
            total -=diskon;
        } else {
            diskon =0;
            pothar = 5000;
            total -=diskon;
        }
        System.out.println("Diskon: " + diskon);
        System.out.println("Potongan Harga: "+ pothar);
        System.out.println("Total yang harua dibayar: "+ total);

    }
}
