import java.util.Scanner;

public class cin_zodyagi {
    public static void main(String[] args) {
        int yil, kalan;
        String zodyakKod = "";
        Scanner input = new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz.: ");
        yil = input.nextInt();
        kalan = yil % 12;

        if (kalan == 0) {
            zodyakKod = "maymun";
        } else if (kalan == 1) {
            zodyakKod = "horoz";
        } else if (kalan == 2) {
            zodyakKod = "köpek";
        } else if (kalan == 3) {
            zodyakKod = "domuz";
        } else if (kalan == 4) {
            zodyakKod = "fare";
        } else if (kalan == 5) {
            zodyakKod = "öküz";
        } else if (kalan == 6) {
            zodyakKod = "kaplan";
        } else if (kalan == 7) {
            zodyakKod = "tavşan";
        } else if (kalan == 8) {
            zodyakKod = "ejderha";
        } else if (kalan == 9) {
            zodyakKod = "yılan";
        } else if (kalan == 10) {
            zodyakKod = "at";
        } else if (kalan == 11) {
            zodyakKod = "koyun";
        }
        System.out.print("çin zodyağı burcunuz.: " + zodyakKod);
    }
}

/*
import java.util.Scanner;

public class cin_zodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        int zodyakKodu = dogumYili % 12;

        String zodyakBurcu = "";

        switch (zodyakKodu) {
            case 0: zodyakBurcu = "Maymun"; break;
            case 1: zodyakBurcu = "Horoz"; break;
            case 2: zodyakBurcu = "Köpek"; break;
            case 3: zodyakBurcu = "Domuz"; break;
            case 4: zodyakBurcu = "Fare"; break;
            case 5: zodyakBurcu = "Öküz"; break;
            case 6: zodyakBurcu = "Kaplan"; break;
            case 7: zodyakBurcu = "Tavşan"; break;
            case 8: zodyakBurcu = "Ejderha"; break;
            case 9: zodyakBurcu = "Yılan"; break;
            case 10: zodyakBurcu = "At"; break;
            case 11: zodyakBurcu = "Koyun"; break;
            default: zodyakBurcu = "Geçersiz"; break;
        }
           System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
    }
}

 */
