/** Сравнение строк*/

class EqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "hello";
        String bar = "Foobar";
        boolean bar1 = bar.endsWith("bar"); 
        boolean bar2 = bar.startsWith("Foo", 0);
        System.out.println(s1.equals(s2) + "  eigncs " + s1.equalsIgnoreCase(s2));
        System.out.println(bar1);
        System.out.println(bar2);
    }
}
