class StackUn {
    private int[] stck;
    private int tos;
    //Разместить и инициализировать стэк.
    StackUn(int size) {
        stck = new int[size];
        tos= -1;
        }
    void push(int item) {
        if(tos==stck.length -1)
            System.out.println("Стэк полон");
        else
            stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
        System.out.println("Стэк опустошен");
        return 0;
        } 
        else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        StackUn mystack1 = new StackUn(5);
        StackUn mystack2 = new StackUn(9);

        for(int i=0; i<5; i++){
            System.out.println("Элемент на очереди " + i);
            mystack1.push(i);
        }
//        for(int i=0; i<5; i++) mystack1.push(i);


        for(int i=0; i<9; i++) mystack2.push(i);


        System.out.println("Стэк в mystack1: ");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стэк в mystack2: ");
        for(int i=0; i<9; i++)
            System.out.println(mystack2.pop());
 
    }
}
