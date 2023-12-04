class Break {
    public static void main(String[] args){
        boolean t = true;
        
        first: {
            second: {
                thrid: {
                    System.out.println("Перед оператором break.");
                    if(t) break second;
                    System.out.println("Этот оператор");
                }
                
                System.out.println("Этот оператор не выполнится.");
            }
                System.out.println("После блока Second.");
        }
    }
}
