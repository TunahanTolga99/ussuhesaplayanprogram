import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayıyı Giriniz :");
        n= input.nextInt();
        System.out.println("Üs Olacak Sayı : ");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i<=k; i++){
            total *= n;
        }
        System.out.println("Toplam : " +total);
        }
    }




