package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Вы ввели число: " + number);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number= 0;
        boolean validInput = false;

        do {
            System.out.print("Введите дробное число: ");

            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        } while (!validInput);

        return number;
    }
}
