class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще одна версия callback()");
        System.out.println("р в квадрате равно " + (p*p));
    }
} 
