import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {

        int yas,mesafe,biletTip;
        Scanner input=new Scanner(System.in);
        System.out.print("gidilecek olan mesafeyi KM cinsinden giriniz.: ");
        mesafe= input.nextInt();
        System.out.print("yaşınızı giriniz.: ");
        yas= input.nextInt();
        System.out.print("yolculuk tipini seçiniz:\ngidiş için (1) , gidiş dönüş için (2)");
        biletTip= input.nextInt();

    }
}
