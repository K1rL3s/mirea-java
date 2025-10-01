package prac1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = scanner.nextInt();

        double roubles = ROUBLES_PER_YUAN * yuan;

        System.out.println("Сумма в российских рублях: " + roubles);
    }
}
