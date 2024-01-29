import java.util.Scanner; // импортируем класс Scanner для считывания ввода
public class task2 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // создаем объект Scanner для считывания ввода
    System.out.println("Введите две строки через пробел:"); // выводим приглашение для ввода
    String a = sc.next(); // считываем первую строку
    String b = sc.next(); // считываем вторую строку
    compareIgnoreCase(a, b); // вызываем метод compareIgnoreCase для сравнения строк
    }

    // метод compareIgnoreCase принимает две строки в качестве параметров и сравнивает их без учета регистра
    public static void compareIgnoreCase(String a, String b){
        if (a.equalsIgnoreCase(b)) { // если строки равны без учета регистра
            System.out.println("Строки идентичны"); // выводим "Строки идентичны"
        } else {// если строки не равны без учета регистра
            System.out.println("Строки неидентичны"); // выводим "Строки неидентичны"
        }
    }
}
