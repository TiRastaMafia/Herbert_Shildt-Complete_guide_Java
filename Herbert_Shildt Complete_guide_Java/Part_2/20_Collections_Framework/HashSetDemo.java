/** Демонстрация работы HashSet и LinkedHashSet*/
import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        // Создать Хэш таблицу
        //HashSet<String> hs = new HashSet<String>();

        // Создать ЛинкедХэш таблицу
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        
        // Добавить элементы в таблицу
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        
        System.out.println(hs);
    }
}
