package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            float number = getFloatInput();
            System.out.println("Вы ввели число: " + number);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static float getFloatInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }

        try {
            float number = Float.parseFloat(input);
            return number;
        } catch (NumberFormatException e) {
            throw new Exception("Некорректный ввод. Введите дробное число");
        }
    }
}
    // - добавил блок "try-catch" в метод main, чтобы обработать возможное исключение, которое может быть выброшено в методе getFloatInput.
    // - также добавил оператор "throws" в объявление метода getFloatInput, чтобы указать, что он может выбросить исключение.
    //  - Внутри метода getFloatInput  сначал проверяем, является ли ввод пользователя пустым с помощью метода isEmpty().
    //  Если это так, мы выбрасываем исключение с сообщением "Пустые строки вводить нельзя".
    //  Если ввод не пустой, мы пытаемся преобразовать его во float с помощью Float.parseFloat, и возвращаем полученное значение.
    //  Если преобразование вызывает исключение NumberFormatException, мы выбрасываем другое исключение с сообщением "Некорректный ввод.
    //  Введите дробное число".