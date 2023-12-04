/** Переопределение метода toString() Для класса Box
 */

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        
    width = w;
    height = h;
    depth = d;
    }

    public String toString() {
        return "Размеры коробки: " + width + " на " + depth + " на " + height;
    }
}

class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Коробка b: " + b;

        System.out.println(b);
        System.out.println(s);
        char ch = s.charAt(41);

        System.out.println(ch);
    }
}
