import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,total=0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Bir sayi giriniz : ");
            number = inp.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        }while (number % 2 ==0);
        System.out.println("4'ün katı olan sayıların toplamı : "+total);

    }
}