package p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("Конструктор класса из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}
