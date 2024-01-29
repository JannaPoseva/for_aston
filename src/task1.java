import java.util.Scanner; // импортируем класс Scanner для считывания ввода

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаем объект Scanner для считывания ввода
        System.out.println("Введите два целых числа через пробел:"); // выводим приглашение для ввода
        int a = sc.nextInt(); // считываем первое число
        int b = sc.nextInt(); // считываем второе число
        compare(a, b); // вызываем метод compare для сравнения чисел
        calculate(a, b); // вызываем метод calculate для выполнения арифметических операций
    } // метод compare принимает два целых числа в качестве параметров и сравнивает их
    public static void compare(int a, int b) {
        if (a > b) { // если a больше b
            System.out.println("a > b"); // выводим "a > b"
        } else if (a < b) {// если a меньше b
            System.out.println("a < b"); // выводим "a < b"
        } else {// если a равно b
            System.out.println("a = b"); // выводим "a = b"
        }
    } // метод calculate принимает два целых числа в качестве параметров и выполняет с ними арифметические операции
    public static void calculate(int a, int b) {
        int sum = a + b; // вычисляем сумму
        int diff = a - b; // вычисляем разность
        int prod = a * b; // вычисляем произведение
        int quot = a / b; // вычисляем частное
        int rem = a % b; // вычисляем остаток
        System.out.println("Сумма: " + sum); // выводим сумму
        System.out.println("Разность: " + diff); // выводим разность
        System.out.println("Произведение: " + prod); // выводим произведение
        System.out.println("Частное: " + quot); // выводим частное
        System.out.println("Остаток: " + rem); // выводим остаток
    }
}