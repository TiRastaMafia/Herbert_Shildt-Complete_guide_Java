class Client implements Callback {
    public void callback(int p) {
        System.out.println("Callback() вызывается с " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Классы, которые реализуют интерфейсы, " 
                + "Могут также определять и другие члены");
    }
}
