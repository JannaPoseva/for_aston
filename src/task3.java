public class task3 {

    public static void main(String[] args) {
        // задаем массив целых чисел
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // проходим по всем элементам массива
        for (int num : arr) {
            // проверяем, является ли число четным
            if (num % 2 == 0) {
                // если да, то выводим его в консоль
                System.out.println(num);
            }
        }
    }
}