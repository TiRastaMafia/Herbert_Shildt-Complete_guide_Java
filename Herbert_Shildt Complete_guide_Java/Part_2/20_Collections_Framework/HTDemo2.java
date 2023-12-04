/** ДЕмонстрация использования итераторов с Hashtable*/

import java.util.*;

class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance =
            new Hashtable<String, Double>();

        Enumeration<String> names;
        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1278.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);

        // Отобразить балансы всех счетов из хэш-таблицы
        // Для начала получить представление в виде набора для ключей
        Set<String> set = balance.keySet();
        // Получить итератор
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();
        
        // Пополнить счет клиента John Doe на 1000
        bal = balance.get("John Doe");
        balance.put("John Doe", bal+1000);
        System.out.println("Новый баланс клиента John Doe: " + balance.get("John Doe"));
            
        System.out.println();
        
        Iterator<String> itr2 = set.iterator();
        while(itr2.hasNext()) {
            str = itr2.next();
            System.out.println(str + ": " + balance.get(str));
        }
    }
}



