// Использование специального компаратора
import java.util.*;

class CompDemo2 {
    public static void main(String[] args) {
        // Передать обратный компаратор конструктору TreeSet()
        // через лямбда приложение
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> aStr.compareTo(bStr));

        // Добавить элементы в древовидный набор
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Отобразить элементы
        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}



