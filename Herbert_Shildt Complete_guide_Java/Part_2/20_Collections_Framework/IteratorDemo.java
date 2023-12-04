/** Демонстрация работы итераторов
 */

import java.util.*;
class IteratorDemo {
    public static void main(String[] args) {
    // Создать списковый массив
    ArrayList<String> al = new ArrayList<String>();
    // Добавить элементы в списковый массив;
    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    //Использовать итератор для отображения содержимого al
    System.out.println("Исходное содержимое al: ");
    Iterator<String> itr = al.iterator();
    while(itr.hasNext()) {
        String element = itr.next();
        System.out.print(element + " ");
    }
    System.out.println();
    //Модифицировать объекты в ходе итерации
    ListIterator<String> litr = al.listIterator();
    while(litr.hasNext()) {
        String element = litr.next();
        litr.set(element + "+");
    }
    System.out.println("Модифицированное содержимое al: ");
    itr = al.iterator();
    while(itr.hasNext()) {
        String element = itr.next();
        System.out.print(element + " ");
    }
    System.out.println();

    //Отобразить список в обратном порядке
    System.out.print("Модифицированныыйы список в обратном порядке: ");
    while(litr.hasPrevious()) {
        String element = litr.previous();
        System.out.print(element + " ");
    }
    System.out.println();

    }
}

