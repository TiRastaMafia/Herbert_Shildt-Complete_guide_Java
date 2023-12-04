/** Использование стандартного списка свойств 
 */
import java.util.*;

class PropDemoDef {
    public static void main(String[] args) {
        
        Properties defList = new Properties();
        defList.setProperty("Флорида", "Таллахасси");
        defList.setProperty("Висконсин", "Мадисон");
        
        Properties capitals = new Properties(defList);
        capitals.setProperty("Иллинойс", "Спрингфилд");
        capitals.setProperty("Миссури", "Джеферсон-Сити");
        capitals.setProperty("Вашингтон", "Олимпия");
        capitals.setProperty("Калифорния", "Сакраменто");
        capitals.setProperty("Индиана", "Индианаполис");

        // Получить представление в виде набора ключей
        Set<?> states = capitals.keySet();

        //Отобразить штаты и их столицы
        for(Object name : states)
            System.out.println("Столица штата " + name + " " + capitals.getProperty((String)name) + ".");

        System.out.println();
        // Найти штат, отсутствующий в списке - указать стандартное значение
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида - " + str + ".");
    
    }
}
