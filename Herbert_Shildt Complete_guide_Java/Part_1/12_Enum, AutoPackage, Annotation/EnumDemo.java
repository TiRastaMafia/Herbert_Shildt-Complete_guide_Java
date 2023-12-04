enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        // Вывести значения перечисления
        System.out.println("Значение ap: " + ap + "\n");
        ap = Apple.GoldenDel;
        //Сравнить два значения 
        if(ap == Apple.GoldenDel)
            System.out.println("ар содержит GoldenDel");
        switch(ap){
            case Jonathan:
            System.out.println("Яблоки содержат сорт Джонатан имеют красный цвет");
            break;
            case GoldenDel:
            System.out.println("Яблоки содержат сорт Голден делишес имеют желтый цвет");
            break;
            case RedDel:
            System.out.println("Яблоки содержат сорт Рэд делишес имеют красный цвет");
            break;
            case Winesap:
            System.out.println("Яблоки содержат сорт Вайнсап имеют красный цвет");
            break;
            case Cortland:
            System.out.println("Яблоки содержат сорт Кортланд имеют красный цвет");
            break;
        }


    }
}

