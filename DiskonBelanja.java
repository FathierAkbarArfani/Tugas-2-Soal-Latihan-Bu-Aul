import java.util.Scanner;

public class DiskonBelanja {


    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        System.out.println("Harga Barang");
    double hargaBarang = input.nextDouble();
    System.out.println("jumlah barang");
    double jumlahBarang= input.nextDouble();
    System.out.println("Diskon barang");
    double diskonBarang = input.nextDouble();
    

    double totalharga;
    totalharga = (hargaBarang*diskonBarang *jumlahBarang);
    System.out.println("Hasil "+totalharga);
    
    }
    
}