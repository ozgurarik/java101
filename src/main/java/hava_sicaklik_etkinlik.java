import java.util.Scanner;
public class hava_sicaklik_etkinlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öner.");
        }
        if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema etkinliğini öner.");
        }
        if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Piknik etkinliğini öner.");
        } else {
            System.out.println("Yüzme etkinliğini öner.");
        }
    }
}




