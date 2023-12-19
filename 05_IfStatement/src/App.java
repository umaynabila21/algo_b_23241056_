import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        // DATA MEMBER 
        int Total_Belanja = 0;

        // IMPUT SCANNER
        Scanner scan = new Scanner (System.in);

        // MENGAMBIL IMPUT 
        System.out.print(" Masukan total belanja : " );
        Total_Belanja = scan.nextInt();

        // total belanja
        if (Total_Belanja >=50000 ) {
            System.out.println("Anda mendapatkan mouse");

        } else {
            System.out.println(" belanja anda kurang dari Rp. 50000");
        }
        
        System.out.println("Terima kasih telah berbelanja di toko kami");


        
    }
}
