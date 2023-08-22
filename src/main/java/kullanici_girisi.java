import java.util.Scanner;
public class kullanici_girisi {
    public static void main(String[] args) {
        String dogruKullaniciAdi = "admin", dogruSifre = "java1234", cevap, yeniSifre, kullaniciAdi, sifre;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifreyi giriniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
            System.out.println("Bilgiler doğru.");
        } else {
            System.out.println("Girilen bilgiler hatalı.\nŞifrenizi değiştirmek ister misiniz? (E/H)");
            cevap = input.nextLine();
            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                yeniSifre = input.nextLine();
                if (!yeniSifre.equals(dogruSifre)) {
                    dogruSifre = yeniSifre;
                    System.out.println("Şifreniz değiştirildi.");
                } else {
                    System.out.println("Yeni şifre eskisiyle aynı olamaz.");
                }
            } else if (cevap.equalsIgnoreCase("H")) {
                System.out.println("Şifre değiştirme işlemi iptal edildi.");
            }
        }
    }
}
