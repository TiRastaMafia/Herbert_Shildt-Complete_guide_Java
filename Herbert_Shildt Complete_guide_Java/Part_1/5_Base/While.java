class While {
    public static void main(String[] args){
        int n = 10000000;
        while(n > 0) {
            System.out.println("Импульс номер " + n);
            --n;
        }
    }
}
