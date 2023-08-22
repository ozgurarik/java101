import java.util.Scanner;

public class burc_bulan {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input = new Scanner(System.in);
        System.out.print("doğduğunuz ayı giriniz (1-12) : ");
        ay = input.nextInt();
        System.out.print("doğduğunuz günü giriniz (1-31) : ");
        gun = input.nextInt();
        String burc = "";

        if ((ay == 3 && (gun >= 21 && gun <= 31)) || (ay == 4 && (gun >= 1 && gun <= 20))) {
            burc = "koc";
        } else if ((ay == 4 && (gun >= 21 && gun <= 30)) || (ay == 5 && (gun <= 21 && gun >= 1))) {
            burc = "boğa";
        } else if ((ay == 5 && (gun >= 22 && gun <= 31)) || (ay == 6 && (gun <= 22 && gun >= 1))) {
            burc = "ikizler";
        } else if ((ay == 6 && (gun >= 23 && gun <= 30)) || (ay == 7 && (gun >= 1 && gun <= 22))) {
            burc = "Yengeç";
        } else if ((ay == 7 && (gun >= 23 && gun <= 31)) || (ay == 8 && (gun <= 22 && gun >= 1))) {
            burc = "Aslan";
        } else if ((ay == 8 && (gun >= 23 && gun <= 31)) || (ay == 9 && (gun <= 22 && gun >= 1))) {
            burc = "Başak";
        } else if ((ay == 9 && (gun >= 23 && gun <= 30)) || (ay == 10 && (gun <= 22 && gun >= 1))) {
            burc = "Terazi";
        } else if ((ay == 10 && (gun >= 23 && gun <= 31)) || (ay == 11 && (gun >= 1 && gun <= 21))) {
            burc = "Akrep";
        } else if ((ay == 11 && (gun >= 22 && gun <= 30)) || (ay == 12 && (gun >= 1 && gun <= 21))) {
            burc = "Yay";
        } else if ((ay == 12 && (gun <= 31 && gun >= 22)) || (ay == 1 && (gun <= 21 && gun >= 1))) {
            burc = "Oğlak";
        } else if ((ay == 1 && (gun <= 31 && gun >= 22)) || (ay == 2 && (gun <= 19 && gun >= 1))) {
            burc = "Kova";
        } else if ((ay == 2 && (gun <= 29 && gun >= 20)) || (ay == 3 && (gun >= 1 && gun <= 20))) {
            burc = "Balık";
        } else {
            System.out.print("geçerli bir veri giriniz...");
            return;
        }
        System.out.println("burcunuz: " + burc);
    }
}
