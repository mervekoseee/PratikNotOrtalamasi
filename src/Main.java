import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;
        double ort;
        String sonuc;
        System.out.println("Not Ortalaması Hesaplama Programına Hoşgeldiniz." );
        System.out.println("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz:");
        fiz = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz:");
        kim = input.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz:");
        tur = input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz:");
        tar = input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz:");
        muz = input.nextInt();

        ort = (mat + fiz + kim + tur + tar + muz)/6;
        System.out.println("Dönem Sonu Ortalamanız: " +ort);
        sonuc = (ort >= 60) ? "Geçti": "Kaldı";
        System.out.println("Dönem başarı durumunuz: " + sonuc);

    }
}