package prac1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = scanner.nextInt();

        double roubles = ROUBLES_PER_YUAN * yuan;

        String yuanString;
        int lastDigit = yuan % 10;
        boolean isExclusion = (yuan % 100 >= 11) && (yuan % 100 <= 14);

        if (lastDigit == 1 && !isExclusion) {
            yuanString = "юань";
        } else if (lastDigit >= 2 && lastDigit <= 4 && !isExclusion) {
            yuanString = "юаня";
        } else {
            yuanString = "юаней";
        }

        System.out.println(yuan + " " + yuanString + " = " + roubles + " российских рублей");
    }
}
