/** Демонстрация использования TreeSet */

import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        // Добавить элементы в древовидный набор
        ts.add("Clone");
        ts.add("Ambulance");
        ts.add("Beer");
        ts.add("Elf");
        ts.add("Food");
        ts.add("Document");
        ts.add("Japan");
        ts.add("Airdrop");

        System.out.println(ts);
        System.out.println(ts.subSet("B", "F"));
    }
}
