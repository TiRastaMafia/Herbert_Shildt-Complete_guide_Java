class FindPrime {
    public static void main(String[] args) {
        int num = 2;
        

        int msg = num % 2 == 0 ? num + 10 : num - 10;
        System.out.println(msg);    
    }
}
