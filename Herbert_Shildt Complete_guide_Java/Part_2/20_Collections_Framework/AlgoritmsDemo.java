// демонстрация работы разнообразных алгоритмов
import java.util.*;

class AlgoritmsDemo {
    public static void main(String[] args) {
        // СОздать и инициализировать связный список
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // Создать компаратор с обратным порядком
        Comparator<Integer> r = Collections.reverseOrder();

        // СОртировать список с использованием созданного компаратора
        Collections.sort(ll, r);

        System.out.print("Список отсортирован в обратном порядке: ");
            for(int i : ll)
                System.out.print(i + " ");
            System.out.println();

        // ЗАтасовать список
        Collections.shuffle(ll);

        // Отобразить рандомизированный список
        System.out.println("Список перетасован: ");
        for(int i : ll)
            System.out.println(i + " ");

        System.out.println();
        System.out.println("Наименьшее значение: " + Collections.min(ll));
        System.out.println("Наибольшее значение: " + Collections.max(ll));

    }
}
