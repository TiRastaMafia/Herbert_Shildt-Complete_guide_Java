class Box {
    private double width;
    private double height;
    private double depth;
// конструктор применяемый для клонирования объекта
Box(Box ob) { // передать объект конструктору
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
}
// конструктор, используемый в случае указания всех размеров.
Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}
// конструктор в случае если размеры вообще не указаны
Box() {
    width = -1;
    height = -1;
    depth = -1;
}
// если коробка куб
Box(double len){
    width = height = depth = len; 
}
// вычислить и вернуть объем
double volume() {
        return width * height * depth;
    }
}
// Добавить вес
class BoxWeight extends Box {
    double weight;
    // конструктор применяемый для клонирования объекта
    BoxWeight(BoxWeight ob){
    super(ob);
    weight = ob.weight;
    }
    // Конструктор используемый в случае указания параметров
    BoxWeight(double w, double h, double d, double m) {
    super(w, h, d); // вызвать конструктор супер класса
    weight = m;
    }
    // стандартный конструктор
    BoxWeight(){
        super();
        weight = -1;
    }
    // Конструктор используемый в случае создания объекта кубической формы
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
// Конструктор применяемый для клонирования объекта
class Shipment extends BoxWeight {
    double cost;
    Shipment(Shipment ob) {
    super(ob);
    cost = ob.cost;
    }
    // Конструктор используемый в случае указания всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;    
    }

    // Стандартный конструктр
    Shipment () {
        super();
        cost = -1;
    }

    // Конструктор используемый в случае создания объекта кубической коробки
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $ " + shipment1.cost);
        System.out.println();

        vol = shipment1.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $ " + shipment2.cost);
        System.out.println();



    }
}



class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен = " + vol);
        System.out.println("Вес mybox1 равен = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен = " + vol);
        System.out.println("Вес mybox2 равен = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен = " + vol);
        System.out.println("Вес mybox3 равен = " + mybox3.weight);
        System.out.println();
        
        vol = myclone.volume();
        System.out.println("Объем myclone равен = " + vol);
        System.out.println("Вес myclone равен = " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен = " + vol);
        System.out.println("Вес mycube равен = " + mycube.weight);
        System.out.println();
    }
}


/*class DemoBoxWeight {
    public static void main(String[] args) {
    //BoxWeight myBox1 = new BoxWeight(10, 20, 15, 555);
    //BoxWeight myBox2 = new BoxWeight(2, 3, 4, 777);
    double vol;
    ColorBox myBox1 = new ColorBox(10, 20, 15, 555);
    ColorBox myBox2 = new ColorBox(2, 3, 4, 777);
    vol = myBox1.volume();
    System.out.println("Объем myBox1 равен " + vol);
    System.out.println("Вес myBox1 равен " + myBox1.color);
    System.out.println();

    vol = myBox2.volume();
    System.out.println("Объем myBox2 равен " + vol);
    System.out.println("Вес myBox2 равен " + myBox2.color);
    System.out.println();
    }
}


class DemoBoxWeight {
    public static void main(String[] args) {
    //BoxWeight myBox1 = new BoxWeight(10, 20, 15, 555);
    //BoxWeight myBox2 = new BoxWeight(2, 3, 4, 777);
    double vol;
    ColorBox myBox1 = new ColorBox(10, 20, 15, 555);
    ColorBox myBox2 = new ColorBox(2, 3, 4, 777);
    vol = myBox1.volume();
    System.out.println("Объем myBox1 равен " + vol);
    System.out.println("Вес myBox1 равен " + myBox1.color);
    System.out.println();

    vol = myBox2.volume();
    System.out.println("Объем myBox2 равен " + vol);
    System.out.println("Вес myBox2 равен " + myBox2.color);
    System.out.println();
    }
}

class RefDemo {
    public static void main(String[] args) {
    }
}


class DemoBoxWeight {
    public static void main(String[] args) {
    //BoxWeight myBox1 = new BoxWeight(10, 20, 15, 555);
    //BoxWeight myBox2 = new BoxWeight(2, 3, 4, 777);
    double vol;
    ColorBox myBox1 = new ColorBox(10, 20, 15, 555);
    ColorBox myBox2 = new ColorBox(2, 3, 4, 777);
    vol = myBox1.volume();
    System.out.println("Объем myBox1 равен " + vol);
    System.out.println("Вес myBox1 равен " + myBox1.color);
    System.out.println();

    vol = myBox2.volume();
    System.out.println("Объем myBox2 равен " + vol);
    System.out.println("Вес myBox2 равен " + myBox2.color);
    System.out.println();
    }
}

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        System.out.println("Объем plainbox равен " + plainbox.volume() + "depth= " + plainbox.depth + "type" + plainbox.getClass());
    }
*/

 
        
