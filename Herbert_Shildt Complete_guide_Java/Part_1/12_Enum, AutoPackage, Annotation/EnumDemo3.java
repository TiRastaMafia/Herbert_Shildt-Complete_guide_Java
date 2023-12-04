enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;
    // Конструкор 
    Apple(int p) {price = p;}
    int getPrice() {return price;}
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        // ОТобразить цену яблок сорта Winesap
       System.out.println("Яблоки сорта Winesap стоят " + Apple.Winesap.getPrice() + "центов\n");
       // отобразить все сорта яблок с ценами
       System.out.println("Цены на все сорта яблок: ");
       for(Apple a : Apple.values())
           System.out.println("яблоки сорта " + a + " стоят " + a.getPrice() + " центов");
    }
}
