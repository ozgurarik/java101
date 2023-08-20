import java.util.Scanner;
public class hava_sicaklik_etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}




