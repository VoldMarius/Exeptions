Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}


В данном коде явно указано деление на ноль (intArray[8] / d), что может привести к исключению ArithmeticException.
Ошибка в коде заключается в том, что значение переменной d равно нулю. Чтобы исправить эту ошибку,
необходимо задать d равным ненулевому значению.

Исправленный код будет выглядеть следующим образом:

try {
   int d = 1; // Исправление: задаем ненулевое значение для d
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   e.printStackTrace(); // Исправление: вывод полного стека трассировки исключения
}

Теперь, когда d равно ненулевому значению, деление не вызовет исключение ArithmeticException.


Задание 3

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

1. В методе main происходит попытка обратиться к несуществующему индексу массива abc.
   Это вызовет исключение ArrayIndexOutOfBoundsException. Чтобы исправить ошибку,
   нужно обратиться к существующему индексу массива, например, abc[1] = 9.
2. В методе printSum, объявленном с исключением FileNotFoundException, но ни один из операторов
   в методе не вызывает это исключение. Если исключение не бросается непосредственно в методе, его объявление может быть удалено.
3. Блок catch для NullPointerException в main не будет выполнен, так как предыдущий блок catch для Throwable
   поймает исключение NullPointerException. Для устранения этой неопределенности, в первую очередь должны быть
   указаны блоки catch для более специфических исключений, а затем блок catch для более общего случая.
   Таким образом, блоки catch должны быть переставлены следующим образом:

catch (IndexOutOfBoundsException ex) {
   System.out.println("Массив выходит за пределы своего размера!");
} catch (NullPointerException ex) {
   System.out.println("Указатель не может указывать на null!");
} catch (Throwable ex) {
   System.out.println("Что-то пошло не так...");
}


Исправленный код будет выглядеть следующим образом:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[1] = 9; // Исправление: обращение к существующему индексу массива
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   }
}

public static void printSum(Integer a, Integer b) {
   System.out.println(a + b);
}


Теперь ошибки и неточности в коде исправлены.
