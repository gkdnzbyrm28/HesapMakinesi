import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select, n1, n2;
        Scanner utp = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz.");
        n1 = utp.nextInt();
        System.out.print("Ikinci sayiyi giriniz.");
        n2 = utp.nextInt();

        System.out.print("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme\n");
        System.out.print("Seciminiz:");
        select = utp.nextInt();

        switch (select){
            case 1: System.out.print("iki sayinin toplami="+ (n1+n2));
                break;
            case 2: System.out.print("iki sayinin cikarmasi="+ (n1-n2));
                break;
            case 3: System.out.print("iki sayinin carpimi="+ (n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0: System.out.print("Payda olan sayi 0'a bolunemez!!!");
                        break;
                    default: System.out.print("Iki sayinin bolumu="+ (n1/n2));
                }
                break;
            default: System.out.print("Gecerli secenek giriniz");
        }
    }
}
