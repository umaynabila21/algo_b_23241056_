import java.util.Scanner;

public class BanyakIf {
    public static void main(String[] args) {
        
        // DATA MEMBER 
        int nilai;
        String grade;

        // IMPUT SCANNER
        Scanner scan = new Scanner (System.in);

        // MEMASUKAN IMPUT 
        System.out.print(" Masukan nilai : " );
        nilai  = scan.nextInt();

        // If STATEMENT
        if (nilai >=80) {
            grade = "A";
        } else if (nilai >=70 && nilai <=79) { 
            grade = "B";
        } else if (nilai >=60 && nilai <=69) {
            grade = "C";
        } else if (nilai >=50 && nilai <=59) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("nilai " + nilai);
        System.out.println("grade " + grade);

}

}
