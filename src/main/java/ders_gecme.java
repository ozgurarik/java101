import java.util.Scanner;

public class ders_gecme {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, biyoloji;

        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuz: ");
        mat = input.nextDouble();
        System.out.print("fizik notunuz: ");
        fizik = input.nextDouble();
        System.out.print("kimya notunuz: ");
        kimya = input.nextDouble();
        System.out.print("biyoloji notunuz: ");
        biyoloji = input.nextDouble();
        System.out.print("turkce notunuz: ");
        turkce = input.nextDouble();

        double ortalama = (mat + fizik + kimya + biyoloji + turkce) / 5;

        if (ortalama < 55) {
            System.out.println("sınıfta kaldınız.. :(");
        } else {
            System.out.println("sınıfı geçtiniz.. :)");
        }
        System.out.print("ortalamanız: " + ortalama);

    }
}
