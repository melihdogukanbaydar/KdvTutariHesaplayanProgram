import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double tutar, kdvOran1 = 0.18 , kdvOran2 = 0.08;
       Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : " );
        tutar = input.nextDouble();

        double kdvTutari = (tutar >= 0 && tutar <= 1000 ) ? (tutar * kdvOran1) : (tutar * kdvOran2);

        double kdvliTutar = (tutar >= 0 && tutar <= 1000) ? (tutar * kdvOran1) + tutar : (tutar * kdvOran2) + tutar;

        System.out.println("KDV'siz Fiyat" + tutar);
        String kdvOran3 = (tutar >= 0 && tutar <= 1000) ? "KDV Oranı %18" : "KDV Oranı %8";
        System.out.println(kdvOran3);
        System.out.println("KDV Tutarı" + kdvTutari);
        System.out.println("KDV'li Fiyat" + kdvliTutar);






    }
}