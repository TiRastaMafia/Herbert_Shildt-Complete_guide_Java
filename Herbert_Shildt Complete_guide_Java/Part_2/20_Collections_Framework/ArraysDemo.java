// Демонстрация использования класса Arrays.
import java.util.*;
class ArraysDemo {
    public static void main(String[] args){
        // Разместить в памяти и инициализировать массив
        int[] array = new int[10];
    for(int i = 0; i < 10; i++)
        array[i] = -3 * i;
    // Отобразать, отсортировать и снова отобразить содержимое массива
    System.out.println("Исходное содержимое: ");
    display(array);
    Arrays.sort(array);
    System.out.println("Содержимое после сортировки: ");
    display(array);
    // Заполнить массив и отобразить его содержимое
    Arrays.fill(array, 2, 6, -1);

    System.out.println("Содержимое после fill(): ");
    display(array);

    //  Отсортировать массив и отобразить его содержимое
    Arrays.sort(array);
    System.out.println("Содержимое после после повторной сортировки: ");
    display(array);

    // Двоичный поиск значения -9
    System.out.println("Значение -9 находится в позиции: ");
    int index = Arrays.binarySearch(array, -9);
    System.out.println(index);
    }

    static void display(int[] array) {
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
