class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14159);
        Double d2 = Double.valueOf("314149E-5");

        System.out.println(d1 + " = " + d2 + " -> " + d2.equals(d2));
    }
}
