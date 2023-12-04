class FixedStack implements IntStack {
    private int[] stck;
    private int tos;
// разместить в памяти и инициализировать стэк
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos==stck.length -1)
            System.out.println("Стэк полон");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Стэк опустошен");
            return 0;
        }
        else
            return stck[tos--];
    }
} 
class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
// поместить несколько чисел в строки
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);
//извлечь эти числа из стэков
        System.out.println("Стэк в mystack1: ");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стэк в mystack2: ");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}

