/**class MyClass {
    int a, b;
    //Инициализировать a и b по отдельности
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    // Инициализировать a и b одним и тем же значением
    //
    MyClass(int i) {
        a = i;
        b = i;
    }
    // Предоставить a и b стандартные значения 0
    //

    MyClass() {
        a = 0;
        b = 0;
    }
}
_________________ равно ____________________*/

/**class MyClass {
    int id;
    String name;
    String course;

    public MyClass(int id, String name, String course){
    this.id = id;
    this.name = name;
    this.course = course;
    }
    @Override
    public String toString() {
        return "Student id = " + id + " " + name + " " + course;
    }

    public static void main(String[] args) {
        MyClass s1 = new MyClass(1234,"Sonya", "Java");
        System.out.println(s1);
    }
}
*/

class MyClass{
    int a;
    int b;

    MyClass(int i, int j) {
    a = i;
    b = j;
    this.a = a;
    this.b = b;
    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }

    

    @Override
    public String toString() {
        return "i = " + a + " j = " + b; 
    }

    public static void main(String[] args) {
        MyClass s1 = new MyClass();
        System.out.println(s1);
    }
}


