// Демонстрация использования ArrayDeque
import java.util.*;

class ArrayDequeDemo {
    public static void main(String[] args) {
        // Создать двухстороннюю очередь в виде массива
        ArrayDeque<String> adq = new ArrayDeque<String>();
        // Использовать экземпляр ArrayDeque подобно стеку
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        adq.push("O");

        System.out.print("Извлечение из стека: ");

        while(adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();
    }
}
