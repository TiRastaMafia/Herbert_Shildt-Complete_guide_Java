/** Использование цикла for в стиле "for-each" для прохода коллекции
 */
import java.util.*;
class ForEachDemo {
    public static void main(String[] args) {
        //Создать массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<Integer>();

        // Добавить значения в списковый массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        vals.add(6);
        //Использовать цикл for для отображения значений
        System.out.print("Содержимое vals: ");
        for(int v : vals)
            System.out.print(v + " ");
        System.out.println();
        //Проссумировать значения с применением цикла For
        int sum = 0;
        for(int v : vals)
            sum += v;
        System.out.println("Сумма значений: " + sum);
    }
}
