import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchClosestValue {
    public static void main(String[] args) {

        int[] list = {-12, -120, 50, 25, 9, 11};
        Arrays.sort(list);
        System.out.println("Küçükten büyüğe sıralama");
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i < list.length; i++) {

            if (sayi <= list[0]) {
                System.out.println("Girilen Sayıdan Küçük Sayı Yoktur!");
                System.out.println("Girilen Sayıdan Büyük İlk Sayı: " + list[1]);
                break;
            } else if (sayi >= list[list.length - 1]) {
                System.out.println("Girilen Sayıdan Büyük Sayı Yoktur!");
                System.out.println("Girilen Sayıdan Küçük İlk Sayı: " + list[list.length - 2]);
                break;
            } else if (sayi < list[i]) {
                System.out.println("Girilen Sayıdan Büyük İlk Sayı: " + list[i]);
                System.out.println("Girilen Sayıdan Küçük İlk Sayı: " + list[i - 1]);
                break;
            }


        }
    }
}