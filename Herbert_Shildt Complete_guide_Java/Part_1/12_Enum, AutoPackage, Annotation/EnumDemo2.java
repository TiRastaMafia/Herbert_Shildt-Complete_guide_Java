enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        // Все константы перечисления Apple
        Apple[] allapples = Apple.values();
        for(Apple a : allapples)
            System.out.println(a + "\n");
        ap = Apple.valueOf("Winesap");
        System.out.println("ap Содержит  " + ap);

    }
}
