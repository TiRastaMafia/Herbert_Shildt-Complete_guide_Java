// Простая демонстрация использования Spliterator
import java.util.*;

class SpliteratorDemo {
    public static void main(String[] args) {
        // Создать списковый массив для элементов типа double
        ArrayList<Double> vals = new ArrayList<>();
        // Добавить значение в списковый массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // Использовать tryAdvance() для отображения содкржимого vals
        System.out.print("Содержимое vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();
        //Создать новый список содержащий значения квадратных
        //корней элементов из vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        //Использовать forEachRemaining() для отображения содержимого sqrs
        System.out.print("Содержимое sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
    }
}
