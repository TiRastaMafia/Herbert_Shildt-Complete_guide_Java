class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это выводится не будет");
        } catch(ArithmeticException e) {
            System.out.println("ДЕление на ноль");
        }
        System.out.println("После оператора catch");
    }
}
