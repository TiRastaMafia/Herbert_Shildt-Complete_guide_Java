// Использование специального компаратора
import java.util.*;
// Обратный компаратор для строк
class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
    // Обратить сравнение
    //return bStr.compareTo(aStr);
    return aStr.compareTo(bStr);
    }
    // Переопределять equals() и методы со стандартной реализацией не требуется
}

class CompDemo {
    public static void main(String[] args) {
        // Создать древовидный набор с сортировкой в нормальном порядке
        // TreeSet<String> ts = new TreeSet<String>(new MyComp());
        // Создать объект TreeSet который распологает строковые элементы в обратном порядке
        MyComp mc = new MyComp(); // СОздать компаратор
        TreeSet<String> ts = new TreeSet<String> (mc.reversed());

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



