/**Демонстрация использования метода join() определенного в String*/

class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(", ", "Alpha", "Beta", "Gamma");
        System.out.println(result);
    }
}
