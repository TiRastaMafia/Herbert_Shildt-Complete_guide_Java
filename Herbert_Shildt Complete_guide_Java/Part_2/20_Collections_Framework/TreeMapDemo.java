/** Использование HashMap для сопоставления имен клиентов с балансами банковских счетов*/

import java.util.*;

class TreeMapDemo {
    public static void main(String[] args) {
    //Создать Хэш карту
    TreeMap<String, Double> tm = new TreeMap<String, Double>();
    // Поместить элементы в карту
    tm.put("John Doe", 3434.34);
    tm.put("Tom Smith", 123.22);
    tm.put("Jane Baker", 1378.00);
    tm.put("Tod Hall", 99.22);
    tm.put("Ralph Smith", -19.08);
    

    // Получить набор элементов
    Set<Map.Entry<String, Double>> set = tm.entrySet();
    // Отобразить содержимое набора
    for(Map.Entry<String, Double> me : set) {
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
    }

    System.out.println();
    // ПОполнить счет клиента John Doe на 1000
    double balance = tm.get("John Doe");
    tm.put("John Doe", balance + 1000);

    System.out.println("Новый баланс клиента John Doe: $ " + tm.get("John Doe"));
    }
}
