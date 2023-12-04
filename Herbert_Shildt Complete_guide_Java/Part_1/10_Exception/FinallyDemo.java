
public class FinallyDemo {
    // Сгенерировать исключение внутри метода
    public static void procA() {
        try {
            System.out.println("Внутри метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок finally метода procA()");
        }
    }
    // Возвратить управление изнутри блока try
    public static void procB() {
        try {
            System.out.println("Внутри метода procB()");
            return;
        } finally {
            System.out.println("Блок finally метода procB()");
        }
    }
    //Выполнить блок try обычным образом
    public static void procC() {
        try {
            System.out.println("Внутри метода procC()");
        } finally {
            System.out.println("Блок finally метода procC()");
        }
    }

// public static void main(String[] args) {
//         try {
//            procA();
//         } catch (Exception e) {
//             System.out.println("Исключение перехвачено");
//         }
//         procB();
//         procC();
//     }

}
