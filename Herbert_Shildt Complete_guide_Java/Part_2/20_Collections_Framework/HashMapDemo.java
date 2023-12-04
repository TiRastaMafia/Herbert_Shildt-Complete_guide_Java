/** Использование HashMap для сопоставления имен клиентов с балансами банковских счетов*/

import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
    //Создать Хэш карту
    HashMap<String, Double> hm = new HashMap<String, Double>();
    // Поместить элементы в карту
    hm.put("John Doe", 3434.34);
    hm.put("Tom Smith", 123.22);
    hm.put("Jane Baker", 1378.00);
    hm.put("Tod Hall", 99.22);
    hm.put("Ralph Smith", -19.08);
    

    // Получить набор элементов
    Set<Map.Entry<String, Double>> set = hm.entrySet();
    // Отобразить содержимое набора
    for(Map.Entry<String, Double> me : set) {
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
    }

    System.out.println();
    // ПОполнить счет клиента John Doe на 1000
    double balance = hm.get("John Doe");
    hm.put("John Doe", balance + 1000);

    System.out.println("Новый баланс клиента John Doe: $ " + hm.get("John Doe"));
    }
}
