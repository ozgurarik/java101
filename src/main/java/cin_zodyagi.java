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
