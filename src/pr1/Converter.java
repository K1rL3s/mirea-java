package pr1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = scanner.nextInt();

        double roubles = ROUBLES_PER_YUAN * yuan;

        System.out.printf("%d %s = %.2f российских рублей%n", yuan, getYuanString(yuan), roubles);
    }

    public static String getYuanString(int yuan) {
        int lastDigit = yuan % 10;
        int lastTwoDigits = yuan % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "юаней";
        }

        switch (lastDigit) {
            case 1:
                return "юань";
            case 2:
            case 3:
            case 4:
                return "юаня";
            default:
                return "юаней";
        }
    }
}
