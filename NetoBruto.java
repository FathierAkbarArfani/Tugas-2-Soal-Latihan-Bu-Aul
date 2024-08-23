import java.util.Scanner;

public class NetoBruto {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Jam Kerja");
        double jamKerja = input.nextDouble();
        System.out.println("Masukkan Tarif Per Jam Pengguna");
        double tarifPerJam = input.nextDouble();

        double gajiBruto;
        gajiBruto = jamKerja*tarifPerJam;
        System.out.println("Gaji Bruto :"+gajiBruto);

        double pajak=0.1;
        double gajiBersih;
        gajiBersih = gajiBruto-(gajiBruto*pajak);
        System.out.println("Gaji Bersih Karyawan :"+gajiBersih );

input.close();
    }
}