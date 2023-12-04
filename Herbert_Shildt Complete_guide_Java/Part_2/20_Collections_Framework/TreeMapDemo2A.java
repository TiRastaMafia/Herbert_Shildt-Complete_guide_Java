// Использование thenComparing() для сортировки счетов по фамилии 
// и затем по имени владельца
import java.util.*;

// Компаратор, который сравнивает фамилии

class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        // Найти индекс начала фамилии
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
    // Переопределять equals() не нужно
}

// Сортировать по полному имени, когда фамилии одинаковы
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        // Использовать thenComparator() для создания компаратора, который
        // сравнивает фамилии и затем полные имена, когда фамилии совпадают

        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        //Создать древовидную карту
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        // Поместить элементы в карту
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        //получить набор элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Пополнить счет клиента John Doe на 1000
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("Новый баланс клиента John Doe: " + tm.get("John Doe"));
    }
}
