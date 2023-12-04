//еализовать РАСШИРЯЕМЫЙ стэк
class DynStack implements IntStack {
    private int[] stck;
    private int tos;
// Разместить в памяти и инициализировать стэк
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
// Поместить элемент в стэк
    public void push(int item) {
//Если стэк полон тогда создать стэк большего размера
        if(tos==stck.length-1) {
            int[] temp = new int[stck.length * 2]; // удвоить размер
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
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

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
//Эти циклы заставляют увеличиватся каждый стэк.
        for(int i=0; i<12; i++) mystack1.push(i);
        for(int i=0; i<20; i++) mystack2.push(i);

        System.out.println("Стэк в mystack1: ");
        for(int i=0; i<12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стэк в mystack2: ");
        for(int i=0; i<20; i++)
            System.out.println(mystack2.pop());
    }
}

class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузить в стэк с динамическим размером
        for(int i=0; i<12; i++) mystack.push(i);
        mystack = fs; // загрузить в стэк с фиксированным размером
        for(int i=0; i<8; i++) mystack.push(i);
        
        mystack = ds;
        System.out.println("Значения в стэке с динамическим размером: ");
        for(int i=0; i<12; i++) 
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Значения в стэке с фиксированным размером: ");
        for(int i=0; i<8; i++) 
            System.out.println(mystack.pop());
    }
}
