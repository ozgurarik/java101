import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {

        int yas, mesafe, biletTip;
        Scanner input = new Scanner(System.in);
        System.out.print("gidilecek olan mesafeyi KM cinsinden giriniz.: ");
        mesafe = input.nextInt();
        System.out.print("yaşınızı giriniz.: ");
        yas = input.nextInt();
        System.out.print("yolculuk tipini seçiniz:\ngidiş için (1) , gidiş dönüş için (2) : ");
        biletTip = input.nextInt();
        double birimFiyat = 0.10;
        double toplamFiyat = birimFiyat * mesafe;

        if (yas < 0 || mesafe < 0 || (biletTip != 1 && biletTip != 2)) {
            System.out.print(" girilen bilgiler hatalı...");
        } else {
            if (yas < 12) {
                toplamFiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9;
            } else if (yas >= 65) {
                toplamFiyat *= 0.7;
            }
            if (biletTip == 2) {
                toplamFiyat *= 1.6;
            }
            System.out.print("toplam tutar : " + toplamFiyat + " TL ");
        }
    }
}
